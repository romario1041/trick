package digitalhouse.com.entregaveldh.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterPage extends FragmentStatePagerAdapter {
    List<Fragment> lista;

    public AdapterPage(FragmentManager fm ) {
        super(fm);
        this.lista = new ArrayList<>();

    }

    @Override
    public Fragment getItem(int position) {
        return (lista).get(position);
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    public void add(Fragment f){
        lista.add(f);
    }
}
