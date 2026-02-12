🚀 Enterprise-Grade Selenium-Java Automation Framework

A robust, scalable, and highly optimized automation ecosystem designed for high-performance testing of web applications and microservices. Built with a focus on Thread Safety, Maintainability, and Seamless CI/CD Integration.

🛠️ Advanced Technical Capabilities
As an SDET 2, this framework implements industry-standard design patterns and engineering practices:
⚡ Performance & Scalability
Thread-Safe Execution: Engineered using ThreadLocal<WebDriver> to support concurrent testing across multiple browsers without session interference.
Headless Execution Support: Optimized for cloud environments and CI pipelines to reduce execution time and resource consumption.

🧪 Robust Test Design
Hybrid Architecture: Seamless integration of Cucumber BDD for business logic and TestNG for powerful execution control.
Page Object Model (POM): Strict adherence to POM with a fluent interface for readable and maintainable test scripts.
Custom Listeners: Automated failure analysis with dynamic screenshot capturing and retry logic for flaky tests.

🔗 API Automation & Integration
Schema-Driven Testing: Rest-Assured implementation featuring JSON Schema Validation to ensure contract integrity.
POJO Excellence: Utilizes Serialization and Deserialization (Jackson) for clean, type-safe API request/response handling.

🤖 DevOps & Observability
GitHub Actions Workflow: Fully automated CI pipeline with daily cron triggers and manual dispatch options.
Centralized Logging: Integrated Log4j2 for granular execution tracing, essential for debugging remote pipeline failures.

🏗️ Project Architecture
src/main/java
  ├── pages # High-level Page Objects
  ├── models # POJO Blueprints for API payloads
  └── utils # ThreadLocal Factory, Config Management, Listeners

src/test/java
  ├── stepdefinitions # Gherkin implementation
  ├── runners # Parallel execution configurations
  └── api.tests # Contract and Functional API suites

src/test/resources
  ├── features # Complex business scenarios
  └── test-data # External JSON payloads & Schemas
  
🛠️ Tech Stack
Core: Java 17 (Advanced Stream API & Lambdas for data manipulation).
Web: Selenium WebDriver 4.x.
API: Rest-Assured.
Build: Maven.
Reporting: Allure / Extent Reports with detailed step-by-step logs.

🚀 Execution Commands
Standard Test Run:
mvn clean test
Parallel Execution via TestNG:
mvn test -DsuiteXmlFile=testng_parallel.xml


