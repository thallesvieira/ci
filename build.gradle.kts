plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.3.3"
	id("io.spring.dependency-management") version "1.1.6"
	id("org.sonarqube") version "5.0.0.4638"
	id("jacoco")
}

group = "com.knowledge"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

//sonar {
//	properties {
//		property("sonar.projectKey", "ci-project")
//		property("sonar.projectName", "ci-project")
//		property("sonar.host.url", "http://localhost:9000")
//		property("sonar.token", "sqp_e26ee946250a3fb03b3fa7eaba2d55ec960ccb70")
//		property("sonar.junit.reportPaths", "build/test-results/test")
//	}
//}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
