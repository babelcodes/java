# JAVA API - HttpClient

- Part of [Java API](./README.md)

```java
    HttpClient httpClient = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2)
        .connectTimeout(Duration.ofSeconds(20))
        .build();
    HttpRequest httpRequest = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create("http://localhost:" + port))
        .build();
    HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    assertThat(httpResponse.body()).isEqualTo("Hello from the server!");
```
- [Java 11](../versions/11.md)
- https://www.baeldung.com/java-11-new-features#3-collection-to-an-array
- https://www.baeldung.com/java-9-http-client
