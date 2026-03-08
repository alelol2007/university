package com.example.myapplication;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText fn;
    private EditText sn;
    private TextView textOutput;
    private float FinalNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        fn = findViewById(R.id.inputFirstNumber);
        sn = findViewById(R.id.inputSecondNumber);
        textOutput = findViewById(R.id.textResult);
    }
    public void plus(View view) {
        String firstInput = fn.getText().toString();
        String secondInput = sn.getText().toString();
        if (!firstInput.isEmpty() && !secondInput.isEmpty()) {
            float num1 = Float.parseFloat(firstInput);
            float num2 = Float.parseFloat(secondInput);
            float result = num1 + num2;
            textOutput.setText(String.valueOf(result));
        } else {
            textOutput.setText("Please enter numbers");
        }
    }
    public void minus(View view){
        String firstInput = fn.getText().toString();
        String secondInput = sn.getText().toString();
        if (!firstInput.isEmpty() && !secondInput.isEmpty()) {
            float num1= Float.parseFloat(firstInput);
            float num2 = Float.parseFloat(secondInput);
            float result = num1 - num2;
            textOutput.setText(String.valueOf(result));
        }
        else {
            textOutput.setText("Please enter numbers");
        }
    }
    public void Multiply(View view){
        String firstInput = fn.getText().toString();
        String secondInput = sn.getText().toString();
        if (!firstInput.isEmpty() && !secondInput.isEmpty()) {
            float num1= Float.parseFloat(firstInput);
            float num2 = Float.parseFloat(secondInput);
            float result = num1 * num2;
            textOutput.setText(String.valueOf(result));
        }
        else {
            textOutput.setText("Please enter numbers");
        }
    }
    public void divide(View view){
        String firstInput = fn.getText().toString();
        String secondInput = sn.getText().toString();
        if (!firstInput.isEmpty() && !secondInput.isEmpty()) {
            float num1= Float.parseFloat(firstInput);
            float num2 = Float.parseFloat(secondInput);
            float result = num1 / num2;
            textOutput.setText(String.valueOf(result));
        }
        else {
            textOutput.setText("Please enter numbers");
        }
    }
}
