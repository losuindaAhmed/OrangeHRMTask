# OrangeHRM Demo Test Automation (java-selenium) 
This project automates login scenarios for the OrangeHRM Demo website .
## Project Overview
The task focuses on testing various login scenarios (both valid and invalid) . 
## 🚀 Getting Started

### 🚧 Prerequisites
Before you can run this project, you must have the following software installed on your computer:

- Java Development Kit (JDK) version 11 or later
- Apache Maven
- Google Chrome web browser
 -Valid account on the OrangeHRM Demo website
  -Eclipse IDE.

### 🔗 Dependencies

This project uses the following dependencies:

- Selenium Java version 4.13.0
- Webdrivermanager version 5.5.3
- TestNG version 7.7.0
- maven-surefire-plugin version 3.4.0
- maven-compiler-plugin version 3.13.0
- extentreports 5.1.2
  
## Installation
### Clone

- Clone this repository to your local machine using the command below:
```
	$ git clone https://github.com/losuindaAhmed/OrangeHRMTask.git
```
### 🌐 Application under test
**OrangeHRM Demo Website**:https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
     -Note that this website is being used for testing 
 ### 👨🏼‍🔬Tests 
 The task is divided into 3 parts:
 Part 1: Successful Login
- **Objective**: Verify that a valid user can successfully log in to the system.
- Part 2: Invalid Login Scenarios
- **Objective**: Test various invalid login scenarios.
- Part 3: Both Fields Empty
  
  ### Execution

> Access project root

	$ cd /directory/OrangeHRMTask

 
 > Execute the command to run all tests in the project

```
	$ mvn clean test
