package com.victoryil.whattimeisit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.widget.TextView;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
     final Locale locale = Locale.getDefault();
    final SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy", locale);
    final SimpleDateFormat time = new SimpleDateFormat("hh:mm",locale);
    final String dat = date.format(new Date());
    final String tim = time.format(new Date());
    private TextView lblFecha, lblHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();

    }

    private void setupView() {
        lblFecha = ActivityCompat.requireViewById(this,R.id.lblFecha);
        lblHora =  ActivityCompat.requireViewById(this,R.id.lblTiempo);
        lblFecha.setText(dat);
        lblHora.setText(tim);
    }
}