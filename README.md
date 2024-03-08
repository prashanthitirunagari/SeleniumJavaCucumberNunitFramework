# Selenium-Cucumber-TestNG-Tests - Parallel Execution
Web application Testing with cucumber framework using Selenium, Java & TestNG

**Project Description**
It is a behavior driven development (BDD) approach to write automation test script to test Web applications. 
This automation framework is developed using selenium, cucumber, java, TestNG, Maven, Extent Reports.

**Installation**
Pre-requisite You need to have following softwares installed on your computer

Install JDK 1.8 and set path
Install Maven and set path
Eclipse
Eclipse Plugins: Maven and Cucumber
Installation In order to start using the project you need to create your own Fork on Github and then clone the project.

**How to run the Tests?**

mvn clean install -Dcucumber.filter.tags="@tag1" -Dthreads=2

mvn clean -Dmaven.clean.skip=true install -Dcucumber.filter.tags="@scenario1"

**To generate allure report**
allure serve target/allure-results
