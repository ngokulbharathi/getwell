//package indie.gkl.mobile.getwellclinic;
//
//import android.content.Context;
//import android.os.AsyncTask;
//import android.support.v4.util.Pair;
//import android.widget.Toast;
//
//import com.example.gokul.myapplication.backend.myApi.MyApi;
//import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
//import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.http.LowLevelHttpRequest;
//
//import java.io.IOException;
//
////import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
//
///**
// * Created by gokul on 23-07-2017.
// */
//
//class TestServiceTask extends AsyncTask<Pair<Context, String>, Void, String> {
//    private static MyApi myApiService = null;
//    private Context context;
//
//    @Override
//    protected String doInBackground(Pair<Context, String>... params) {
//        if (myApiService == null) {  // Only do this once
//            MyApi.Builder builder = new MyApi.Builder(new HttpTransport() {
//                @Override
//                protected LowLevelHttpRequest buildRequest(String method, String url) throws IOException {
//                    return null;
//                }
//            },
//                    null, null)
//                    // options for running against local devappserver
//                    // - 10.0.2.2 is localhost's IP address in Android emulator
//                    // - turn off compression when running against local devappserver
//                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
//                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
//                        @Override
//                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
//                            abstractGoogleClientRequest.setDisableGZipContent(true);
//                        }
//                    });
//            // end options for devappserver
//
//            myApiService = builder.build();
//        }
//
//        context = params[0].first;
//        String name = params[0].second;
//
//        try {
//            return myApiService.sayHi(name).execute().getData();
//        } catch (IOException e) {
//            return e.getMessage();
//        }
//    }
//
//    @Override
//    protected void onPostExecute(String result) {
//        Toast.makeText(context, result, Toast.LENGTH_LONG).show();
//    }
//}