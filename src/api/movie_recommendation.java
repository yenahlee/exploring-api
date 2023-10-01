package src.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class movie_recommendation implements src.api.movieapi {
    //private static final String API_TOKEN = System.getenv("API_TOKEN");

    public void top_rated() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=1")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI2YzE4MjM4YmU3NWE1MTk3ZTllZWY4YmYyYzUyNTRhOSIsInN1YiI6IjY1MTZlZjJmYzUwYWQyMDBjOTFhNjYwZCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.3f4Nimu4Jp__S3fjIGmn7xv9IN2_Z90GkYBcmQAJm5c")
                .build();
        try {
            Response response = client.newCall(request).execute();
            //JSONObject responseBody = new JSONObject(response.body().string());

            if (response.("code") == 200) {
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
            Movies.top_rated();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}