package api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.http.HttpRequest;

public class movie_recommendation implements api.movieapi {
    //private static final String API_TOKEN = System.getenv("API_TOKEN");

    public void top_rated(int page) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=" + page)
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxYTM1NDRjZTMxNTEyYjhlZGMzOWFlYWQyMTdiZWFlZCIsInN1YiI6IjY1MTZlZjJmYzUwYWQyMDBjOTFhNjYwZCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.d5F2KzF4gOHTdMcv3AZzazTgKTGv--FzILbQvLVG9EI")
                .build();
        try {
            Response response = client.newCall(request).execute();

            if (response.code() == 200) {
                JSONObject responseBody = new JSONObject(response.body().string());
                JSONArray movies = responseBody.getJSONArray("results");
                System.out.println(movies);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        movie_recommendation Movies = new movie_recommendation();

        try {
            Movies.top_rated(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}