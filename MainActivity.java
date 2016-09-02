package com.example.admin.contextxml;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.ContextMenu;

import android.view.MenuItem;

import android.view.View;

import android.widget.TextView;

import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    TextView t1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.textView);

        registerForContextMenu(t1);

    }



    @Override

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.menu,menu);

        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Context Menu");

    }


    @Override

    public boolean onContextItemSelected(MenuItem item) {



        switch (item.getItemId()){

            case R.id.action1:

                Toast.makeText(MainActivity.this, "Action 1 is Selected", Toast.LENGTH_SHORT).show();

                break;

            case R.id.action2:

                Toast.makeText(MainActivity.this, "Action 2 is Selected", Toast.LENGTH_SHORT).show();

                break;

            case R.id.action3:

                Toast.makeText(MainActivity.this, "Action 3 is Selected", Toast.LENGTH_SHORT).show();

                break;

            case R.id.action4:

                Toast.makeText(MainActivity.this, "Action 4 is Selected", Toast.LENGTH_SHORT).show();

                break;

        }

        return super.onContextItemSelected(item);

    }

}

