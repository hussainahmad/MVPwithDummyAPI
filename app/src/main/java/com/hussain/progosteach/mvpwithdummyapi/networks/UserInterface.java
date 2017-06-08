package com.hussain.progosteach.mvpwithdummyapi.networks;

import com.hussain.progosteach.mvpwithdummyapi.utility.Constant;
import com.hussain.progosteach.mvpwithdummyapi.model.ModelClass;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Hussain Sherwani on 15-May-17
 * hussain.ahmed@progos.org .
 */

public interface UserInterface {
    @GET(Constant.http.END_POINT)
    Observable<List<ModelClass>> showUser();
}
