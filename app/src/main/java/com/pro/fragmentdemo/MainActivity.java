package com.pro.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClicked(View view) {
        switch (view.getId()) {
            case R.id.fragmentHome :
                fragmentHome = findViewById(R.id.fragmentHome);
                fragmentHome.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        FragmentManager fManager = getSupportFragmentManager();
                        FragmentTransaction fTransaction = fManager.beginTransaction();
                        fragmentHome = new FirstFragment();
                        fTransaction.replace(R.id.fragmentContainer, fragmentHome);
                        fTransaction.addToBackStack(null);
                        fTransaction.commit();
                break;

            case  R.id.fragmentExplore :
                fragmentOne = findViewById(R.id.fragmentOne);
                        fragmentOne.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                FragmentManager fManager = getSupportFragmentManager();
                                FragmentTransaction fTransaction = fManager.beginTransaction();
                                FirstFragment firstFragment = new FirstFragment();
                                fTransaction.replace(R.id.fragmentContainer, firstFragment);
                                fTransaction.addToBackStack(null);
                                fTransaction.commit();
                break;

            case R.id.fragmentAdd :
                                fragmentOne = findViewById(R.id.fragmentOne);
                                fragmentOne.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        FragmentManager fManager = getSupportFragmentManager();
                                        FragmentTransaction fTransaction = fManager.beginTransaction();
                                        FirstFragment firstFragment = new FirstFragment();
                                        fTransaction.replace(R.id.fragmentContainer, firstFragment);
                                        fTransaction.addToBackStack(null);
                                        fTransaction.commit();
                break;

            case R.id.fragmentFavorite :
                                        fragmentOne = findViewById(R.id.fragmentOne);
                                        fragmentOne.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                FragmentManager fManager = getSupportFragmentManager();
                                                FragmentTransaction fTransaction = fManager.beginTransaction();
                                                FirstFragment firstFragment = new FirstFragment();
                                                fTransaction.replace(R.id.fragmentContainer, firstFragment);
                                                fTransaction.addToBackStack(null);
                                                fTransaction.commit();
                break;

            case R.id.fragmentProfile :
                                                fragmentOne = findViewById(R.id.fragmentOne);
                                                fragmentOne.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {

                                                        FragmentManager fManager = getSupportFragmentManager();
                                                        FragmentTransaction fTransaction = fManager.beginTransaction();
                                                        FirstFragment firstFragment = new FirstFragment();
                                                        fTransaction.replace(R.id.fragmentContainer, firstFragment);
                                                        fTransaction.addToBackStack(null);
                                                        fTransaction.commit();
                break;

                default:
                    break;
        }
    }
}
