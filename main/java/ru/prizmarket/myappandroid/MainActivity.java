package ru.prizmarket.myappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewFirst;
    TextView textViewSecond;
    Button changeActive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFirst =  findViewById(R.id.textViewFirst);
        textViewSecond = findViewById(R.id.textViewSecond);
        changeActive = findViewById(R.id.changeActive);
    }

    public void onChangeActive(View view){
        CharSequence text = textViewSecond.getText();

        if (text == "Прикинь, кнопка теперь работает)))") {
            textViewSecond.setText("А ну-ка снова нажми!!!");
        }else {
            textViewSecond.setText("Прикинь, кнопка теперь работает)))");
        }
    }
}
