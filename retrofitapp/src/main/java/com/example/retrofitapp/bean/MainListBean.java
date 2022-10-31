package com.example.retrofitapp.bean;

import com.example.retrofitapp.network.BaseResponseBean;

public class MainListBean extends BaseResponseBean {
    private MainPageBean respObject;

    public MainPageBean getRespObject() {
        return respObject;
    }

    public void setRespObject(MainPageBean respObject) {
        this.respObject = respObject;
    }
}
