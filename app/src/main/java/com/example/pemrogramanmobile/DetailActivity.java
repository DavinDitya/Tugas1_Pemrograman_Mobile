package com.example.pemrogramanmobile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    // Konstanta untuk konversi volt ke joule
    private static final double VOLT_TO_JOULE = 1.0; // Ini harus diubah sesuai dengan rumus konversi yang tepat

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        EditText voltInput = findViewById(R.id.voltInput);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText coulombInput = findViewById(R.id.coulombInput);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button convertButton = findViewById(R.id.convertButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String voltString = voltInput.getText().toString().trim();
                String coulombString = coulombInput.getText().toString().trim();
                if (!TextUtils.isEmpty(voltString) && !TextUtils.isEmpty(coulombString)) {
                    double volt = Double.parseDouble(voltString);
                    double coulomb = Double.parseDouble(coulombString);
                    // Lakukan konversi dari volt dan coulomb ke joule
                    double joule = volt * coulomb;
                    resultTextView.setText("Hasil konversi: " + joule + " Joule");
                } else {
                    resultTextView.setText("Masukkan nilai volt dan coulomb terlebih dahulu");
                }
            }
        });
    }
}
