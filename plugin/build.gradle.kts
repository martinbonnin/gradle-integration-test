plugins {
  id("org.jetbrains.kotlin.jvm").version("1.6.10")
  id("java-gradle-plugin")
}

repositories {
  mavenCentral()
}

gradlePlugin {
  plugins {
    create("examplePlugin") {
      id = "com.example"
      displayName = "Example Plugin"
      description = "Does stuff"
      implementationClass = "com.example.plugin.ExamplePlugin"
    }
  }
}