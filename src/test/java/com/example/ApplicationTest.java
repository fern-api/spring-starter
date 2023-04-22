package com.example;


import com.example.client.generated.DemoApiClient;
import com.example.client.generated.resources.imdb.types.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;

public class ApplicationTest {

    @BeforeAll
    public static void beforeAll() {
        SpringApplication.run(Application.class);
    }


    @Test
    public void test() {
        DemoApiClient client = DemoApiClient.builder()
                .url("http://localhost:8080")
                .build();
        Movie movie = client.imdb().getMovie("goodwill-hunting");
        Assertions.assertEquals(movie.getTitle(), "Goodwill Hunting");
    }
}
