package my.edu.tarc.lab12bmi;

import android.graphics.ImageFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EditTextHeight,EditTextWeight;
    private TextView textViewResult;
    private ImageView imageViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditTextWeight = (EditText)findViewById(R.id.editTextWeight);
        EditTextHeight = (EditText)findViewById(R.id.editTextHeight);
        textViewResult = (TextView)findViewById(R.id.textViewResult);
        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);
    }

    public void calculateBMI(View view)
    {
        double BMI,weight,height;
        weight = Double.parseDouble(EditTextWeight.getText().toString());
        height = Double.parseDouble(EditTextHeight.getText().toString());
        BMI = weight / (height * height);

        if (BMI <=18.5)
        {
            textViewResult.setText("BMI : "+BMI+". You are Underweight");
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if(BMI >=25)
        {
            textViewResult.setText("BMI : "+BMI+". You are Overweight");
            imageViewResult.setImageResource(R.drawable.over);
        }
        else
        {
            textViewResult.setText("BMI : "+BMI+". You are Normal");
            imageViewResult.setImageResource(R.drawable.normal);
        }

    }

    public void resetAll(View view)
    {
        EditTextHeight.setText("");
        EditTextWeight.setText("");
        textViewResult.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
    }
}
