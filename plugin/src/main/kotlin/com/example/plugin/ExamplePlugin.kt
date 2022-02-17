package com.example.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ExamplePlugin: Plugin<Project> {
  override fun apply(target: Project) {
    val extension = target.extensions.create("example", ExampleExtension::class.java)

    target.tasks.create("exampleTask").apply {
      doLast {
        println("Hello ${extension.greeting}")
      }
    }
  }
}

open class ExampleExtension {
  var greeting: String = "defaultGreeting"
}