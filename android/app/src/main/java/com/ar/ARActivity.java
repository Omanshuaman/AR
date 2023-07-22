package com.ar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.ar.sceneform.ux.ArFragment;


public class ARActivity extends AppCompatActivity  {
    private ArFragment arFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aractivity);
        // Initialize the AR fragment
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arFragment);

        // Load the glb model and display it when the user taps on a plane
        assert arFragment != null;
        arFragment.setOnTapPlaneGlbModel("https://arnxt-models-webar.s3.ap-south-1.amazonaws.com/curtain.glb");

    }


}