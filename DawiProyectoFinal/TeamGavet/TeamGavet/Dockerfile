# Usa una imagen de OpenJDK 17 para compilar
FROM openjdk:17-jdk-slim AS build
WORKDIR /app

# Copia el código fuente al contenedor
COPY . .

# Da permisos de ejecución a Maven Wrapper y compila la aplicación
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Usa una imagen más ligera para ejecutar la aplicación
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia el JAR compilado desde la fase de construcción
COPY --from=build /app/target/*.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
