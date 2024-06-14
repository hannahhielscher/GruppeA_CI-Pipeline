/*
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

 */
plugins {
    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
}


repositories {
    mavenLocal()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
    google()
}
