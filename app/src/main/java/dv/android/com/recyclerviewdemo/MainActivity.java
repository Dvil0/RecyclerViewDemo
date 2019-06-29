package dv.android.com.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> dataList;
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerId);
        recycler.setLayoutManager(new GridLayoutManager(this, 3));
        //recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
        //recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        dataList = new ArrayList<>();
        for (int i = 0; i<=50; i++){
            dataList.add("Dato #"+i+" ");
        }

        AdapterDatos adapter = new AdapterDatos(dataList);
        recycler.setAdapter(adapter);
    }
}
