# Stream

> Stream implement basis of Functional Programming, which provide:
> - Immutability (for the source)
> - Composition (operations can be chained)
>
> One of the major pieces of new functionality Java 8 had added

- Part of [Java API](./README.md)
- See [Java 8](../versions/08.md)
- https://github.com/babelcodes/java/issues/4

## Creation (x3)
Streams can be created from different element sources e.g. collection or array:
```java
    String[] array = new String[]{"a", "b", "c"};
    List list = new ArrayList<>(Arrays.asList(array));

    Stream<String> stream = Arrays.stream(array);         // Arrays.stream() 
    stream = list.stream();                               // Collection.stream() 
    stream = Stream.of("a", "b", "c");                    // Stream.of()
    stream = Stream.empty();                              // Stream.empty()
```

## Multi-threading
Stream API also simplifies multithreading by providing the parallelStream() method that runs operations over stream's elements in parallel mode.
```java
    list.parallelStream().forEach(element -> doWork(element));
```

## Operations
Operations on streams don't change the source.
```java
long count = list
        .stream()
        .distinct()        // Intermediate, return another stream, don't change the source
        .count()           // Termninal, return a result, don't change the source
    ;
```

### Intermediate
Return `Stream<T>`, and then allow chaining

#### filter()
```java
Stream<String> withGreeting = list.stream().filter(element -> element.contains("welcome"));
```

#### flat / map()
- Convert the elements of a Stream into new elements (of new type) of a new Stream by applying a function.
```java
Stream<Integer> sizesStream = list.stream().map(element -> element.length());
Stream<String> stream = details.stream().flatMap(detail -> detail.getParts().stream()); // Each element is a Stream
```

### Terminal
Return a result of definite type

#### Matching
- to validate elements of a sequence according to some predicate
```java
// anyMatch
boolean isGreeting = list.stream().anyMatch(element -> element.contains("welcome"));
boolean isValid = list.stream().anyMatch(element -> element.contains("h"));      // true
Stream.empty().anyMatch(Objects::nonNull);                                       // false, ALWAYS

// allMatch
boolean isValidOne = list.stream().allMatch(element -> element.contains("h"));   // false
Stream.empty().allMatch(Objects::nonNull);                                       // true, ALWAYS

// noneMatch
boolean isValidTwo = list.stream().noneMatch(element -> element.contains("h"));  // false
```

#### reduce()
- Convert a sequence of elements into a value by applying a function
- Reduce take 2 parameters:
  - First, the initial value
  - Second, the function, which also takes 2 parameters
    - The element
    - The accumulator
```java
Integer total = coins.stream().reduce(0, (i, sum) -> i + sum);
```

#### collect()
- Reduce, convert a `Stream` into a `Collection`
- A utility class `java.util.stream.Collectors` provides a solution for almost all typical collecting operations. 
- For some, not trivial tasks, a custom `Collector` can be created.
```java
List<Integer> sizes = sizesStream.collect(Collectors.toList());
```

## Resources
- https://www.baeldung.com/java-8-streams-introduction
- https://www.baeldung.com/java-stream-filter-lambda
- https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-streams-2
- [java.util.stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/package-summary.html)
- Main class is [Stream\<T>](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html)
