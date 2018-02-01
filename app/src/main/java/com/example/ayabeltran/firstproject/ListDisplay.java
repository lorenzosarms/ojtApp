package com.example.ayabeltran.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ListDisplay extends AppCompatActivity {

    ImageView image;
    TextView name;
    TextView description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_display);

        image = findViewById(R.id.displayimage);
        name = findViewById(R.id.textname);
        description = findViewById(R.id.textdetails);

        Bundle extra = getIntent().getExtras();
        String  Key = extra.getString("Key");
        String  Key2 = extra.getString("Key2");
        Integer  Key3 = extra.getInt("Key3");



        name.setText(Key);
        description.setText(Key2);
        image.setImageResource(Key3);


    }
}
