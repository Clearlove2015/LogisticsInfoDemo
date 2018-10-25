package com.odbpo.fenggou.logisticsinfodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.odbpo.fenggou.logisticsinfodemo.adapter.LogisticsInfoAdapter;
import com.odbpo.fenggou.logisticsinfodemo.util.InitDataUtil;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * https://github.com/hexianqiao3755/LogisticsDisplayExample
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rv)
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initRV();
    }

    public void initRV() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new LogisticsInfoAdapter(this, R.layout.item_logistics, InitDataUtil.getData()));
    }

}
