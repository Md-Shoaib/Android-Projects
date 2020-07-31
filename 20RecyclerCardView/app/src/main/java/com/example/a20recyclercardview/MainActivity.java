package com.example.a20recyclercardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Variable Declaration
    private Button buttonAdd, buttonDelete;
    private EditText editTextAdd, editTextDelete;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    ArrayList<ExampleItem> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Finding ui elements
        buttonAdd = findViewById(R.id.buttonadd);
        buttonDelete = findViewById(R.id.buttondelete);
        editTextAdd = findViewById(R.id.edittextadd);
        editTextDelete = findViewById(R.id.edittextdelete);

        //Setting listeners to those buttons
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Getting as a String value from edit Text and parse into integer then passing value to our method
                int position = Integer.parseInt(editTextAdd.getText().toString());
                addCard(position);
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Getting as a String value from edit Text and parse into integer then passing value to our method
                int position = Integer.parseInt(editTextDelete.getText().toString());
                deleteCard(position);

            }
        });


        //Calling a function for generate fake data this part is done under refactoring
        generateFakeData();

        //Calling a function for recyclerview configuration this part is done under refactoring
        recyclerViewConfig();

    }

    //Methods

    private void generateFakeData() {

        //Arraylist
        exampleList = new ArrayList<>();

        exampleList.add(new ExampleItem(R.drawable.node, "Clicked at Studio"));
        exampleList.add(new ExampleItem(R.drawable.oner, "Clicked at Italy"));
        exampleList.add(new ExampleItem(R.drawable.twor, "Clicked at Rome"));
        exampleList.add(new ExampleItem(R.drawable.threer, "Clicked at Gr"));
        exampleList.add(new ExampleItem(R.drawable.fourr, "Clicked at Studio"));
        exampleList.add(new ExampleItem(R.drawable.fiver, "Clicked at Studio"));
        exampleList.add(new ExampleItem(R.drawable.sixr, "Clicked at Studio"));
    }

    private void recyclerViewConfig() {

        //Configuration of Recycler View
        recyclerView = findViewById(R.id.recyclerView);

        //Performance boosting
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleList);

        //setting final recyclerView
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void addCard(int position){
        exampleList.add(position, new ExampleItem(R.drawable.node, "New card Added"));

        //Explicitly refresh our recycler view if we insert new values
//        adapter.notifyDataSetChanged(); //Not that optimised
        //Optimised
        adapter.notifyItemInserted(position);
    }

    public void deleteCard(int position){
        exampleList.remove(position);

        //Explicitly refresh our recycler view if we delete values
        adapter.notifyItemRemoved(position);
    }
}