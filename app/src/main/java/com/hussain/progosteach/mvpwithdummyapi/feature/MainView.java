package com.hussain.progosteach.mvpwithdummyapi.feature;

import android.content.Intent;

import com.hussain.progosteach.mvpwithdummyapi.model.ModelClass;

/**
 * Created by Hussain Sherwani
 * on 08-Jun-17
 * email: hussain.ahmed@progos.org .
 */

public interface MainView {
    void showLoading();

    void hideLoading();

    void getDataSuccess(ModelClass model);

    void getDataFail(String message);

    void moveToDetail(Intent intent);
}
