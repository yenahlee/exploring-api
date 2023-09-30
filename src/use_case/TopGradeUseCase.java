package use_case;
import api.movie_recommendation;
import entity.Movie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TopGradeUseCase {
    private movie_recommendation movieRecommendation;

    public List<Movie> getMovieRecommendation() throws IOException {
        return movieRecommendation.top_rated();
    }
}