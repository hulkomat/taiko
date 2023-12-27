### STAGE 1: Build ###
FROM node:alpine AS build
WORKDIR /usr/src/app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

# ### STAGE 2: Run ###
# FROM nginx:alpine
# COPY default.conf /etc/nginx/conf.d/default.conf
# COPY --from=build /usr/src/app/dist/frontend /usr/share/nginx/html
# EXPOSE 80

# use the latest version of the official nginx image as the base image
FROM nginx:latest
# copy the custom nginx configuration file to the container in the 
# default location
COPY default.conf /etc/nginx/nginx.conf
# copy the built Angular app files to the default nginx html directory
COPY /dist/frontend /usr/share/nginx/html


#### OLD ####
# # Use the official nginx image as the base image
# FROM nginx:alpine

# COPY ./nginx.conf /etc/nginx/nginx.conf

# # Copy the build output from the dist folder to the nginx html directory
# COPY dist /srv/www

# # COPY default.config /etc/nginx/sites-available/default

# EXPOSE 80/tcp

# CMD ["/usr/sbin/nginx", "-g", "daemon off;"]

# # Add a healthcheck to ensure the container is healthy
# HEALTHCHECK --interval=30s --timeout=3s \
#     CMD curl -f http://localhost/ || exit 1
