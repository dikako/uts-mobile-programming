package com.dikakoko.tugassatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText deskripsi, pemasukan, pengeluaran, sisa;
    Button btnBudget, btnGotoList;

    ArrayList<Budget> budgets = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_budget);

        deskripsi = findViewById(R.id.deskripsi);
        pemasukan = findViewById(R.id.pemasukan);
        pengeluaran = findViewById(R.id.pengeluaran);
        btnBudget = findViewById(R.id.btnBudget);
        btnGotoList = findViewById(R.id.btnGotoList);


        btnBudget.setOnClickListener(v -> {

            budgets.add(new Budget(
                    deskripsi.getText().toString(),
                    Double.parseDouble(pemasukan.getText().toString()) - Double.parseDouble(pengeluaran.getText().toString()),
                    Double.parseDouble(pemasukan.getText().toString()),
                    Double.parseDouble(pengeluaran.getText().toString())

            ));
            Toast.makeText(this, "Data" + " Berhasil Dibuat!", Toast.LENGTH_LONG).show();

        });

        btnGotoList.setOnClickListener(v -> {
            Intent intent = new Intent(this,  MainActivity2.class);
            intent.putExtra("data", budgets);
            startActivity(intent);
        });

    }
}