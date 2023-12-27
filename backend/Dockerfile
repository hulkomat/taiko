# Stage 1: Build the application with Gradle
FROM gradle:jdk21 AS builder

WORKDIR /app

# Copy build.gradle and settings.gradle
COPY build.gradle settings.gradle ./

# Copy the source code
COPY src ./src

# Build the application with Gradle
RUN gradle assemble

# Stage 2: Run the application on Java 21
FROM amazoncorretto:21

WORKDIR /app

# Copy the built application from the previous stage
COPY --from=builder /app/build/libs/*.jar ./app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Health check
HEALTHCHECK --interval=25s --timeout=3s --retries=2 CMD curl -f http://localhost:8080/actuator/health || exit 1

# Run the application
CMD ["java", "-jar", "app.jar"]

