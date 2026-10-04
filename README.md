

## Description

This project is a mobile automation testing project developed using Java, Appium, TestNG, and Gradle.

The automation focuses on testing the following main scenarios:

- Valid user login
- Add product to cart
- End-to-end flow from login to adding a product to cart

The application under test is Sauce Labs MyDemoApp running on an Android Emulator.



## Tech Stack

- Java
- Appium
- Appium Java Client
- TestNG
- Gradle
- Android Emulator
- Appium Inspector
- IntelliJ IDEA

---

## Project Structure

```text
AppiumAutomationSauce
│
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── README.md
│
└── src
    └── test
        └── java
            │
            ├── base
            │   └── BaseTest.java
            │
            ├── pages
            │   ├── BasePage.java
            │   ├── HomePage.java
            │   ├── LoginPage.java
            │   └── ProductPage.java
            │
            └── test
                ├── LoginTest.java
                ├── AddToCartTest.java
                └── EndToEndTest.java