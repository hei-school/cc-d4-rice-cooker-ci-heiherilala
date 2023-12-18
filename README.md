# Rice Cooker Simulation

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed
- Apache Maven (for building and managing dependencies)

## Description

This project implements a command-line interface (CLI) application simulating a rice cooker. The application allows users to choose from various recipes (e.g., rice, hot water, soup), prepare ingredients, and view a recipe summary. It follows object-oriented programming (OOP) principles, utilizes the Google Java Style Guide, and incorporates input validation.

## Installation

1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/your-username/rice-cooker.git
    cd rice-cooker
    ```

2. Build the project using Maven:
    ```bash
    mvn clean install
    ```

## Execution

Run the application using the following command:
  ```bash
  java -jar target/rice-cooker-1.0-SNAPSHOT.jar
  ```

## Coding Standard

This project adheres to the Google Java Style Guide for code formatting, naming conventions, and structure. Ensure your contributions maintain this standard.

## Linter

It is recommended to use Checkstyle for linting. A Checkstyle configuration file (checkstyle.xml) is provided in the project root. You can run Checkstyle using the following Maven command:

    mvn checkstyle:check

