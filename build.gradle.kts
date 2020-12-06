plugins {
  kotlin("jvm") version "1.4.20"
  kotlin("kapt") version "1.4.20"
}

repositories {
  mavenCentral()
  jcenter()
  maven(url = "https://dl.bintray.com/arrow-kt/arrow-kt/")
  maven(url = "https://oss.jfrog.org/artifactory/oss-snapshot-local/") // for SNAPSHOT builds
}

val arrowVersion = "0.11.0"

dependencies {
  // Align versions of all Kotlin components
  implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

  // Use the Kotlin JDK 8 standard library.
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  implementation("io.arrow-kt:arrow-core:$arrowVersion")
  implementation("io.arrow-kt:arrow-syntax:$arrowVersion")
  kapt("io.arrow-kt:arrow-meta:$arrowVersion")

  // Use the Kotlin test library.
  testImplementation("org.jetbrains.kotlin:kotlin-test")

  // Use the Kotlin JUnit integration.
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
