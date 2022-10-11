# JAVA API - Predicate

- Part of [Java API](./README.md)

### not()
```java
    List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList
        .stream()
        .filter(Predicate.not(String::isBlank))
        .collect(Collectors.toList());
    assertThat(withoutBlanks).containsExactly("Java", "Kotlin");
```
- [Java 11](../versions/11.md)
- https://www.baeldung.com/java-11-new-features#4-the-not-predicate-method
