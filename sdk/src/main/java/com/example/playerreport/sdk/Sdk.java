package com.example.playerreport.sdk;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by gufei on 2017/2/6 0006.
 */

public class Sdk {
    private Context context;

    public Sdk(Context context) {
        this.context = context;
    }

    public void log(String log) {
        Log.i(getClass().getSimpleName(), log);
    }

    public void toast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
