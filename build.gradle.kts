plugins {
    id("java")
}

group = "me.raven"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven ("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven ("https://jitpack.io")
    maven ("https://libraries.minecraft.net/")
    maven ("https://repo.codemc.io/repository/maven-public/")
    maven ("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven ("https://repo.dmulloy2.net/repository/public/")
    maven ("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven ("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    compileOnly("org.projectlombok:lombok:1.18.26")
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("me.clip:placeholderapi:2.11.2")

    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("de.tr7zw:item-nbt-api:2.11.3")
    implementation("com.google.guava:guava:32.0.0-jre")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("dev.jorel:commandapi-bukkit-shade:9.0.3")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}