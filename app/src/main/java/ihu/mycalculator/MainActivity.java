package ihu.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonSin, buttonCos, buttonTan;
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
        buttonSin = findViewById(R.id.button_sin);
        buttonCos = findViewById(R.id.button_cos);
        buttonTan = findViewById(R.id.button_tan);
        textView = findViewById(R.id.result_textview);
        editText1 = findViewById(R.id.textbox1);
        editText2 = findViewById(R.id.textbox2);
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


  public void sin(View view) {
        String numStr = editText1.getText().toString();

        if (!numStr.isEmpty()) {
            try {
                double num = Double.parseDouble(numStr);

                double result = Math.sin(Math.toRadians(num));

                DecimalFormat decimalFormat = new DecimalFormat("#.####");
                String formattedResult = decimalFormat.format(result);

                textView.setText(formattedResult);
            } catch (NumberFormatException e) {
                textView.setText("ERROR");
            }
        } else {
            textView.setText("ERROR");
        }

    }
  
  public void cos(View view) {
        String num1Str = editText1.getText().toString();

        if ( !num1Str.isEmpty() ) {
            try {
                int num1 = Integer.parseInt(num1Str);

                double result = Math.cos(num1);
              
                textView.setText(String.valueOf(result));
            }   catch (NumberFormatException e) {
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
