package api;

import entity.Movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface movieapi {
    List<Movie> top_rated() throws IOException;
}