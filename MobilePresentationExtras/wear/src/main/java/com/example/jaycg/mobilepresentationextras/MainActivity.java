package com.example.jaycg.mobilepresentationextras;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.wearable.view.CardFragment;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.round_activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CardFragment cardFragment = CardFragment.create(getString(R.string.title),
                getString(R.string.hello_round),
                R.drawable.card_frame);
        fragmentTransaction.add(R.id.frame_layout, cardFragment);
        fragmentTransaction.commit();

        //setContentView(R.layout.card);
    }
}
