package com.example.demo1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView=findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new GiaodichFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment = null;;

            switch (menuItem.getItemId()){
                case R.id.giaodich:
                    fragment=new GiaodichFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                    break;
                case R.id.baocao:
                    fragment=new BaocaoFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                    break;

                case R.id.ngansach:
                    fragment=new NgansachFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                    break;

                case R.id.them:
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                     startActivity(intent);
                    break;

                case R.id.khac:
                    fragment=new KhacFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                    break;
            }
//            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

            return true;
        }
    };

}