package team_18.financialadvisor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class GraphView extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_view);

        Button buttonGVGoToBS = (Button)findViewById(R.id.buttonGVGoToBS);
        Button buttonGVGoToMM = (Button)findViewById(R.id.MMButtonGVGoToMM);
        Button buttonGVGoToCV = (Button)findViewById(R.id.buttonGVGoToCV);

        //Setting button behavior
        buttonGVGoToBS.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent = new Intent(GraphView.this, BudgetSummary.class);
                startActivity(myIntent);
            }
        });

        buttonGVGoToMM.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent = new Intent(GraphView.this, MainActivity.class);
                startActivity(myIntent);

                barChart = (BarChart) findViewById(R.id.barchart);

                barChart.setDrawBarShadow(false);
                barChart.setDrawValueAboveBar(true);
                barChart.setMaxVisibleValueCount(50);
                barChart.setPinchZoom(false);
                barChart.setDrawGridBackground(true);

                ArrayList<BarEntry> barEntries = new ArrayList<>();

                barEntries.add(new BarEntry(1,40f));
                barEntries.add(new BarEntry(2,48f));
                barEntries.add(new BarEntry(3,37f));
                barEntries.add(new BarEntry(4,50f));

            }
        });

        buttonGVGoToCV.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent = new Intent(GraphView.this, CalendarView.class);
                startActivity(myIntent);
            }
        });

    }
}
