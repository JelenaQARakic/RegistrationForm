# RegistrationForm
# RegistrationForm using Xpath
# Testing bugs
# Negative Test case PIB
README for Git Repository
Project Overview
This README provides information about running test for Successfull Registration Form on Halo oglasi.com, testing registration form .
This repository contains a Java project developed using the following technologies:

    Java version: "14.0.2" (2020-07-14)
        Java(TM) SE Runtime Environment (build 14.0.2+12-46)
        Java HotSpot(TM) 64-Bit Server VM (build 14.0.2+12-46, mixed mode, sharing)
    IntelliJ IDEA 2021.3.1 (Community Edition)
        Build #IC-213.6461.79, built on December 28, 2021
        Runtime version: 11.0.13+7-b1751.21 amd64
        VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
    Windows 10 10.0
    GC: G1 Young Generation, G1 Old Generation
    Memory: 2048M
    Cores: 8
    Chrome browser Version 117.0.5938.92 (Official Build) (64-bit)
    Kotlin: 213-1.5.10-release-949-IJ6461.79

Development Environment Setup

To set up your development environment, follow these steps:
1. Install IntelliJ IDEA

Download and install IntelliJ Community Edition from here.
2. Install Java Development Kit (JDK)

Download the JDK for Windows from here. Accept the terms of use and select the appropriate JDK version for Windows.
3. Configure Java JDK Path (Optional)

4. Create a Maven Project in IntelliJ

Follow these steps to create a Maven project in IntelliJ. You can also refer to this video tutorial for guidance:

    Create a new Maven project.
    Add the following dependencies to your project's pom.xml file:

xml

<dependencies>
    <!-- JUnit dependency -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.1</version>
        <scope>test</scope>
    </dependency>
    <!-- Selenium dependency -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <!-- WebDriverManager dependency -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>4.3.1</version>
    </dependency>
</dependencies>

5. Download ChromeDriver

Download the ChromeDriver from this link (make sure to match the version with your Chrome browser).
Project Structure

The project is organized into the following packages:

    base: Contains base classes and configurations.
    page: Includes page objects for your application.
    test: Contains test classes.
