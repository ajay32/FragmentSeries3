package com.hackingbuzz.fragmentseries3;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

// I colored the fragments...now it seems like its replacing the fragments ...but its not...its adding onto each other...but colors created the illusion that its replacing...see next tut to find out..
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public void a(View view) {
      Fragment1 f1 = new Fragment1();
      FragmentManager manager = getFragmentManager();
      FragmentTransaction transaction = manager.beginTransaction();
      transaction.add(R.id.base_layout,f1,"frag1");   // here 1st parameter tell thell base layout onto we gonna put on our fragments..
      transaction.commit();

  }

    public void b(View view) {
        Fragment2 f2 = new Fragment2();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.base_layout,f2,"frag2");
        transaction.commit();


    }

    public void c(View view) {
        Fragment3 f3 = new Fragment3();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.base_layout,f3,"frag3");
        transaction.commit();


    }
}

