package com.example.integration.test

import org.gradle.testkit.runner.GradleRunner
import org.gradle.testkit.runner.TaskOutcome
import org.junit.Test
import java.io.File

class IntegrationTest {
  @Test
  fun integrationTest() {
    val result = GradleRunner.create()
      .withProjectDir(File("../test-project"))
      .withArguments("exampleTask")
      .forwardOutput()
      .build()

    assert(result.task(":exampleTask")?.outcome == TaskOutcome.SUCCESS)
    assert(result.output.contains("Hello World"))
  }
}