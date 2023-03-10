package com.example.generated.resources.imdb;

import com.example.generated.resources.imdb.types.CreateMovieRequest;
import com.example.generated.resources.imdb.types.Movie;
import com.example.generated.resources.imdb.types.MovieId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(
    path = "/movies",
    consumes = "application/json",
    produces = "application/json"
)
public interface ImdbService {
  @PostMapping("/create-movie")
  MovieId createMovie(@RequestBody CreateMovieRequest body);

  @GetMapping("/{movieId}")
  Movie getMovie(@PathVariable("movieId") MovieId movieId);
}
