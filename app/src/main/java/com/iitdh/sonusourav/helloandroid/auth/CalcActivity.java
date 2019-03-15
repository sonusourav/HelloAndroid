package com.iitdh.sonusourav.helloandroid.auth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.iitdh.sonusourav.helloandroid.R;
import java.text.DecimalFormat;

public class CalcActivity extends AppCompatActivity implements View.OnClickListener {
  
  private static final char ADDITION = '+';
  private static final char SUBTRACTION = '-';
  private static final char MULTIPLICATION = '*';
  private static final char DIVISION = '/';

  private char CURRENT_ACTION;
  private double valueOne = Double.NaN;
  private double valueTwo;

  private DecimalFormat decimalFormat;
  private EditText editText;
  private TextView infoTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView( R.layout.activity_calc);

    decimalFormat = new DecimalFormat("#.##########");
    init();

  }

  private void computeCalculation() {
    if(!Double.isNaN(valueOne)) {
      valueTwo = Double.parseDouble( editText.getText().toString());
       editText.setText(null);

      if(CURRENT_ACTION == ADDITION)
        valueOne = this.valueOne + valueTwo;
      else if(CURRENT_ACTION == SUBTRACTION)
        valueOne = this.valueOne - valueTwo;
      else if(CURRENT_ACTION == MULTIPLICATION)
        valueOne = this.valueOne * valueTwo;
      else if(CURRENT_ACTION == DIVISION)
        valueOne = this.valueOne / valueTwo;
    }
    else {
      try {
        valueOne = Double.parseDouble( editText.getText().toString());
      }
      catch (Exception ignored){}
    }
  }

  public void init(){
    Button buttonZero = findViewById(R.id.buttonZero);
    Button buttonOne = findViewById(R.id.buttonOne);
    Button buttonTwo = findViewById(R.id.buttonTwo);
    Button buttonThree = findViewById(R.id.buttonThree);
    Button buttonFour = findViewById(R.id.buttonFour);
    Button buttonFive = findViewById(R.id.buttonFive);
    Button buttonSix = findViewById(R.id.buttonSix);
    Button buttonSeven = findViewById(R.id.buttonSeven);
    Button buttonEight = findViewById(R.id.buttonEight);
    Button buttonNine = findViewById(R.id.buttonNine);
    Button buttonAdd = findViewById(R.id.buttonAdd);
    Button buttonSubtract = findViewById(R.id.buttonSubtract);
    Button buttonMultiply = findViewById(R.id.buttonMultiply);
    Button buttonDivide = findViewById(R.id.buttonDivide);
    Button buttonClear = findViewById(R.id.buttonClear);
    Button buttonClearAll=findViewById(R.id.buttonClearAll);
    Button buttonDot = findViewById(R.id.buttonDot);
    Button buttonEqual = findViewById(R.id.buttonEqual);
    editText=findViewById(R.id.editText);
    infoTextView=findViewById(R.id.infoTextView);

    buttonZero.setOnClickListener(this);
    buttonOne.setOnClickListener(this);
    buttonTwo.setOnClickListener(this);
    buttonThree.setOnClickListener(this);
    buttonFour.setOnClickListener(this);
    buttonFive.setOnClickListener(this);
    buttonSix.setOnClickListener(this);
    buttonSeven.setOnClickListener(this);
    buttonEight.setOnClickListener(this);
    buttonNine.setOnClickListener(this);
    buttonDot.setOnClickListener(this);
    buttonClear.setOnClickListener(this);
    buttonAdd.setOnClickListener(this);
    buttonSubtract.setOnClickListener(this);
    buttonMultiply.setOnClickListener(this);
    buttonDivide.setOnClickListener(this);
    buttonEqual.setOnClickListener(this);
    buttonClearAll.setOnClickListener(this);

  }

  @Override public void onClick(View v) {
    switch (v.getId()){
      case R.id.buttonZero:
        editText.setText( editText.getText() + "0");
        break;
      case R.id.buttonOne:
        editText.setText( editText.getText() + "1");
        break;
      case R.id.buttonTwo:
        editText.setText( editText.getText() + "2");
        break;
      case R.id.buttonThree:
        editText.setText( editText.getText() + "3");
        break;
      case R.id.buttonFour:
        editText.setText( editText.getText() + "4");
        break;
      case R.id.buttonFive:
        editText.setText( editText.getText() + "5");
        break;
      case R.id.buttonSix:
        editText.setText( editText.getText() + "6");
        break;
      case R.id.buttonSeven:
        editText.setText( editText.getText() + "7");
        break;
      case R.id.buttonEight:
        editText.setText( editText.getText() + "8");
        break;
      case R.id.buttonNine:
        editText.setText( editText.getText() + "9");
        break;
      case R.id.buttonAdd :
        computeCalculation();
        CURRENT_ACTION = ADDITION;
        infoTextView.setText(decimalFormat.format(valueOne) + "+");
        editText.setText(null);
        break;
      case R.id.buttonSubtract:
        computeCalculation();
        CURRENT_ACTION = SUBTRACTION;
        infoTextView.setText(decimalFormat.format(valueOne) + "-");
        editText.setText(null);
        break;
      case R.id.buttonMultiply:
        computeCalculation();
        CURRENT_ACTION = MULTIPLICATION;
        infoTextView.setText(decimalFormat.format(valueOne) + "*");
        editText.setText(null);
        break;
      case R.id.buttonDivide:
        computeCalculation();
        CURRENT_ACTION = DIVISION;
        infoTextView.setText(decimalFormat.format(valueOne) + "/");
        editText.setText(null);
        break;
      case R.id.buttonEqual:
        computeCalculation();
        infoTextView.setText( infoTextView.getText().toString() + decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
        valueOne = Double.NaN;
        CURRENT_ACTION = '0';
        break;
      case R.id.buttonClear:
        if( editText.getText().length() > 0) {
          CharSequence currentText =  editText.getText();
          editText.setText(currentText.subSequence(0, currentText.length()-1));
        }
        else {
          valueOne = Double.NaN;
          valueTwo = Double.NaN;
          editText.setText("");
          infoTextView.setText("");
        }
        break;
      case R.id.buttonClearAll:
        valueOne=Double.NaN;
        valueTwo=Double.NaN;
        editText.setText("");
        infoTextView.setText("");
        break;
        default:

    }
  }
}
