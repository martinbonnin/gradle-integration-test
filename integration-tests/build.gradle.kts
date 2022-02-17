plugins {
  id("org.jetbrains.kotlin.jvm").version("1.6.10")
}

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(gradleTestKit())
  testImplementation("junit:junit:4.13.2")
}