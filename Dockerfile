FROM openjdk:17-jdk-slim
WORKDIR /app
COPY ["out/artifacts/BANK_OF_KIGALI_SYSTEM_jar/BANK_OF_KIGALI_SYSTEM.jar", "app.jar"]
CMD ["java", "-jar", "app.jar"]