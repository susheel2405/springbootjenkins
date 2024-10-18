FROM openjdk:17-jdk-alpine
COPY . /app

CMD ["java" , "com.neoteric.learning.method.App"]
