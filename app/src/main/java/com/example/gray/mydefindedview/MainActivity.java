package com.example.gray.mydefindedview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   /* private WSCircleCd loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loading = (WSCircleCd) findViewById(R.id.loading);
        loading.startAnimator();
        loading.setPaintColor(Color.BLUE);
    }*/

    private ArcMenu mArcMenuLeftTop;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mArcMenuLeftTop = (ArcMenu) findViewById(R.id.id_arcmenu1);
        //动态添加一个MenuItem
        ImageView people = new ImageView(this);
        people.setImageResource(R.drawable.composer_with);
        people.setTag("People");
        mArcMenuLeftTop.addView(people);


        mArcMenuLeftTop
                .setOnMenuItemClickListener(new ArcMenu.OnMenuItemClickListener()
                {
                    @Override
                    public void onClick(View view, int pos)
                    {
                        Toast.makeText(MainActivity.this,
                                pos + ":" + view.getTag(), Toast.LENGTH_SHORT)
                                .show();
                    }
                });
    }

}
