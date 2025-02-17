
# Usa una imagen ligera con solo Java para correr la app
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR desde la etapa de compilación
COPY --from=build /app/target/*.jar app.jar

# Expone el puerto
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

