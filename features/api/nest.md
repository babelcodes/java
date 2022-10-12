# Nest Based Access Control

> Java allows classes and interfaces to be nested within each other,
> to define classes inside other classes. 
> 
> Before Java 11, these nested types have unrestricted access to each other.
> 
> Since Java 11, a nest of classes implies both the outer/main class and all its nested classes

```java
public class Outer {

    public void outerPublic() {}

    private void outerPrivate() {}

    class Inner {
        public void innerPublic() {
            outerPrivate();
        }
    }
}
```

- https://www.baeldung.com/java-nested-classes
- https://www.baeldung.com/java-nest-based-access-control
- Nested classes enable us to:
  - logically group classes that are only used in one place, 
  - write more readable and maintainable code 
  - and increase encapsulation
- types of nested classes available in the language:
  - Static nested classes
  - Non-static nested classes
  - Local classes
  - Anonymous classes

## Since Java 11

For types A and B to be **nestmates** they must have the same nest host
- B claims to be a member of the nest hosted by B: B lists A in its `NestHost` attribute
- A lists B in its `NestMembers` attribute
- A is implicitly a member of the nest that it hosts

Now there is no need for the compiler to generate the bridge methods.


### New Reflection API methods

Java 11 provides means to query the new class file attributes using core reflection.

