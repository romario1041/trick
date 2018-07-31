package digitalhouse.com.entregaveldh.Fragments;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import digitalhouse.com.entregaveldh.Adapters.AdapterRecycler;
import digitalhouse.com.entregaveldh.Model.Receita;
import digitalhouse.com.entregaveldh.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3List extends Fragment {


    public Fragment3List() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =  inflater.inflate(R.layout.fragment_fragment1_list, container, false);

        List<Receita> receitas = new ArrayList<>();
        Receita r1  = new Receita("Pudim", "Em uma panela, misture a água e o açúcar até formar uma calda " +
                "Unte uma forma com a calda e reserve");
        Receita r2 = new Receita("Bolo", "Bata as claras em neve e reserve.");
        Receita r3 = new Receita("Macarrao com queijo", "Em uma panela derreta a manteiga, junte o creme de leite e o leite.");
        Receita r4 = new Receita("Bolo", "Bata as claras em neve e reserve.");
        Receita r5 = new Receita("Bolo", "Bata as claras em neve e reserve.");
        Receita r6 = new Receita("Bolo", "Bata as claras em neve e reserve.");

        receitas.add(r1);
        receitas.add(r2);
        receitas.add(r3);
        receitas.add(r4);
        receitas.add(r5);
        receitas.add(r6);



        AdapterRecycler adapterRecycler = new AdapterRecycler(receitas);
        RecyclerView recyclerView = v.findViewById(R.id.reclyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
        recyclerView.setAdapter(adapterRecycler);

        return v;
    }

}
