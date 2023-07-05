plugins {
    id("java")
    id ("java-library")
    id ("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("com.eclipsesource.minimal-json:minimal-json:0.9.5")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("com.amazonaws:aws-lambda-java-core:1.2.2")
    implementation ("com.amazonaws:aws-lambda-java-events:3.11.1")
    runtimeOnly ("com.amazonaws:aws-lambda-java-log4j2:1.5.1")
}

tasks.test {
    useJUnitPlatform()
}