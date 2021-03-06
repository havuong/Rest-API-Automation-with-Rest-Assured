# Rest API Automation with Rest Assured


## What is [REST Assured](http://rest-assured.io/)

- An open source Java project
- A Java DSL, or Domain-Specific Language, that allows you to write powerful, readable, and maintainable tests in Java for your RESTful APIs.
- Run on top of existing unit testing frameworks like JUnit or TestNG.
- Abstracts away a lot of boilerplate code, making your tests powerful yet really easy to read and maintain.

## REST Assured features

- Supports all HTTP methods (GET, POST, PUT)
- Supports Gherkin syntax (Given/When/Then)
- Uses Hamcrest matchers for checks
- Uses JsonPath/ GPath and XmlPath for selecting elements from response

## Configuration 

Maven
```markdown
<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured</artifactId>
      <version>RELEASE</version>
</dependency>
```

Gradle
```markdown
testCompile 'io.rest-assured:rest-assured:3.3.0'
```

## API under test
- http://api.zippopotam.us/
- Supplies location data based on the country code and the zip code
