plugins {
    java
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.4"
    id("com.diffplug.spotless") version "6.23.3"
}

group = "blog.jadmak"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation("com.google.guava:guava:32.1.3-jre")
    implementation("org.eclipse.collections:eclipse-collections-api:11.1.0")
    implementation("org.eclipse.collections:eclipse-collections:11.1.0")
}

spotless {
    java {
        googleJavaFormat()
    }
}

tasks.check {
    dependsOn("spotlessCheck")
}

tasks.build {
    dependsOn("spotlessApply")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
