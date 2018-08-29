package com.cnk24.timerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements TimeRecyclerAdapter.OnItemClickListener {

    private TimeRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mTimeRecyclerView = (RecyclerView) findViewById(R.id.mTimeRecyclerView);
        mTimeRecyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mTimeRecyclerView.setLayoutManager(layoutManager);

        adapter = new TimeRecyclerAdapter(getDataset());
        adapter.setOnItemClickListener(this);
        mTimeRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, adapter.getItem(position).getName(), Toast.LENGTH_SHORT).show();
    }

    private ArrayList<MyData> getDataset() {
        ArrayList<MyData> dataset = new ArrayList<>();

        dataset.add(new MyData("Cristiano Ronaldo", 1985, 1, 1));
        dataset.add(new MyData("Lionel Messi", 1985, 1, 1));
        dataset.add(new MyData("Wayne Rooney", 1985, 1, 1));
        dataset.add(new MyData("Karim Benzema", 1989, 12, 16));
        dataset.add(new MyData("Luka Modric", 1991, 8, 19));
        dataset.add(new MyData("Fernando Torres", 1992, 3, 24));
        dataset.add(new MyData("David Silva", 1986, 5, 6));
        dataset.add(new MyData("Raheem Sterling", 1986, 5, 6));
        dataset.add(new MyData("Philippe Coutinho", 1986, 5, 6));

        return dataset;
    }
}
