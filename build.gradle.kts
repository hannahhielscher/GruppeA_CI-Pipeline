/*
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

 */
plugins {
    kotlin("multiplatform") version "1.5.31"
    id("org.jetbrains.compose") version "1.6.0"
    kotlin("jvm") version "1.5.31" // Stelle sicher, dass dies kompatibel ist
    kotlin("plugin.serialization") version "1.5.31" // Stelle sicher, dass dies kompatibel ist
    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"

}


repositories {
    mavenLocal()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
    google()
}
