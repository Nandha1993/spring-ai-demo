## Spring AI Demo Application
This is an example of Spring Boot Application integrated with Spring AI - OpenAI.
This example is intended to be used with blog post [Getting started with Spring AI](https://www.vojtechruzicka.com/spring-ai).

### Running the application
To run the app first built it using maven:

```
mvn clean install
```

Then you can run `SpringAiDemoApplication` as regular Spring Boot app.

### Accessing REST endpoints
When the application starts, it can be interacted with using REST endpoints defined in `AiController`. the app starts at `localhost:8080`

#### Generating images
Image generation can be accessed via `http://localhost:8080/generate-image?prompt=xxx`, where you can provide prompt defining what image should be generated.

For example, `http://localhost:8080/generate-image?prompt=cute%20cat`.