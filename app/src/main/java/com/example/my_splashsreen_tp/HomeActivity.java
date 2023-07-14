package com.example.my_splashsreen_tp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.my_splashsreen_tp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    TextView username;
    TextView password;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Account Informations");
        setContentView(R.layout.activity_home);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        back = findViewById(R.id.backHome);
        Bundle b = getIntent().getExtras();
        String usr = b.getString("username");
        String pswd = b.getString("password");
        username.setText(usr);
        password.setText(pswd);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}