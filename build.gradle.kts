plugins {
    java
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // TestNG
    testImplementation("org.testng:testng:7.12.0")

    // Selenium
    implementation("org.seleniumhq.selenium:selenium-java:4.41.0")
}

tasks.test {
    useTestNG()
}

application {
    mainClass.set("org.example.Main")
}