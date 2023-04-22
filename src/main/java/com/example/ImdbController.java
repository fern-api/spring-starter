package com.example;

import com.example.generated.resources.imdb.ImdbService;
import com.example.generated.resources.imdb.types.CreateMovieRequest;
import com.example.generated.resources.imdb.types.Movie;
import com.example.generated.resources.imdb.types.MovieId;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class ImdbController implements ImdbService {

    @Override
    public MovieId createMovie(CreateMovieRequest body) {
        return null;
    }

    @Override
    public Movie getMovie(MovieId movieId) {
        return Movie.builder()
                .id(movieId)
                .title("Goodwill hunting")
                .rating(10.9)
                .build();
    }
}
