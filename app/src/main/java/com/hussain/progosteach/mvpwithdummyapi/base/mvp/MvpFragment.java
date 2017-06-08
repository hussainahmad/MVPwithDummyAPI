package com.hussain.progosteach.mvpwithdummyapi.base.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.hussain.progosteach.mvpwithdummyapi.base.ui.BaseFragment;
import com.hussain.progosteach.mvpwithdummyapi.base.ui.BasePresenter;


/**
 * Created by alandwiprasetyo on 11/23/16.
 */

public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment {
    protected P presenter;

    protected abstract P createPresenter();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        presenter = createPresenter();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.dettachView();
        }
    }
}
