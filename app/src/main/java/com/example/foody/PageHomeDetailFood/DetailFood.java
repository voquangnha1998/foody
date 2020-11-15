package com.example.foody.PageHomeDetailFood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.foody.R;

import java.util.ArrayList;

public class DetailFood extends AppCompatActivity {

    TextView name;
    ImageView imageView;
    ImageButton back;
    ListView listView;
    ArrayList<Food> arrayList;
    AdapterFood adapter;
    int location=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        name = findViewById(R.id.detail_name);
        imageView = findViewById(R.id.detail_img);
        back = findViewById(R.id.imgback);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);

        name.setText(receivedName);
        imageView.setImageResource(receivedImage);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailFood.this, GantoiFragment.class); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();
            }
        });

        mapping();
        adapter=new AdapterFood(DetailFood.this,R.layout.row_home_detail_food,arrayList);
        listView.setAdapter(adapter);



    }
    private void mapping(){
        listView=(ListView) findViewById(R.id.listView);
        arrayList=new ArrayList<>();
        arrayList.add(new Food(R.drawable.stbo,"Sinh tố bơ","25000đ"));
        arrayList.add(new Food(R.drawable.cocbia,"Sinh tố lúa mạch","100000đ"));
        arrayList.add(new Food(R.drawable.travai,"Trà vải","25000đ"));
        arrayList.add(new Food(R.drawable.tradao,"Trà đào","25000đ"));
        arrayList.add(new Food(R.drawable.epoi,"Nước ép ổi","25000đ"));
        arrayList.add(new Food(R.drawable.epdau,"Nước ép dâu","20000đ"));
        arrayList.add(new Food(R.drawable.trachanh,"Trà chanh","20000đ"));
        arrayList.add(new Food(R.drawable.epcoc,"Nước ép cóc","20000đ"));
        arrayList.add(new Food(R.drawable.suadau,"Sữa chua dâu","20000đ"));
        arrayList.add(new Food(R.drawable.stbo,"Sinh tố bơ","25000đ"));
        arrayList.add(new Food(R.drawable.cocbia,"Sinh tố lúa mạch","100000đ"));
        arrayList.add(new Food(R.drawable.travai,"Trà vải","25000đ"));
        arrayList.add(new Food(R.drawable.tradao,"Trà đào","25000đ"));
        arrayList.add(new Food(R.drawable.epoi,"Nước ép ổi","25000đ"));
        arrayList.add(new Food(R.drawable.epdau,"Nước ép dâu","20000đ"));
        arrayList.add(new Food(R.drawable.trachanh,"Trà chanh","20000đ"));
        arrayList.add(new Food(R.drawable.epcoc,"Nước ép cóc","20000đ"));
        arrayList.add(new Food(R.drawable.suadau,"Sữa chua dâu","20000đ"));
        arrayList.add(new Food(R.drawable.stbo,"Sinh tố bơ","25000đ"));
        arrayList.add(new Food(R.drawable.cocbia,"Sinh tố lúa mạch","100000đ"));
        arrayList.add(new Food(R.drawable.travai,"Trà vải","25000đ"));
        arrayList.add(new Food(R.drawable.tradao,"Trà đào","25000đ"));
        arrayList.add(new Food(R.drawable.epoi,"Nước ép ổi","25000đ"));
        arrayList.add(new Food(R.drawable.epdau,"Nước ép dâu","20000đ"));
        arrayList.add(new Food(R.drawable.trachanh,"Trà chanh","20000đ"));
        arrayList.add(new Food(R.drawable.epcoc,"Nước ép cóc","20000đ"));
        arrayList.add(new Food(R.drawable.suadau,"Sữa chua dâu","20000đ"));


    }
}