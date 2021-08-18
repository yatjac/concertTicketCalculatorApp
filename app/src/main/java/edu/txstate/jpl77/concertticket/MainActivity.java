package edu.txstate.jpl77.concertticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numberOfTickets = findViewById(R.id.txtNumberOfTickets);
        Spinner group = findViewById(R.id.spnConcerts);
        Button findTheCost = findViewById(R.id.button);
        findTheCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///// Event Handling

            }
        });


    }
}