plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation(project(":file-searcher"))

    implementation(libs.picocli)
    annotationProcessor(libs.picocli.codegen)

    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "com.codigofacilito.jenv.JEnv"
}

tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-Aproject=${project.group}/${project.name}")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
