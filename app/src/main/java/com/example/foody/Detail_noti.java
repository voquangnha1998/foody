package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class Detail_noti extends AppCompatActivity {

    TextView name,mota,gio;
    ImageView imageView;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_noti);

        name = findViewById(R.id.dname);
        imageView = findViewById(R.id.imageView);
        mota = findViewById(R.id.dmota);
        gio = findViewById(R.id.dgio);
        back = findViewById(R.id.imgback);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        String receivedGio =  intent.getStringExtra("gio");
        String receivedMota =  intent.getStringExtra("mota");

        name.setText(receivedName);
        imageView.setImageResource(receivedImage);
        gio.setText(receivedGio);
        mota.setText(receivedMota);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail_noti.this,NotiFragment.class); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();
            }
        });
    }
}