package student.tmdbmovieapp.api;

import retrofit2.Call;
import retrofit2.http.GET;
import student.tmdbmovieapp.model.MovieResult;

/**
 * Created by Student on 7/22/2017.
 */
public interface ApiInterface {
    @GET("/3/movie/550?api_key=0683b94ef5337820921bbc48c68922ac")
    Call<MovieResult> getMovies();
}
