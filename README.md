# Mobile Automation Project * . + 

This is a project for **mobile test automation**.
It uses **Java**, **Appium**, **TestNG**, and the **Page Object Model (POM)**.

The project tests an Android app:

* Navigation
* Login and Sign Up
* Swipe cards and swipe vertically
  
---

## Tools used

* **Java 17**
* **Appium** (mobile automation tool)
* **TestNG** (test framework)
* **Maven** (build tool)
* **Appium Inspector** for identify the locators
* **Page Factory** for find the locators

---

## Project structure

```
src/test/java/com/globant/mobile
│
├── screens        # Page Object classes (each screen of the app)
├── tests          # Test classes
├── utils          # Helper classes (ex: DataUtils, BaseTest)
```

---

## How to run the tests

### 1. Install requirements

* Install **Java 17**
* Install **Maven**
* Install **Node.js**
* Install **Appium Server** (latest version)
* Install **Android Studio** with emulator or connect a real device
* Download the **test application** (APK) and update the path in BaseTest class

### 2. Start Appium server

In a terminal:

```bash
appium
```

### 3. Start emulator or connect device

Open Android Studio emulator or plug in your Android phone (with USB debugging).

### 4. Run the tests

In a terminal, inside the project folder:

```bash
mvn clean test
```

### 5. Check results

* Tests run with **TestNG**.
* Results will be shown in the console.
* If you use an IDE (IntelliJ, Eclipse), you can also run each test class from the IDE.

---

## Tests

* **LoginTest** → create new user and login.
* **SignUpTest** → check sign up with random email.
* **NavigationTest** → go through bottom menu screens.
* **SwipeTest** → swipe cards and verify last card, then find “You found me!!!”.

---
# Author
Valentina Londoño Dueñas :)

