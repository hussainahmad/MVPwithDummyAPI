package com.hussain.progosteach.mvpwithdummyapi.feature;

import com.hussain.progosteach.mvpwithdummyapi.base.ui.BasePresenter;
import com.hussain.progosteach.mvpwithdummyapi.model.ModelClass;
import com.hussain.progosteach.mvpwithdummyapi.networks.NetworkCallback;

/**
 * Created by Hussain Sherwani
 * on 08-Jun-17
 * email: hussain.ahmed@progos.org .
 */

public class MainPresenter extends BasePresenter<MainView> {
    MainPresenter(MainView view) {
        super.attachView(view);
    }
    void loadData() {
        view.showLoading();
        addSubscribe(apiStores.showUser(), new NetworkCallback(ModelClass) {
            @Override
            public void onSuccess(ModelClass model) {
                view.getDataSuccess(model);
            }

            @Override
            public void onFailure(String message) {
                view.getDataFail(message);
            }

            @Override
            public void onFinish() {
                view.hideLoading();
            }
        });
    }
}
