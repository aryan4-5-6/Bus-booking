package com.example.busbooking;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.R;

public class Bus_ticket extends AppCompatActivity {
    TextView amount, name, age, gender, email, number, t_name, time, board, drop, date, payment, seat;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_ticket);
        //Received Data
        amount = findViewById(R.id.amount);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        email = findViewById(R.id.email);
        number = findViewById(R.id.number);
        t_name = findViewById(R.id.travels);
        time = findViewById(R.id.time);
        board = findViewById(R.id.board);
        drop = findViewById(R.id.drop);
        date = findViewById(R.id.date);
        payment = findViewById(R.id.payment);
        seat = findViewById(R.id.seat);
        Intent intent = getIntent();
        String time1 = intent.getStringExtra("message_key_time");
        String t_name1 = intent.getStringExtra("message_key_t_name");
        String amount1 = intent.getStringExtra("message_key_amount");
        String seat_no = intent.getStringExtra("message_key_seat");
        String str = intent.getStringExtra("message_key_name");
        String str2 = intent.getStringExtra("message_key_age");
        String str3 = intent.getStringExtra("message_key_gender");
        String str4 = intent.getStringExtra("message_key_mobile");
        String str5 = intent.getStringExtra("message_key_email");
        String str6 = intent.getStringExtra("message_key_payment");
        String dest = intent.getStringExtra("message_key");
        String dest2 = intent.getStringExtra("message_key2");
        String date1 = intent.getStringExtra("message_key_date");
        amount.setText(amount1 + " Paid");
        name.setText("Name : " + str);
        age.setText("Age : " + str2);
        gender.setText("Gender : " + str3);
        email.setText("Email : " + str5);
        number.setText("Mobile Number : " + str4);
        time.setText("Time : " + time1);
        t_name.setText("Travels Company : " + t_name1);
        board.setText("Boarding Point : " + dest + " ISBT ");
        drop.setText("Drop Point : " + dest2 + " ISBT ");
        seat.setText("Seat Number : " + seat_no);
        date.setText("Date : " + date1);
        payment.setText("Payment Method : " + str6);

        //Buttons
        View Continue = findViewById(R.id.cont);
        Continue.setOnClickListener(v -> {
            Intent intent_cont = new Intent(this, MainScreenActivity.class);
            startActivity(intent_cont);
        });
    }
}
