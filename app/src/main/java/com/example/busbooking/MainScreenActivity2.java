package com.example.busbooking;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.R;

public class MainScreenActivity2 extends AppCompatActivity {
    TextView receiver_msg, receiver_msg2, receiver_msg_date;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_select_buses);
        receiver_msg = findViewById(R.id.recievedDestination);
        receiver_msg2 = findViewById(R.id.recievedDestination2);
        receiver_msg_date = findViewById(R.id.recievedDate);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        String str2 = intent.getStringExtra("message_key2");
        String date = intent.getStringExtra("message_key_date");
        receiver_msg.setText(str);
        receiver_msg2.setText(str2);
        receiver_msg_date.setText(date);

        View Bus1 = findViewById(R.id.bus1);
        Bus1.setOnClickListener(v -> {
            Intent intent_bus1 = new Intent(this, Bus1.class);
            intent_bus1.putExtra("message_key", str);
            intent_bus1.putExtra("message_key2", str2);
            intent_bus1.putExtra("message_key_date", date);
            startActivity(intent_bus1);
        });
        View Bus2 = findViewById(R.id.bus2);
        Bus2.setOnClickListener(v -> {
            Intent intent_bus2 = new Intent(this, Bus2.class);
            intent_bus2.putExtra("message_key", str);
            intent_bus2.putExtra("message_key2", str2);
            intent_bus2.putExtra("message_key_date", date);
            startActivity(intent_bus2);
        });
        View Bus3 = findViewById(R.id.bus3);
        Bus3.setOnClickListener(v -> {
            Intent intent_bus3 = new Intent(this, Bus3.class);
            intent_bus3.putExtra("message_key", str);
            intent_bus3.putExtra("message_key2", str2);
            intent_bus3.putExtra("message_key_date", date);
            startActivity(intent_bus3);
        });
        View Bus4 = findViewById(R.id.bus4);
        Bus4.setOnClickListener(v -> {
            Intent intent_bus4 = new Intent(this, Bus4.class);
            intent_bus4.putExtra("message_key", str);
            intent_bus4.putExtra("message_key2", str2);
            intent_bus4.putExtra("message_key_date", date);
            startActivity(intent_bus4);
        });
    }
}
