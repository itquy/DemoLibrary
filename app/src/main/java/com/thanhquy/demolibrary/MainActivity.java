package com.thanhquy.demolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.thanhquy.plustwonumber.PlusNumber;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            PlusNumber pl = new PlusNumber();
            pl.setNumber(1,5);
            pl.getResult();
            Toast.makeText(this, "" + pl.getResult(), Toast.LENGTH_SHORT).show();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}