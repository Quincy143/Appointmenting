package com.example.appointment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AppointmentSetter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_appointment);

        buttons();
    }
    
    public void buttons(){
        findViewById(R.id.btnGoBack).setOnClickListener(buttonClickListener);
        findViewById(R.id.btnContinueApnt).setOnClickListener(buttonClickListener);
    }
    
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnGoBack:
                    startActivity(new Intent(AppointmentSetter.this, MainActivity.class));
                    break;
                case R.id.btnContinueApnt:
                    startActivity(new Intent(AppointmentSetter.this, AppointmentConfirm.class));
                    break;
            }
        }
    };
}
