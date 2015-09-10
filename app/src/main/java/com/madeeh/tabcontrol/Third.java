package com.madeeh.tabcontrol;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Third extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String txt=bundle.getString("yourname");

        TextView tv=(TextView)findViewById(R.id.tv_received);
        tv.setText(txt);

        Button btn=(Button)findViewById(R.id.third);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),First.class);
                startActivity(intent);
            }
        });
    }



}
