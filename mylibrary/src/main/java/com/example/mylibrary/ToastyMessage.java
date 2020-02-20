package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastyMessage {

    public static void set(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }

}
