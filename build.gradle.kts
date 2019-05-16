plugins {
    java
}

group = "xyz.easy-coding"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("com.fasterxml.jackson.core", "jackson-databind","2.9.8")
    testCompile("junit", "junit", "4.12")
    testCompile("commons-io", "commons-io", "2.6")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}