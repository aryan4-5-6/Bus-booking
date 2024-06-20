package com.example.busbooking;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.R;

public class Bus1 extends AppCompatActivity {
    TextView receiver_msg, receiver_msg2, receiver_msg_date;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus1);
        receiver_msg = findViewById(R.id.recievedDestination);
        receiver_msg2 = findViewById(R.id.recievedDestination2);
        receiver_msg_date = findViewById(R.id.recievedDate);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        String str2 = intent.getStringExtra("message_key2");
        String date = intent.getStringExtra("message_key_date");
        String t_name = "ABC Travels";
        String time = "6:00 PM";
        String amount = "Rs 600";
        receiver_msg.setText(str);
        receiver_msg2.setText(str2);
        receiver_msg_date.setText(date);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat = findViewById(R.id.seat1);
        Seat.setOnClickListener(v -> {
            Toast.makeText(Bus1.this, "This seat is already booked!!", Toast.LENGTH_SHORT).show();
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat2 = findViewById(R.id.seat2);
        Seat2.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "B1");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat3 = findViewById(R.id.seat3);
        Seat3.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "C1");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat4 = findViewById(R.id.seat4);
        Seat4.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "D1");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat5 = findViewById(R.id.seat5);
        Seat5.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "A2");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat6 = findViewById(R.id.seat6);
        Seat6.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "B2");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat7 = findViewById(R.id.seat7);
        Seat7.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "C2");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat8 = findViewById(R.id.seat8);
        Seat8.setOnClickListener(v -> {
            Toast.makeText(Bus1.this, "This seat is already booked!!", Toast.LENGTH_SHORT).show();
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat9 = findViewById(R.id.seat9);
        Seat9.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "A3");


            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat10 = findViewById(R.id.seat10);
        Seat10.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "B3");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat11 = findViewById(R.id.seat11);
        Seat11.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "C3");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat12 = findViewById(R.id.seat12);
        Seat12.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "D3");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat13 = findViewById(R.id.seat13);
        Seat13.setOnClickListener(v -> {
            Toast.makeText(Bus1.this, "This seat is already booked!!", Toast.LENGTH_SHORT).show();
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat14 = findViewById(R.id.seat14);
        Seat14.setOnClickListener(v -> {
            Toast.makeText(Bus1.this, "This seat is already booked!!", Toast.LENGTH_SHORT).show();
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat15 = findViewById(R.id.seat15);
        Seat15.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "C4");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat16 = findViewById(R.id.seat16);
        Seat16.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "D4");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat17 = findViewById(R.id.seat17);
        Seat17.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "A5");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat18 = findViewById(R.id.seat18);
        Seat18.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "B5");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat19 = findViewById(R.id.seat19);
        Seat19.setOnClickListener(v -> {
            Toast.makeText(Bus1.this, "This seat is already booked!!", Toast.LENGTH_SHORT).show();
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat20 = findViewById(R.id.seat20);
        Seat20.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "D5");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat21 = findViewById(R.id.seat21);
        Seat21.setOnClickListener(v -> {
            Toast.makeText(Bus1.this, "This seat is already booked!!", Toast.LENGTH_SHORT).show();
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat22 = findViewById(R.id.seat22);
        Seat22.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "B6");

            startActivity(intent_seat);
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat23 = findViewById(R.id.seat23);
        Seat23.setOnClickListener(v -> {
            Toast.makeText(Bus1.this, "This seat is already booked!!", Toast.LENGTH_SHORT).show();
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) View Seat24 = findViewById(R.id.seat24);
        Seat24.setOnClickListener(v -> {
            Intent intent_seat = new Intent(this, Bus_info.class);
            intent_seat.putExtra("message_key", str);
            intent_seat.putExtra("message_key2", str2);
            intent_seat.putExtra("message_key_date", date);
            intent_seat.putExtra("message_key_time", time);
            intent_seat.putExtra("message_key_t_name", t_name);
            intent_seat.putExtra("message_key_amount", amount);
            intent_seat.putExtra("message_key_seat", "D6");

            startActivity(intent_seat);
        });
    }
}
