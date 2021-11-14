package com.dikakoko.tugassatu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Budget> budgets = new ArrayList();

    BudgetAdapter adapter;
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        budgets = getIntent().getParcelableArrayListExtra("data");

        Log.d("TAG", "onCreate: " + budgets.get(0).deskripsi);

        adapter = new BudgetAdapter(budgets);
        rv = findViewById(R.id.rv_budget);
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}