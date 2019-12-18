# java12_to_java13

Kata to discover new features introduced in Java 13

You will find here a proposal of correction.

## Summary about new used features
### Switch expression
Direct variable assignation from a switch expression :
* Functional style with `->` operator
* Python style with `yield` new instruction

Unfortunately, this improvement is still experimental and need to be activated to be used.
Have a look into the POM file and you'll see that we pass a specific argument to the compiler for that.

### Text block
An interesting new way of writing easily already formatted text blocks.