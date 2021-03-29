package a.e.cat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Gson gson = new Gson();
        //Cat cat = new Cat("Барсик", 11, android.R.color.holo_blue_bright);
        //String json = gson.toJson(cat);
        String json = "{\"name\":\"Барсик\",\"age\":11,\"color\":BF2B2B}";
        Cat cat = gson.fromJson(json, Cat.class);


        textView.setText(String.valueOf("Кот:" + json));
    }

}