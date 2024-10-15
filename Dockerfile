FROM maven:3.9.2-eclipse-temurin-17 AS build

# Configura o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo pom.xml e baixa as dependências do projeto
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o restante dos arquivos do projeto
COPY src ./src

# Expõe a porta padrão da aplicação Spring Boot
EXPOSE 8080

# Habilita as ferramentas de desenvolvimento do Spring Boot (DevTools)
RUN mvn clean package -DskipTests

# Instala um mecanismo para monitorar mudanças no código e reiniciar o app automaticamente
RUN mvn spring-boot:run

# Comando padrão para iniciar o serviço no modo de desenvolvimento
CMD ["mvn", "spring-boot:run", "-Dspring-boot.run.profiles=dev"]