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

        testImplementation("junit:junit:4.13")
    }

    tasks.test {
        useJUnit()
    }

    }


