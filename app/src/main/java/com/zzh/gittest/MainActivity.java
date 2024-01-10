package com.zzh.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    // remote branch
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Map<String, String> map = new HashMap<>();
        map.put("b", Constants.str);

        // haha
        // xixi haha
        // ni hao
    }
}
