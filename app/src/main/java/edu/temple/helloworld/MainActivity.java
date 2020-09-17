package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView hello_text = (TextView)findViewById(R.id.updatable_text);
        Button update_text_button = findViewById(R.id.update_text_button);

        final String new_text = "You have clicked the button.";

        update_text_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                hello_text.setText(new_text);
            }
        });
    }


}