package com.example.hp.online;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout mChartLayout;
    TableLayout mTableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChartLayout= findViewById(R.id.chart_layout);

        mTableLayout = new TableLayout(this);
        displayCharTable();



    }
    public  void displayCharTable()
    {
        mTableLayout.setLayoutParams(new TableLayout.LayoutParams(
                TableLayout.LayoutParams.FILL_PARENT,TableLayout.LayoutParams.WRAP_CONTENT
        ));

        for(int count = 1;count <11;count ++)
        {
            TableRow row = new TableRow(this);
            row.setLayoutParams((new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.WRAP_CONTENT)));

            TextView valueTV = new TextView(this);
            valueTV.setText("row no  : "+count);
            valueTV.setLayoutParams(new TableRow.LayoutParams(
                    TableRow.LayoutParams.FILL_PARENT,TableRow.LayoutParams.WRAP_CONTENT
            ));

            row.addView(valueTV);
            mTableLayout.addView(row);


        }
        mChartLayout.addView(mTableLayout);

    }
}
