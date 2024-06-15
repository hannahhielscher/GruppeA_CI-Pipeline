/*
buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

 */
plugins {
    kotlin("jvm") version "1.5.31" apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
}


repositories {
    mavenLocal()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
    google()
}
