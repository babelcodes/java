# JAVA API - Collection

- Part of [Java API](./README.md)

### toArray()
```java
    List sampleList = Arrays.asList("Java", "Kotlin");
    String[] sampleArray = sampleList.toArray(String[]::new);
    assertThat(sampleArray).containsExactly("Java", "Kotlin");
```
- [Java 11](../versions/11.md)
- https://www.baeldung.com/java-11-new-features#3-collection-to-an-array
