package com.ditec.misuperparte2;

import android.app.IntentService;
import android.content.Intent;

import java.io.IOException;

public class IntentServiceMusica extends IntentService {
    public IntentServiceMusica() {
        super("IntentServiceOperacion");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            Multimedia3.mediaPlayer.setDataSource("https://migrandiosaappwilson.000webhostapp.com/dancing.mp3");
            Multimedia3.mediaPlayer.prepare();
        } catch (IOException e) {
        }
    }
}
