package ihu.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide;
    TextView textView;
    EditText editText1, editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlus = findViewById(R.id.button_plus);
        buttonDivide = findViewById(R.id.button_divide);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonMinus = findViewById(R.id.button_minus);
        textView = findViewById(R.id.result_textview);
        editText1 = findViewById(R.id.edit_text1);
        editText2 = findViewById(R.id.edit_text2);
    }

    public void add(View view) {
        String num1Str = editText1.getText().toString();
        String num2Str = editText2.getText().toString();

        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            try {
                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                int result = num1 + num2;
                textView.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                textView.setText("ERROR");
            }
        } else {
            textView.setText("ERROR");
        }
    }

    public void sub(View view) {
        String num1Str = editText1.getText().toString();
        String num2Str = editText2.getText().toString();

        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            try {
                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                int result = num1 - num2;
                textView.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                textView.setText("ERROR");
            }
        } else {
            textView.setText("ERROR");
        }
    }
    public void mul(View view) {
        String num1Str = editText1.getText().toString();
        String num2Str = editText2.getText().toString();

        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            try {
                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                int result = num1 * num2;
                textView.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                textView.setText("ERROR");
            }
        } else {
            textView.setText("ERROR");
        }
    }
    public void div(View view) {
        String num1Str = editText1.getText().toString();
        String num2Str = editText2.getText().toString();

        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            try {
                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                int result = num1 / num2;
                textView.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                textView.setText("ERROR");
            }
        } else {
            textView.setText("ERROR");
        }
    }
    public void tan(View view) {
        String num1Str = editText1.getText().toString();

        if ( !num1Str.isEmpty() ) {
            try {
                int num1 = Integer.parseInt(num1Str);

                double result = Math.tan(num1);
                textView.setText(String.valueOf(result));
            }   catch (NumberFormatException e) {
                textView.setText("ERROR");
            }
        } else {
            textView.setText("ERROR");
        }
    }
}
