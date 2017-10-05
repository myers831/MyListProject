package com.example.admin.mylistproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.helper.ItemTouchHelper.ACTION_STATE_DRAG;
import static android.support.v7.widget.helper.ItemTouchHelper.ACTION_STATE_SWIPE;
import static android.support.v7.widget.helper.ItemTouchHelper.DOWN;
import static android.support.v7.widget.helper.ItemTouchHelper.LEFT;
import static android.support.v7.widget.helper.ItemTouchHelper.UP;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPersonList;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;
    private List<Person> personList;
    ItemTouchHelper itemTouchHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPersonList = (RecyclerView) findViewById(R.id.rvPersonList);

        personList = new ArrayList<>();
        personList.add(new Person("Manny", "28"));
        personList.add(new Person("Mac", "24"));
        personList.add(new Person("Jason", "24"));
        personList.add(new Person("Joseph", "24"));
        personList.add(new Person("Jarett", "27"));
        personList.add(new Person("Ryen", "29"));
        personList.add(new Person("Manny", "28"));
        personList.add(new Person("Mac", "24"));
        personList.add(new Person("Jason", "24"));
        personList.add(new Person("Joseph", "24"));
        personList.add(new Person("Jarett", "27"));
        personList.add(new Person("Ryen", "29"));

        layoutManager = new LinearLayoutManager(this);
        itemAnimator = new DefaultItemAnimator();
        PersonListAdapter personListAdapter = new PersonListAdapter(personList);

        itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                return makeFlag(ACTION_STATE_SWIPE, LEFT ) | makeFlag(ACTION_STATE_DRAG, UP | DOWN);
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {

                if(viewHolder.getAdapterPosition() == target.getAdapterPosition()){

                    return true;
                }

                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

            }
        });

        rvPersonList.setLayoutManager(layoutManager);
        rvPersonList.setItemAnimator(itemAnimator);
        rvPersonList.setAdapter(personListAdapter);

        itemTouchHelper.attachToRecyclerView(rvPersonList);
    }
}
