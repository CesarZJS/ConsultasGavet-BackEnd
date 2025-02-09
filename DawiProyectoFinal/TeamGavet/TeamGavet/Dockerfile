# Usa una imagen de OpenJDK 17
FROM openjdk:17-jdk-slim AS build
WORKDIR /app

# Copia el código fuente al contenedor
COPY . .

# Da permisos de ejecución a Maven Wrapper y construye la aplicación
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Segunda fase: imagen final más ligera
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia el JAR desde la fase de construcción
COPY --from=build /app/target/*.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
