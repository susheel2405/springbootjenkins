FROM openjdk:17-jdk-alpinegi
COPY . /app

CMD ["java" , "com.neoteric.learning.method.App"]
