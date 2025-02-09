# Usa una imagen de OpenJDK 17
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia el JAR generado por Maven
COPY target/*.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
