package sravya.example.com.infinitecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> listImages=new  ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        HorizontalInfiniteCycleViewPager pager=(HorizontalInfiniteCycleViewPager)findViewById(R.id.infinite_id);
        MyAdapter adapter=new MyAdapter(listImages,getBaseContext());
        pager.setAdapter(adapter);
    }

    private void initData() {
        listImages.add(R.drawable.techtrix);
        listImages.add(R.drawable.event1);
        listImages.add(R.drawable.criminalcase);
        listImages.add(R.drawable.cryptothon);
      //  listImages.add(R.drawable.aeroplanechess);
        listImages.add(R.drawable.awalkinthedark);
        listImages.add(R.drawable.anwesha);
        listImages.add(R.drawable.beycode);
        listImages.add(R.drawable.dealornodeal);
        listImages.add(R.drawable.poster);
        listImages.add(R.drawable.alpatchino);
        //listImages.add(R.drawable.kncokofftournamnet);
    }
}
