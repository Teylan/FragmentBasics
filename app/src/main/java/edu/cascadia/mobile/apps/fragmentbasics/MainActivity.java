package edu.cascadia.mobile.apps.fragmentbasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        fm.beginTransaction()
                .add(R.id.fragment_place, new FragmentA(), "fragA")
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();

    }
    //TODO: Prepare an function for the button to load fragment B into the fragment place

    // ALSO: put the current fragment onto the back stack and set a transition
    public void onSwitchFrag(View view) {

        if(fm.findFragmentByTag("fragA").isVisible()){

            fm.beginTransaction()
                    .replace(R.id.fragment_place, new FragmentB(), "fragB")
                    .addToBackStack(null)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit();
        }
        else{

            fm.beginTransaction()
                    .replace(R.id.fragment_place, new FragmentA(), "fragA")
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .addToBackStack(null)
                    .commit();
        }



    }
    @Override
    public void onBackPressed(){
        if(fm.getBackStackEntryCount()>0){
            fm.popBackStack();

        }
        else{
            super.onBackPressed();
        }
    }
}

    //TODO: Override the onBackPressed() Activity method to make fragments respond to the "Back" button


