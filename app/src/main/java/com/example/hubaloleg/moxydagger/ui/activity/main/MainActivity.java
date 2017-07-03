package com.example.hubaloleg.moxydagger.ui.activity.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.example.hubaloleg.moxydagger.di.DaggerMainComponent;
import com.example.hubaloleg.moxydagger.di.MainModule;
import com.example.hubaloleg.moxydagger.presentation.view.main.MainView;
import com.example.hubaloleg.moxydagger.presentation.presenter.main.MainPresenter;

import com.example.hubaloleg.moxydagger.R;

import com.arellomobile.mvp.presenter.InjectPresenter;

import javax.inject.Inject;

public class MainActivity extends MvpAppCompatActivity implements MainView {
    public static final String TAG = "MainActivity";

    @Inject
    @InjectPresenter
    MainPresenter mMainPresenter;

    @ProvidePresenter
    public MainPresenter provideMainPresenter() {
        return mMainPresenter;
    }

    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, MainActivity.class);

        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DaggerMainComponent.builder()
                .mainModule(new MainModule())
                .build().inject(MainActivity.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
