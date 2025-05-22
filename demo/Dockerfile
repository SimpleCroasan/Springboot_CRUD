# Etapa de construcción con Maven y Temurin
FROM eclipse-temurin:17-jdk-jammy AS builder

# Instalar Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

# Copiar los archivos del proyecto
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Construir la aplicación
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM eclipse-temurin:17-jre-jammy

# Puerto que expone la aplicación
EXPOSE 8080

# Copiar el JAR construido desde la etapa anterior
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]