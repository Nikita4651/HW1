plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"

    repositories {
        mavenCentral()
    }

    dependencies {

            testImplementation("org.testng:testng:7.1.0")


        tasks.test {
            useTestNG()
        }

    }


}