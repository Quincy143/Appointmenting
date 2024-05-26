package com.example.appointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppointmentConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_confirm);

        buttonsConfirm();
    }

    public void buttonsConfirm(){
        findViewById(R.id.btnGoBack).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnConfirmApnt).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnGoBack:
                    startActivity(new Intent(AppointmentConfirm.this, AppointmentSetter.class));
                    break;
                case R.id.btnConfirmApnt:
                    startActivity(new Intent(AppointmentConfirm.this, MainActivity.class));
                    break;
            }
        }
    };
}