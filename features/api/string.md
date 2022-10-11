# JAVA API - String

- Part of [Java API](./README.md)

### isBlank()
```java
    assertTrue("\n\t\u2005  ".isBlank());
```
- [Java 11](../versions/11.md)

### lines()
```java
    is("This is\n \n a multiline\n string."
        .lines()
        .filter(String::isBlank)
        .count()
        ).equals(3L);
```
- [Java 11](../versions/11.md)

### repeat()
```java
    is("La ".repeat(2) + "Land").equals("La La Land");
```
- [Java 11](../versions/11.md)

### strip() vs. trim()
```java
    is("\n\t  hello   \u2005".strip()).equals("hello");
    is("\n\t  hello   \u2005".trim()).equals("hello   \u2005");
```
- [Java 11](../versions/11.md)
