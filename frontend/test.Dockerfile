# Use the official Node.js image as the base image
FROM node

# Set the working directory inside the container
WORKDIR /app

# Copy the package.json and package-lock.json files to the working directory
COPY package*.json ./

# Install the dependencies
RUN npm install

# Copy the entire application to the working directory
COPY . .

# Expose the default port for the Angular application
EXPOSE 4200

# Start the Angular application with nx serve
CMD ["npm", "run", "start"]
