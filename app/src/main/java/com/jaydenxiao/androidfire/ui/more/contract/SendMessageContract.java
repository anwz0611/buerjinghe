package com.jaydenxiao.androidfire.ui.more.contract;

import com.jaydenxiao.androidfire.bean.SendMessageBeans;
import com.jaydenxiao.common.base.BaseModel;
import com.jaydenxiao.common.base.BasePresenter;
import com.jaydenxiao.common.base.BaseView;

import java.util.List;

import rx.Observable;

/**
 * Created by Zwei  on 2018/8/1.
 * E-Mail Address：592296083@qq.com
 */

public interface SendMessageContract {

    interface Model extends BaseModel {
        //请求历史河道水情列表
        Observable<SendMessageBeans> SendMessage(String phoneList, String content);
    }
    interface View extends BaseView {
        //返回获取的历史河道水情列表
        void returnSendMessage(SendMessageBeans sendMessageBeans);

    }

    abstract static class Presenter extends BasePresenter<View, Model> {
        //发起获取水情请求
        public abstract void SendMessageRequest(String phoneList,String content);
    }


}
