package com.rom.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecSolar = tabHost.newTabSpec("Solar").setIndicator("솔라");
        tabSpecSolar.setContent(R.id.linear_solar);
        tabHost.addTab(tabSpecSolar);

        TabHost.TabSpec tabSpecMoonstar = tabHost.newTabSpec("Moonstar").setIndicator("문별");
        tabSpecMoonstar.setContent(R.id.linear_moonstar);
        tabHost.addTab(tabSpecMoonstar);

        TabHost.TabSpec tabSpecHwasa = tabHost.newTabSpec("Hwasa").setIndicator("화사");
        tabSpecHwasa.setContent(R.id.linear_hwasa);
        tabHost.addTab(tabSpecHwasa);

        tabHost.setCurrentTab(0);
    }
}