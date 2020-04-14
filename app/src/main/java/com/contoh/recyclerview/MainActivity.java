package com.contoh.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new Adapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
        mahasiswaArrayList.add(new Mahasiswa("Gus Rama", "1805551065"));
    }
}
