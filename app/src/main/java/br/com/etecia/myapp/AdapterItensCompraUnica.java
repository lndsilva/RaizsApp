package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterItensCompraUnica extends FragmentStateAdapter {

    public AdapterItensCompraUnica(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PromocoesFragment();
            case 1:
                return new NovidadesFragment();
            case 2:
                return new OriginaisFragment();
            case 3:
                return new NossaHortaFragment();
            case 4:
                return new MerceariaFragment();
            case 5:
                return new BebidasFragment();
            case 6:
                return new CarnesOvosFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}

