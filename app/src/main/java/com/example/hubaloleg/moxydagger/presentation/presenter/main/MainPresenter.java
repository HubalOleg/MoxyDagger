package com.example.hubaloleg.moxydagger.presentation.presenter.main;


import android.util.Log;

import com.example.hubaloleg.moxydagger.presentation.view.main.MainView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import javax.inject.Inject;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    private static final String TAG = "MainPresenter";

    private final String showMessage;

    @Inject
    public MainPresenter(String showMessage) {
        this.showMessage = showMessage;
        Log.d(TAG, "MainPresenter: ");
    }

    @Override
    protected void onFirstViewAttach() {
        Log.d(TAG, "onFirstViewAttach: ");
        super.onFirstViewAttach();
        getViewState().showMessage(showMessage);
    }
}
