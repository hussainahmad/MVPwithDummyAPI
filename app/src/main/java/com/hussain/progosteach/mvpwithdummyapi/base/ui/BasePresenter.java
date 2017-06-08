package com.hussain.progosteach.mvpwithdummyapi.base.ui;

import android.util.Log;

import com.hussain.progosteach.mvpwithdummyapi.networks.NetworkClient;
import com.hussain.progosteach.mvpwithdummyapi.networks.UserInterface;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Hussain Sherwani
 * on 08-Jun-17
 * email: hussain.ahmed@progos.org .
 */

public class BasePresenter<V> {
    public V view;
    protected UserInterface apiStores;
    private CompositeSubscription compositeSubscription;
    private Subscriber subscriber;
    public void attachView(V view) {
        this.view = view;
        apiStores = NetworkClient.getRetrofit().create(UserInterface.class);
    }

    public void dettachView() {
        this.view = null;
        onUnsubscribe();
    }

    public void onUnsubscribe() {
        if (compositeSubscription != null && compositeSubscription.hasSubscriptions()) {
            compositeSubscription.unsubscribe();
            Log.e("TAG", "onUnsubscribe: ");
        }
    }

    protected void addSubscribe(Observable observable, Subscriber subscriber) {
        this.subscriber = subscriber;
        if (compositeSubscription == null) {
            compositeSubscription = new CompositeSubscription();
        }
        compositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
    }

    public void stop() {
        if (subscriber != null) {
            subscriber.unsubscribe();
        }
    }
}
