package com.example.quizapp21.ui.main;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {


    public MutableLiveData<String> mResult = new MutableLiveData();

    public void test(){
        String result;
        int firstNumber =1;
        int secondNumber =1;

        result = String.valueOf(firstNumber + secondNumber);

        mResult.setValue(result);


        /*mResult.postValue(result);*/
    }
}