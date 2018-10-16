package no.hiof.lasseg.splashscreen3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class LoginSplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent splashIntent = new Intent(this, MainActivity.class);
        startActivity(splashIntent);
        finish();
    }
}
