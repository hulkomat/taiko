# Use the official nginx image as the base image
FROM nginx:alpine

COPY ./nginx.conf /etc/nginx/nginx.conf

# Copy the build output from the dist folder to the nginx html directory
COPY dist /srv/www

# COPY default.config /etc/nginx/sites-available/default

EXPOSE 80/tcp

CMD ["/usr/sbin/nginx", "-g", "daemon off;"]

# Add a healthcheck to ensure the container is healthy
HEALTHCHECK --interval=30s --timeout=3s \
    CMD curl -f http://localhost/ || exit 1
