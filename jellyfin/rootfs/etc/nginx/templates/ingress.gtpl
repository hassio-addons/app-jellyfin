server {
    listen {{ .interface }}:{{ .port }} default_server;

    include /etc/nginx/includes/server_params.conf;
    include /etc/nginx/includes/proxy_params.conf;

    location / {
        allow   172.30.32.2;
        deny    all;

        # Jellyfin sends the browser on to the web client with a relative
        # redirect, and the client resolves everything it asks for afterwards
        # against the page it was served from, so the Ingress path stays on the
        # front of all of it without a single response having to be rewritten.
        #
        # A request for a directory that arrives without its trailing slash is
        # the exception. Those are answered with an address built from the site
        # root, which no longer has the Ingress path on it, so it is put back
        # here. Both directives belong inside this block rather than beside the
        # ones above: at server level, NGINX still rebuilds the result around
        # its own listening port, which is not the port the browser is talking
        # to.
        absolute_redirect off;
        proxy_redirect http://$http_host/ $http_x_ingress_path/;
        proxy_redirect https://$http_host/ $http_x_ingress_path/;
        proxy_redirect / $http_x_ingress_path/;

        proxy_pass http://backend;
    }
}
