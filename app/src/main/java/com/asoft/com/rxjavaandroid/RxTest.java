package com.asoft.com.rxjavaandroid;

import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.Subscription;

/**
 * Created by ankit on 4/5/2017.
 */
public class RxTest {

    //just method creating Observable Object
    Observable<String> myObservable=Observable.just("Hello");
    /*Observable emits data
    This Observable emiting String data
     */

    Observer<String> observer=new Observer<String >() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {

            Log.d("My Observer",s);

        }
    };

    Subscription subscription=myObservable.subscribe(observer);


}
