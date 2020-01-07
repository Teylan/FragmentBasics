package edu.cascadia.mobile.apps.fragmentbasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        fm.beginTransaction()
                .add(R.id.fragment_place, new FragmentB(), "frag")
                .commit();
    }
    //TODO: Prepare an function for the button to load fragment B into the fragment place
    // ALSO: put the current fragment onto the back stack and set a transition
    public void onSwitchFrag(View view) {

    }

    //TODO: Override the onBackPressed() Activity method to make fragments respond to the "Back" button


}
