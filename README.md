# Rice Cooker CLI

## Prerequisites
- Python 3.x
- `pip` package manager

## Description
This project is a command-line interface (CLI) application simulating a rice cooker. It allows users to choose recipes, add ingredients, and initiate the cooking process. The application follows a modular and object-oriented design, promoting clean code practices.

## Installation
1. Clone the repository:

2. Install dependencies:

        pip install -r requirements.txt
        pip install flake8 black

## Execution

Run the main script to start the CLI application:

    python main.py

## Coding Standard (PEP 8)

The project follows the PEP 8 coding style guide for Python. It ensures consistency and readability in the codebase.

## Linter

The project uses flake8 as a linter to enforce PEP 8 standards. Run the linter with the following command:

    flake8 .

## Formatage

Formatage avec :

    black .

## Test

Run all test file :

    python test_cooker.py 
    python test_ingredients.py 


## CI

here's an example of a successful CI we have with CircleCI

<img
  src="/image/python.png"
  alt="CircleCI succes example"
  title="CircleCI succes example">