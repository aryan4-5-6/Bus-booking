package com.example.busbooking;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.R;

public class Bus_info extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "CutPasteId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_info);
        View send_button = findViewById(R.id.send_button_id);
        TextView travels_name = findViewById(R.id.travels_name);
        TextView bus_time = findViewById(R.id.bus_time);
        TextView full_name = findViewById(R.id.full_name);
        TextView age = findViewById(R.id.age);
        TextView gender = findViewById(R.id.gender);
        TextView mobile = findViewById(R.id.mobile);
        TextView email = findViewById(R.id.email);
        RadioGroup radioGroup = findViewById(R.id.groupradio);
        Intent intent = getIntent();
        String dest = intent.getStringExtra("message_key");
        String dest2 = intent.getStringExtra("message_key2");
        String date = intent.getStringExtra("message_key_date");
        String time = intent.getStringExtra("message_key_time");
        String t_name = intent.getStringExtra("message_key_t_name");
        String amount = intent.getStringExtra("message_key_amount");
        String seat = intent.getStringExtra("message_key_seat");
        travels_name.setText(t_name);
        bus_time.setText("\t" + time);
        //Send data
        send_button.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId == -1) {
                Toast.makeText(Bus_info.this, "Select a payment method!!", Toast.LENGTH_SHORT).show();
            }
            else {
                RadioButton radioButton = radioGroup.findViewById(selectedId);
                String str = full_name.getText().toString();
                String str2 = age.getText().toString();
                String str3 = gender.getText().toString();
                String str4 = mobile.getText().toString();
                String str5 = email.getText().toString();
                String str6 = radioButton.getText().toString();
                Intent intent_ticket = new Intent(this, Bus_ticket.class);
                intent_ticket.putExtra("message_key_time", time);
                intent_ticket.putExtra("message_key_t_name", t_name);
                intent_ticket.putExtra("message_key_amount", amount);
                intent_ticket.putExtra("message_key_seat", seat);
                intent_ticket.putExtra("message_key_name", str);
                intent_ticket.putExtra("message_key_age", str2);
                intent_ticket.putExtra("message_key_gender", str3);
                intent_ticket.putExtra("message_key_mobile", str4);
                intent_ticket.putExtra("message_key_email", str5);
                intent_ticket.putExtra("message_key_payment", str6);
                intent_ticket.putExtra("message_key", dest);
                intent_ticket.putExtra("message_key2", dest2);
                intent_ticket.putExtra("message_key_date", date);
                startActivity(intent_ticket);
            }
        });
    }
}
