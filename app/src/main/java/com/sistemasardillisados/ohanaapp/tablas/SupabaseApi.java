package com.sistemasardillisados.ohanaapp.tablas;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import java.util.List;
public interface SupabaseApi {
    @GET("rest/v1/users")
    Call<List<Usuario>> getUsers(@Header("apikey") String apiKey, @Header("Authorization") String authHeader);
}
