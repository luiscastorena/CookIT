package com.example.cookit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    Inicio inicio = new Inicio();
    Ingredientes ingredientes = new Ingredientes();
    Recetas recetas = new Recetas();
    Sesion sesion = new Sesion();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_logoinicial);
        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        CargarVista(inicio);

    }
    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.Inicio:
                    CargarVista(inicio);
                    return true;
                case R.id.Ingredientes:
                    CargarVista(ingredientes);
                    return true;
                case R.id.Recetas:
                    CargarVista(recetas);
                    return true;
                case R.id.Sesion:
                    CargarVista(sesion);
                    return true;
            }
            return false;
        }
    };
public void CargarVista(Fragment fragment){
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.frame_container, fragment);
    transaction.commit();
}
}