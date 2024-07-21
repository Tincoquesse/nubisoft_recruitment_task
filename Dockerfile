FROM amazoncorretto:21-alpine-jdk
LABEL authors="macbookpro"
COPY build/libs/nubisoft_recruitment_task.jar nubisoft_recruitment_task.jar
ENTRYPOINT ["java","-jar","nubisoft_recruitment_task.jar"]
