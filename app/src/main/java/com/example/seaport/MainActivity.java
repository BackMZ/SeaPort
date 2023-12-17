package com.example.seaport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mouthIncome = findViewById(R.id.MounthIncome);
        TextView amountIncome = findViewById(R.id.AmountIncome);
        TextView output = findViewById(R.id.output);

        Income rent = new Income("Аредна площадей порта", 170_000);
        AmountIncome vesselMaintenance = new AmountIncome("Обслуживание морских судов", 125, 3_500);

        mouthIncome.setText(
                rent.getNameIncome() +
                        "\nдоход в месяц: " + rent.getIncome() + " монет"
        );

        amountIncome.setText(
                vesselMaintenance.getNameIncome() +
                        "\nКоличество судов в месяц: " + vesselMaintenance.getQuantityPerMonth() +
                        "\nСтоимость обслуживания одного судна: " + vesselMaintenance.getIncome()
        );

        output.setText(rent.getIncome() + vesselMaintenance.calculateMonthIncome() + " монет");
    }
}