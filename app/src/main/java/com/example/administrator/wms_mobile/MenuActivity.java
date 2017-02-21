package com.example.administrator.wms_mobile;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.RelativeLayout;

import com.example.administrator.util.MyAdapter;

public class MenuActivity extends AppCompatActivity {

    int[] menuImages = new int[]{
        R.mipmap.outfrm,
        R.mipmap.infrm,
        R.mipmap.itemquery,
        R.mipmap.infrm,
        R.mipmap.outfrm,
        R.mipmap.infrm,
        R.mipmap.outfrm,
        R.mipmap.infrm,
        R.mipmap.outfrm,
        R.mipmap.infrm,
    };
    String[] menuName = new String[]{
        "出库",
        "入库",
        "库存查询",
        "入库",
        "出库",
        "入库",
        "出库",
        "入库",
        "出库",
        "入库",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        RelativeLayout menurelativeLayout = (RelativeLayout) findViewById(R.id.activity_menu);
//        Resources resources = getBaseContext().getResources();
//        Drawable menuBgImage = resources.getDrawable(R.mipmap.menu_bgimage);
//        menurelativeLayout.setBackgroundDrawable(menuBgImage);
        menurelativeLayout.setBackgroundColor(Color.rgb(220,220,220));
        GridView menuGridView = (GridView) findViewById(R.id.menuGridView);
        menuGridView.setAdapter(new MyAdapter(menuImages,menuName,this));

    }
}
