package co.uk.poyyeemobile.lastfm.network;

import co.uk.poyyeemobile.lastfm.model.TopArtistsResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopArtistsService {
    @GET("?method=user.gettopartists&format=json")
    Single<TopArtistsResponse> getTopArtists(@Query("user") String user, @Query("limit") int limit, @Query("api_key") String apiKey);
}
