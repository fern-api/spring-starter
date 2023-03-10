package com.example.generated.resources.imdb.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = CreateMovieRequest.Builder.class
)
public final class CreateMovieRequest {
  private final String title;

  private final double rating;

  private int _cachedHashCode;

  CreateMovieRequest(String title, double rating) {
    this.title = title;
    this.rating = rating;
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("rating")
  public double getRating() {
    return rating;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreateMovieRequest && equalTo((CreateMovieRequest) other);
  }

  private boolean equalTo(CreateMovieRequest other) {
    return title.equals(other.title) && rating == other.rating;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.title, this.rating);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateMovieRequest{" + "title: " + title + ", rating: " + rating + "}";
  }

  public static TitleStage builder() {
    return new Builder();
  }

  public interface TitleStage {
    RatingStage title(String title);

    Builder from(CreateMovieRequest other);
  }

  public interface RatingStage {
    _FinalStage rating(double rating);
  }

  public interface _FinalStage {
    CreateMovieRequest build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TitleStage, RatingStage, _FinalStage {
    private String title;

    private double rating;

    private Builder() {
    }

    @Override
    public Builder from(CreateMovieRequest other) {
      title(other.getTitle());
      rating(other.getRating());
      return this;
    }

    @Override
    @JsonSetter("title")
    public RatingStage title(String title) {
      this.title = title;
      return this;
    }

    @Override
    @JsonSetter("rating")
    public _FinalStage rating(double rating) {
      this.rating = rating;
      return this;
    }

    @Override
    public CreateMovieRequest build() {
      return new CreateMovieRequest(title, rating);
    }
  }
}
