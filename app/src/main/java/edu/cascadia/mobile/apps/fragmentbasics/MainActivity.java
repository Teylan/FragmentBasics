package edu.cascadia.mobile.apps.fragmentbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState==null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_place,new FragmentA(),"fragA")
                    .commit();
        }

        //TODO: Prepare an function for the button to load fragment B into its spot
        // HINT: this is much the same as the transaction above except done on the button click


        //TODO: Modify your onClick Listener for button above to replace fragmentA with fragmentB
        // ALSO: put the current fragment onto the backstack
    }

}
