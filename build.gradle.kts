plugins {
    id("java")
    kotlin("jvm") version "2.1.0"
    id("fabric-loom") version "1.9-SNAPSHOT"
}

group = "com.harleylizard"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings(loom.officialMojangMappings())

    modImplementation("net.fabricmc:fabric-loader:0.16.9")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.114.0+1.21.1")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.13.0+kotlin.2.1.0")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}