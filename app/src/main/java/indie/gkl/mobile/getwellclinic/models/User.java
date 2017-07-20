package indie.gkl.mobile.getwellclinic.models;

import com.google.gson.annotations.SerializedName;


/**
 * Created by gokul on 26-08-2017.
 */

public class User {
    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    @SerializedName("phonenumber")
    private String phonenumber;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}
