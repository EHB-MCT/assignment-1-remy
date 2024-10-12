# Kotlin Springboot MVC template
This project is meant to be a starter file for individuals who desire to start a project in Kotlin using the Springboot framework and are using the MVC (Model-View-Controller) Architecture.

## General rules
- Directory structure:<br>
Packages should be placed directly under the source root (org.example.kotlin.package), and files should be in the subdirectory of the source root (org.example.kotlin.package.file).

- Packages names:<br>
Names of packages are always lowercase and do not use underescores. <br>
If you need to use multiple words, use camel case.

- Source file names:<br>
Use upper camel case for files. <br>
If the file contains a single class or interface, its name should be the same as the name of the class. <br>
If the file contains multiple classes and/or interfaces, choose a name describing what the file contains.

- Class names:<br>
Names of classes and objects use upper camel case

- Function names:<br>
Names of functions, properties and local variables start with a lowercase letter and use camel case with no underscores.

- Indentation:<br>
Use four spaces for indentation. Do not use tabs. <br>
For curly braces({}), put the opening brace at the end of the line, and the closing brace on a separate line aligned horizontally with the opening construct.

- Horizontal whitespace:<br>
Put space around binary operators. (a + b) <br>
Put space between keywords and the corresponding opening parenthesis. (if, when, for, and while)<br>
Never put a space after (,[, or before ],).<br>
Put a space after //.

- Class headers:<br>
Classes with a few constructor parameters can be written in a single line, with more parameters the parameters should be formatted in a separate line with indentation. <br>
The closing paranthesis should be on a new line.

- Annotations:<br>
Place annotations on separate lines before the declaration to which they are attached, and with the same indentation.<br>
Annotations without arguments may be placed on the same line.

- Immutability:<br>
Prefer using immutable data to mutable.<br>
Always declare local variables and properties as 'val' rather than 'var' if they are not modified after initialization.

## Springboot MVC conventions
**1. Controller layer:**
- This layer is responsible for handling incoming HTTP requests.
- Controllers receive requests, process them, and interact with the service layer to retrieve or manipulate data.
- Use clear and lower case names for controller methods that describe their purpose.
- Controllers are often annotated with @Controller or @RestController.

**2. Service layer:**
- The service layer contains logic and acts as an intermediary between the controller and the data access layer.
- Use lower camel case and descriptive names for functions in the service layer.
- Services are often annotated with @Service.

**3. Repository layer:**
- The repository layer is responsible for interacting with the database or any external data source.
- It includes interfaces or classes that define methods for performing CRUD.
- Repositories are often annotated with @Repository.

**4. Entity/Model layer:**
- Entities represent the application’s data model and are often mapped to database tables.
- These classes typically contain fields annotated with JPA annotations (@Entity, @Column) for database mapping.
- Use Kotlin data class to represent the model layer.
- Use ```val``` for fields that should not be modified.

**5. DTO (Data Transfer Object):**
- DTOs are used to transfer data between layers and can help to encapsulate the data being sent between the client and the server.
- They can be used to shape the data for presentation without exposing the internal entity structure.


## Up & running (optional)
- This should contain step by step instructions to run your project
- Login information is mentioned here if applicable.

## Sources 

Given are some examples, delete and replace with your own.

- [Kotlin](https://kotlinlang.org/docs/home.html): Kotlin documentation
- [PWskills](https://pwskills.com/blog/architecture-of-spring-boot-examples-pattern-layered-controller-layer/): MVC architecture
- [Chatgpt.com](https://chatgpt.com) ⚠️ this is an invalid example, because it links to a homepage instead of a specific page or issue
- Generate a ChatGPT share link: options (three dots) > share.

