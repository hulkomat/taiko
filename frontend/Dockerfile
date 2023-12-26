# Use the official nginx image as the base image
FROM nginx:alpine

# Copy the build output from the dist folder to the nginx html directory
COPY dist /usr/share/nginx/html

# Add a healthcheck to ensure the container is healthy
HEALTHCHECK --interval=30s --timeout=3s \
    CMD curl -f http://localhost/ || exit 1
