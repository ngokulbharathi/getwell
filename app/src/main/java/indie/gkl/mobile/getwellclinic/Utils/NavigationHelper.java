package indie.gkl.mobile.getwellclinic.Utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;

import indie.gkl.mobile.getwellclinic.LoginActivity;
import indie.gkl.mobile.getwellclinic.MainActivity;
import indie.gkl.mobile.getwellclinic.R;
import indie.gkl.mobile.getwellclinic.SignupActivity;

/**
 * Created by gokul on 22-07-2017.
 */

public class NavigationHelper  {
    public static void navigateToCartPage(Activity activity, ActivityOptionsCompat options){
        Intent intent = new Intent(activity.getApplicationContext(), MainActivity.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.startActivity(intent, options.toBundle());
        } else {
            activity.startActivity(intent);
        }
//        activity.finish();
        activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
}
