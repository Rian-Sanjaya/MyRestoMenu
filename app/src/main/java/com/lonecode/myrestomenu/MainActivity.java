package com.lonecode.myrestomenu;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMenu;
    private ArrayList<Menu> list = new ArrayList<>();
    private String titleBar = "My Resto Menu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMenu = findViewById(R.id.rv_menu);
        rvMenu.setHasFixedSize(true);

        list.addAll(MenusData.getListData());
        showRecyclerList();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle((titleBar));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return  super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                if (getSupportActionBar() != null) {
//                    Toast.makeText(this, "About activity", Toast.LENGTH_SHORT).show();
                    Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(moveIntent);
                }
        }
    }

    private void showRecyclerList() {
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        ListMenuAdapter listMenuAdapter = new ListMenuAdapter((list));
        rvMenu.setAdapter(listMenuAdapter);

        listMenuAdapter.setOnItemClickCallback(new ListMenuAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Menu data) {
                showSelectedMenu(data);
            }
        });
    }

    private void showSelectedMenu(Menu menu) {
//        Toast.makeText(this, "Kamu memilih menu " + menu.getId() + ". " + menu.getName(), Toast.LENGTH_SHORT).show();

        Intent moveWithDataIntent = new Intent(MainActivity.this, MenuDetailActivity.class);
        moveWithDataIntent.putExtra(MenuDetailActivity.EXTRA_NAME, menu.getName());
        moveWithDataIntent.putExtra(MenuDetailActivity.EXTRA_DESC, menu.getDesc());
        moveWithDataIntent.putExtra(MenuDetailActivity.EXTRA_PRICE, menu.getPrice());
        moveWithDataIntent.putExtra(MenuDetailActivity.EXTRA_PHOT0, menu.getPhoto());
        startActivity(moveWithDataIntent);
    }
}
