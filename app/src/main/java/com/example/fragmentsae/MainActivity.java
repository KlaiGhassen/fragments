package com.example.fragmentsae;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragement1()).commit();

        Button frag1= findViewById(R.id.fragment1);
        Button frag2= findViewById(R.id.fragment2);
        Button frag3= findViewById(R.id.fragment3);
        frag1.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragement1()).commit();
        });
        frag2.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment2()).commit();
        });
        frag3.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new Fragment3()).commit();
        });


    }
}