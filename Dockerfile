# #Create a docker file for my spring boot application with maven java 17 as base image
# FROM maven:3.8.2-openjdk-17-slim as build
# # set the working directory
# WORKDIR /app
# # copy the pom.xml file
# COPY pom.xml .
# # copy the source code
# COPY src ./src
# # build the application
# RUN mvn clean package -DskipTests
# # create a new image
# FROM openjdk:17
# # set the working directory
# WORKDIR /app
# # copy the jar file from the build stage
# COPY --from=build /app/target/*.jar app.jar
# # expose port 8080
# EXPOSE 8080
# # run the application
# ENTRYPOINT ["java","-jar","/app/app.jar"]

# For gitlab-ci

FROM openjdk:17
# WORKDIR /app
# copy the jar file from the build stage
COPY target/*.jar app.jar
# expose port 8080
EXPOSE 8080
# run the application
ENTRYPOINT ["java","-jar","/app/app.jar"]
