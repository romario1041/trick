package digitalhouse.com.entregaveldh;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import digitalhouse.com.entregaveldh.Adapters.AdapterPage;
import digitalhouse.com.entregaveldh.Fragments.Fragment1List;
import digitalhouse.com.entregaveldh.Fragments.Fragment2List;
import digitalhouse.com.entregaveldh.Fragments.Fragment3List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //criei a lista de fragment
            //Fazendo os fragments
            Fragment1List list1 = new Fragment1List();
            Fragment2List list2 = new Fragment2List();
            Fragment3List list3 = new Fragment3List();


            //Criando o Adapter ao Fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
            //criando o adapter e passando pra ele o FragmentManager
            AdapterPage pagerAdapter = new AdapterPage(fragmentManager);
            //Criando o view pager e passando o XML dele

            //inserindo os Fragments nos List
            pagerAdapter.add(list1);
            pagerAdapter.add(list2);
            pagerAdapter.add(list3);

            //Criando o viewpager
            ViewPager viewpager = findViewById(R.id.viewPager);
            //Inserindo o view page ao Adapter
            viewpager.setAdapter(pagerAdapter);

        }
    }

