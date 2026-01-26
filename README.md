# 🚀 Hybrid Automation Framework (Java)

![Build Status](https://github.com/nishantSDET-95/Hybrid-Automation-Framework-Java/actions/workflows/sdet-tests.yml/badge.svg)




A professional-grade SDET framework built for automated API and UI testing. This project demonstrates a robust CI/CD integration using GitHub Actions, ensuring every code change is validated automatically.

## 🌟 Key Features
* **Hybrid Architecture:** Supports both UI (Selenium) and API (Rest-Assured) automation.
* **CI/CD Integrated:** Fully configured with GitHub Actions to run tests on every push.
* **Data Driven:** Integrated with libraries like Java Faker for dynamic test data generation.
* **Clean Code:** Uses Project Lombok to reduce boilerplate code and improve readability.
* **Maven Managed:** Easy dependency management and build execution.

## 🛠 Tech Stack
* **Language:** Java 17
* **Testing Framework:** TestNG
* **API Testing:** Rest-Assured
* **UI Testing:** Selenium WebDriver
* **Build Tool:** Maven
* **Infrastructure:** GitHub Actions (Ubuntu Runner)

## 📁 Project Structure
```text
src/test/java/
└── api/
    ├── base/    # Base setup for API tests
    ├── tests/   # Actual Test Cases (e.g., LosApiTest.java)
    └── utils/   # Reusable Utility classes (e.g., ApiUtils.java)
.github/workflows/
└── sdet-tests.yml # CI/CD Pipeline configuration
