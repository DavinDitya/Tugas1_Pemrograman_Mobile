package com.example.pemrogramanmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btnMove);
        Button btnShare = findViewById(R.id.btnShare);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendefinisikan nilai volt yang akan dikonversi
                double volt = 10.0; // Ganti dengan nilai volt yang sesuai
                // Membuat Intent untuk memulai DetailActivity dan menyertakan nilai volt
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("volt", volt);
                startActivity(intent);
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perintah Intent Implicit untuk share ke sosmed
                Intent intent = new Intent(Intent.ACTION_SEND);
                // Membawa data / pesan yang ingin dishare
                intent.putExtra(Intent.EXTRA_TEXT, "Hallo saya share ke sosial media");
                intent.setType("text/plain");
                // Menjalankan perintah Intent Implicit
                startActivity(Intent.createChooser(intent, "Share to :"));
            }
        });
    }
}
