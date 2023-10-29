package ihu.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton button_plus,button_minus,button_multiply,button_divide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_plus=findViewById(R.id.button_plus);
        button_divide=findViewById(R.id.button_divide);
        button_multiply=findViewById(R.id.button_multiply);
        button_minus=findViewById(R.id.button_minus);
    }
}
