# Demo for Warnings Library

PLACEHOLDER

## Dependencies

This is a Java 8 project, since the TestFrame Warnings Library is supposed to 
work for Java 8. For testing of this project, I'm mostly using TestNG 6.8.1, as 
TestFrame 1.0 does not have any integrations with any integrated development 
environment (IDE) yet.

Obviously the TestFrame Warnings Library, which is in beta for now, is also a 
dependency in this project, as a dependency for Source Packages.

But also TestFrame 1.0, the testing framework, to be placed in Test Libraries as 
a dependency for Test Packages. Mostly for `assertThrows()`, as I had forgotten 
that TestNG 6.8.1 doesn't have that assertion and later versions of TestNG have 
a confusingly subtle problem with that assertion.
