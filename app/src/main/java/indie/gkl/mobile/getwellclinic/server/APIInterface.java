package indie.gkl.mobile.getwellclinic.server;

import indie.gkl.mobile.getwellclinic.models.RegisterRes;
import indie.gkl.mobile.getwellclinic.models.User;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by gokul on 26-08-2017.
 */

public interface APIInterface {

    @FormUrlEncoded
    @POST("/register")
    Call<RegisterRes> register(@Field("email") String email, @Field("password") String password,@Field("mobile") String mobile);


    @FormUrlEncoded
    @POST("/login")
    Call<User> login(@Field("mobile") String mobile, @Field("password") String password);
}
