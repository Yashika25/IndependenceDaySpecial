package com.example.yashika.independencedayspecial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class IndependentActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_independent);

        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(IndependentActivity.this, "Scroll up!!", Toast.LENGTH_SHORT);
        toast.show();

    }
}
