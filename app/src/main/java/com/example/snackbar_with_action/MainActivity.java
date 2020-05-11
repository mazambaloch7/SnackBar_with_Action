package com.example.snackbar_with_action;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout ConstraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ConstraintLayout = findViewById(R.id.ConstraintLayout);

    }

    public void buttonclickFunction(View view) {

        Snackbar snackbar = Snackbar.make(ConstraintLayout, "This snackbar are create with object explample.", BaseTransientBottomBar.LENGTH_LONG);
        snackbar.show();
    }



    public void customclickFunction(View view) {
        Snackbar snackbar = Snackbar.make(ConstraintLayout, "Custom snackbar explample with Action. ", BaseTransientBottomBar.LENGTH_INDEFINITE);
        snackbar.setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        snackbar.show();
    }
}
