package com.example.uryashev_v_08;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.uryashev_v_08.databinding.ActivityStartBinding;

public class start extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityStartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageButton btn = (ImageButton) findViewById(R.id.rectangle_3);
        btn.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
            //переходим с первой на вторую активность
            Intent intent = new Intent(start.this, Gal.class);
            startActivity(intent);
        }
        });

        }
    }
