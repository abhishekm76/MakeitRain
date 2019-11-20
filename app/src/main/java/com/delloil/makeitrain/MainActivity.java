package com.delloil.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Button showMoney;
    private Button   showTag;
    // this defines the instance variable but is not instantiated
    private TextView moneyText;
    private int moneyCounter =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMoney = findViewById(R.id.makerain_button);
        showTag = findViewById(R.id.show_tag_button);
        // instantiating the buttons here
        moneyText = findViewById(R.id.money_text);

        showMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();


                moneyCounter += 1000;
                Log.d("MYTAG", "onClick: " + moneyCounter);
                moneyText.setText(String.valueOf(currencyFormat.format(moneyCounter)));

                /*if (moneyCounter>=10000) {
                    int accentColor = getResources().getColor(R.color.colorAccent);
                    moneyText.setTextColor(accentColor);
                }*/

                switch (moneyCounter){
                    case 2000:
                        moneyText.setTextColor(Color.CYAN);
                    break;
                    case 4000:
                        moneyText.setTextColor(Color.RED);
                        break;
                    case 6000:
                        moneyText.setTextColor(Color.BLUE);
                        break;
                    default:
                        break;

                }


            }
        });


    }

    public void showTag(View view) {
        Log.d("MYTAG", "onClick in xml: ");
        Toast.makeText(getApplicationContext(), "Yoohooo how are you?", Toast.LENGTH_LONG).show();
    }
}
