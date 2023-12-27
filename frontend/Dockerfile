# Stage 1: Build Angular application
FROM node:latest AS builder
WORKDIR /app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build

# Stage 2: Run application with Nginx
FROM nginx:latest
COPY --from=builder /app/dist /usr/share/nginx/html
COPY default.conf /etc/nginx/conf.d/default.conf
HEALTHCHECK --interval=30s --timeout=3s CMD curl --fail http://localhost/ || exit 1
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
