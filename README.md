# pf4j-kotlin-symbol-processing

Extension for the `kotlin-maven-plugin` to support Kotlin Symbol Processing (KSP) that processes Extension annotation used by PF4J framework.

## Licence
[![License](https://img.shields.io/badge/license-apache%202.0-60C060.svg)](https://choosealicense.com/licenses/apache-2.0/)

## Release

[![Release Artifacts](https://maven-badges.herokuapp.com/maven-central/care.better.pf4j/pf4j-kotlin-symbol-processing/badge.svg)](https://search.maven.org/artifact/care.better.pf4j/pf4j-kotlin-symbol-processing)

### Usage with Maven

Define the PF4J dependency in your pom.xml:

```xml

<dependency>
    <groupId>org.pf4j</groupId>
    <artifactId>pf4j</artifactId>
    <version>3.3.1</version>
</dependency>

```

Define the kotlin-maven-plugin in your pom.xml:

```xml

<plugin>
    <groupId>org.jetbrains.kotlin</groupId>
    <artifactId>kotlin-maven-plugin</artifactId>
    <version>2.0.0</version>
    <executions>
        <execution>
            <id>compile</id>
            <phase>compile</phase>
            <goals>
                <goal>compile</goal>
            </goals>
        </execution>
        <execution>
            <id>test-compile</id>
            <phase>test-compile</phase>
            <goals>
                <goal>test-compile</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <jvmTarget>17</jvmTarget>
        <compilerPlugins>
            <compilerPlugin>ksp</compilerPlugin>
        </compilerPlugins>
    </configuration>
    <dependencies>
        <dependency>
            <groupId>com.dyescape</groupId>
            <artifactId>kotlin-maven-symbol-processing</artifactId>
            <version>1.6</version>
        </dependency>
        <dependency>
            <artifactId>pf4j-kotlin-symbol-processing</artifactId>
            <groupId>care.better.pf4j</groupId>
            <version>2.0.10-1.0.1</version>
        </dependency>
    </dependencies>
</plugin>
```

### Usage with Gradle

Define Gradle plugin portal to provide easy access to both core and community plugins:

```kotlin
pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}
```

Apply the com.google.devtools.ksp plugin with the specified version and pf4j-kotlin-symbol-processor to the list of dependencies:

```kotlin
plugins {
    id("com.google.devtools.ksp") version "2.0.10-1.0.24"
}

dependencies {
    implementation("org.pf4j:pf4j:3.3.1")
    ksp("care.better.pf4j:pf4j-kotlin-symbol-processing:2.0.10-1.0.1")
}
```