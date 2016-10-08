package com.jiahouse.jiahouse.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.jiahouse.jiahouse.R;

public class new_repair_avtivity extends AppCompatActivity {

    LinearLayout addlayout=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_repair_avtivity);
        addlayout=(LinearLayout)findViewById(R.id.new_repair_addbtn);
        addlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(new_repair_avtivity.this,new_repair_add.class);
                startActivity(intent);
            }
        });

    }
}
