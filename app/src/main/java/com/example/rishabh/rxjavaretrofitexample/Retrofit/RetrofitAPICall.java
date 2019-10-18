package com.example.rishabh.rxjavaretrofitexample.Retrofit;

import com.example.rishabh.rxjavaretrofitexample.Model.Post;
import java.util.List;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitAPICall {


    @GET("/posts?")
    Observable<List<Post>> getPostUserComment(@Query("user") String tags);
}
