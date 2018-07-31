package digitalhouse.com.entregaveldh;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class ViewHolderJoao extends RecyclerView.ViewHolder {

    public TextView text_card;
    public TextView text_card_conteudo;
    public ImageView img_cardview;

    public ViewHolderJoao (View itemView) {
            super(itemView);
            this.text_card = (TextView) itemView.findViewById(R.id.text_card);
            this.text_card_conteudo = (TextView) itemView.findViewById(R.id.text_card_conteudo);
            this.img_cardview = (ImageView) itemView.findViewById(R.id.img_cardview);
        }
        public void bind(String nome, String conteudo){

            this.text_card.setText(nome);
            this.text_card_conteudo.setText(conteudo);


        }

    }


