# Rice Cooker Simulation

## Prerequisites

- Java Development Kit (JDK) 17 or higher installed
- Apache Maven (for building and managing dependencies)

## Description

This project implements a command-line interface (CLI) application simulating a rice cooker. The application allows users to choose from various recipes (e.g., rice, hot water, soup), prepare ingredients, and view a recipe summary. It follows object-oriented programming (OOP) principles, utilizes the Google Java Style Guide, and incorporates input validation.

## Installation

1. Clone the repository to your local machine:

2. Build the project using Gradel:
    - Install Gradel
        - On Unix-like systems

                /gradlew

        - On Windows

                gradlew.bat
    - Build the project using Gradle
        - On Unix-like systems

                /gradlew build

        - On Windows

                gradlew.bat build

    - Reload all packages
        - On Unix-like systems

                /gradlew --refresh-dependencies

        - On Windows

                gradlew.bat --refresh-dependencies

## Execution

Run directly "RiceCookerApp" by your IDE

## Coding Standard

This project adheres to the Google Java Style Guide for code formatting, naming conventions, and structure. Ensure your contributions maintain this standard.

## Linter

It is recommended to use Checkstyle for linting. A Checkstyle configuration file (checkstyle.xml) is provided in the project root. You can run Checkstyle using the following Maven command:

    ./gradlew checkstyleMain checkstyleTest


## format

You just need to run script : 

        ./format.sh

## Test

Run directlt test in Gradle

        ./gradlew test


## CI

here's an example of a successful CI we have with CircleCI

<img
  src="/image/java.png"
  alt="CircleCI succes example"
  title="CircleCI succes example">