plugins {
    id("java")
}

group = "ua.opnu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("com.h2database:h2:2.2.224")
    implementation("org.flywaydb:flyway-core:10.17.0")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

tasks.test {
    useJUnitPlatform()
}