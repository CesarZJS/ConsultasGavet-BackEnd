# Usa una imagen oficial con Java 17 y Maven preinstalado
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia el código fuente
COPY . .

# Verifica los archivos en el directorio (opcional para depuración)
RUN ls -la

# Si existe mvnw, dale permisos de ejecución
RUN chmod +x mvnw || echo "No se encontró mvnw, continuando..."

# Compila el proyecto usando el wrapper de Maven
RUN ./mvnw clean package -DskipTests

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

