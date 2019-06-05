# Rest-API-Automation-with-Rest-Assured


## What is REST Assured

- An open source Java project
- Is a Java DSL, or Domain-Specific Language, that allows you to write powerful, readable, and maintainable tests in Java for your RESTful APIs.
- Run on top of existing unit testing frameworks like JUnit or TestNG.
- Abstracts away a lot of boilerplate code, making your tests powerful yet really easy to read and maintain.
- http://rest-assured.io/

## Configuration 

Maven
<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured</artifactId>
      <version>RELEASE</version>
</dependency>

Gradle
testCompile 'io.rest-assured:rest-assured:3.3.0'

## API under test (http://zippopotam.us/)
- http://api.zippopotam.us/
- Supplies location data based on the country code and the zip code

## REST Assured features

- Supports all HTTP methods (GET, POST, PUT)
- Supports Gherkin syntax (Given/When/Then)
- Uses Hamcrest matchers for checks
- Uses JsonPath/ GPath and XmlPath for selecting elements from response

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
