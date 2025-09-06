package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;

public class ItensActivity extends AppCompatActivity {
    ViewPager2 idViewPagerItens;
    TabLayout idTabItemPromo;

    MaterialToolbar idMaterialToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.itens_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idMaterialToolBar = findViewById(R.id.idMaterialToolBar);
        idViewPagerItens = findViewById(R.id.idViewPagerItens);
        idTabItemPromo = findViewById(R.id.idTabItemPromo);

        idMaterialToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SplashActivity.class));
            }
        });

        AdapterItensCompraUnica adapterItensCompraUnica = new AdapterItensCompraUnica(this);
        idViewPagerItens.setAdapter(adapterItensCompraUnica);




    }
}