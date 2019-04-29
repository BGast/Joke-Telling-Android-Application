package com.example.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class JokeActivity extends AppCompatActivity {
    private TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        tellJoke();

    }

    private void tellJoke() {
        Intent intent = getIntent();
        String joke = intent.getStringExtra(getString(R.string.key_joke));

        jokeText = findViewById(R.id.tv_joke);
        jokeText.setText(joke);

    }

}
