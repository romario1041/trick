package digitalhouse.com.entregaveldh.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import digitalhouse.com.entregaveldh.Model.Receita;
import digitalhouse.com.entregaveldh.R;
import digitalhouse.com.entregaveldh.ViewHolderJoao;

public class AdapterRecycler extends RecyclerView.Adapter<ViewHolderJoao> {

    private List<Receita> receitas;

    public AdapterRecycler(List<Receita> receitas) {
        this.receitas = receitas;
    }

    @Override
    public ViewHolderJoao onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolderJoao(inflater.inflate(R.layout.itens, parent, false));
    }


    @Override
    public void onBindViewHolder(ViewHolderJoao holder, int position) {
        Receita r = receitas.get(position);
       holder.bind(receitas.get(position).getNome(), receitas.get(position).getConteudo());
    }

    @Override
    public int getItemCount() {
        return receitas.size();
    }
}
