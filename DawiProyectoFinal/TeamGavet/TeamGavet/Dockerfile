# Usa una imagen oficial con Java 17 y Maven preinstalado
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia el código fuente
COPY . .

# Verifica que el wrapper de Maven existe
RUN ls -la

# Da permisos de ejecución al wrapper de Maven
RUN chmod +x mvnw

# Compila el proyecto
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

