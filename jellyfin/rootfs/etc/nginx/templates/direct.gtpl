server {
    listen {{ .port }} default_server;

    include /etc/nginx/includes/server_params.conf;
    include /etc/nginx/includes/proxy_params.conf;

    # Served from the root here, so nothing that makes the Ingress path work
    # applies and Jellyfin's own login is what guards it.
    proxy_redirect off;

    location / {
        proxy_pass http://backend;
    }
}

{{ if .ssl }}
server {
    listen {{ .ssl_port }} default_server ssl;
    http2 on;

    include /etc/nginx/includes/server_params.conf;
    include /etc/nginx/includes/proxy_params.conf;
    include /etc/nginx/includes/ssl_params.conf;

    ssl_certificate /ssl/{{ .certfile }};
    ssl_certificate_key /ssl/{{ .keyfile }};

    proxy_redirect off;

    location / {
        proxy_pass http://backend;
    }
}
{{ end }}
