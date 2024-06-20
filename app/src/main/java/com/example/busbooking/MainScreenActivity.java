package com.example.busbooking;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booking.R;

import java.util.Calendar;

public class MainScreenActivity extends AppCompatActivity {
    private TextView selectedDate;
    @SuppressLint({"MissingInflatedId", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        View send_button = findViewById(R.id.send_button_id);
        TextView send_text = findViewById(R.id.bus1_text_id);
        TextView send_text2 = findViewById(R.id.bus1_text_id2);
        TextView send_date = findViewById(R.id.idSelectedDate);

        selectedDate = findViewById(R.id.idSelectedDate);
        @SuppressLint("WrongViewCast") View selectDateButton = findViewById(R.id.selectDateButton);
        selectDateButton.setOnClickListener(v -> {
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);
            @SuppressLint("SetTextI18n") DatePickerDialog datePickerDialog = new DatePickerDialog(
                    MainScreenActivity.this,
                        (view, year1, monthOfYear, dayOfMonth) -> selectedDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year1), year, month, day);
                datePickerDialog.show();
        });

        send_button.setOnClickListener(v -> {
            String str = send_text.getText().toString();
            String str2 = send_text2.getText().toString();
            String date = send_date.getText().toString();
            Intent intent = new Intent(this, MainScreenActivity2.class);
            intent.putExtra("message_key", str);
            intent.putExtra("message_key2", str2);
            intent.putExtra("message_key_date", date);
            startActivity(intent);
        });
    }
}
