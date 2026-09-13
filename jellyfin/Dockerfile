ARG BUILD_FROM=ghcr.io/hassio-addons/debian-base:9.4.0
# hadolint ignore=DL3006
FROM ${BUILD_FROM}

# Set shell
SHELL ["/bin/bash", "-o", "pipefail", "-c"]

# Setup base
ARG JELLYFIN_VERSION="12.0"

# hadolint ignore=DL3008
RUN \
    apt-get update \
    && apt-get install -y --no-install-recommends \
        gpg=2.4.7-21+deb13u1+b5 \
    \
    && mkdir -p /etc/apt/keyrings \
    && curl -fsSL https://repo.jellyfin.org/jellyfin_team.gpg.key \
        | gpg --dearmor -o /etc/apt/keyrings/jellyfin.gpg \
    \
    && echo "deb [signed-by=/etc/apt/keyrings/jellyfin.gpg] https://repo.jellyfin.org/debian trixie main" \
        > /etc/apt/sources.list.d/jellyfin.list \
    \
    && apt-get update \
    && apt-get install -y --no-install-recommends \
        fonts-noto-cjk=1:20240730+repack1-1 \
        jellyfin-ffmpeg7=7.1.4-3-trixie \
        jellyfin-server="${JELLYFIN_VERSION}+deb13" \
        jellyfin-web="${JELLYFIN_VERSION}+deb13" \
        libdrm2=2.4.124-2 \
        nginx=1.26.3-3+deb13u8 \
        xmlstarlet>="1.6.1-4" \
    \
    && apt-get -y clean \
    && rm -f -r \
        /etc/nginx \
        /tmp/* \
        /var/{cache,log}/* \
        /var/lib/apt/lists/*

# Copy root filesystem
COPY rootfs /

# Health check
HEALTHCHECK \
    CMD curl --silent --fail http://127.0.0.1:48096/health || exit 1

# Build arguments
ARG BUILD_ARCH
ARG BUILD_DATE
ARG BUILD_DESCRIPTION
ARG BUILD_NAME
ARG BUILD_REF
ARG BUILD_REPOSITORY
ARG BUILD_VERSION

# Labels
LABEL \
    io.hass.name="${BUILD_NAME}" \
    io.hass.description="${BUILD_DESCRIPTION}" \
    io.hass.arch="${BUILD_ARCH}" \
    io.hass.type="addon" \
    io.hass.version=${BUILD_VERSION} \
    maintainer="Franck Nijhof <opensource@frenck.dev>" \
    org.opencontainers.image.title="${BUILD_NAME}" \
    org.opencontainers.image.description="${BUILD_DESCRIPTION}" \
    org.opencontainers.image.vendor="Home Assistant Community Apps" \
    org.opencontainers.image.authors="Franck Nijhof <opensource@frenck.dev>" \
    org.opencontainers.image.licenses="MIT" \
    org.opencontainers.image.url="https://frenck.dev/home-assistant-apps" \
    org.opencontainers.image.source="https://github.com/${BUILD_REPOSITORY}" \
    org.opencontainers.image.documentation="https://github.com/${BUILD_REPOSITORY}/blob/main/README.md" \
    org.opencontainers.image.created=${BUILD_DATE} \
    org.opencontainers.image.revision=${BUILD_REF} \
    org.opencontainers.image.version=${BUILD_VERSION}
