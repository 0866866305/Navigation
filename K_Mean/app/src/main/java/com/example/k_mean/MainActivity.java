package com.example.k_mean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.k_mean.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        int a[]={1,1,2,4,4,5,5};
        int b[]={1,3,2,4,5,4,5};
        ArrayList lista=new ArrayList();
        ArrayList listb=new ArrayList();

        for (int i = 0; i <a.length ; i++) {
            int c= (int) Math.sqrt((Math.pow(3-a[i],2))+(Math.pow(10/3-b[i],2)));
//            binding.lvList.setTextAlignment(c);
            lista.add(c);
        }
        for (int i = 0; i <a.length ; i++) {
            int c= (int) Math.sqrt((Math.pow(3.25-a[i],2))+(Math.pow(3.5-b[i],2)));
            listb.add(c);
        }



    }


}