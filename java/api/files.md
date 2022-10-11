# JAVA API - Files

- Part of [Java API](./README.md)

### readString()
```java
    Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
    String fileContent = Files.readString(filePath);
    assertThat(fileContent).isEqualTo("Sample text");
```
- [Java 11](../versions/11.md)
- https://www.baeldung.com/java-11-new-features#2-new-file-methods

### writeString()
```java
    Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
    String fileContent = Files.readString(filePath);
    assertThat(fileContent).isEqualTo("Sample text");
```
- [Java 11](../versions/11.md)
- https://www.baeldung.com/java-11-new-features#2-new-file-methods
