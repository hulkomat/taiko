FROM amazoncorretto:21.0.1-al2023-headless

COPY build/libs/taiko-0.0.1-SNAPSHOT.jar /app/backend.jar

CMD ["java", "-jar", "/app/backend.jar"]

HEALTHCHECK --interval=30s --timeout=3s \
    CMD curl -f http://localhost:8080/actuator/health || exit 1
