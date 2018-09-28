package com.jaydenxiao.androidfire.ui.more.model;

import com.jaydenxiao.androidfire.api.Api;
import com.jaydenxiao.androidfire.api.HostType;
import com.jaydenxiao.androidfire.bean.PolicyLawInfoBeans;
import com.jaydenxiao.androidfire.bean.SendMessageBeans;
import com.jaydenxiao.androidfire.ui.more.contract.PolicyLawInfoContract;
import com.jaydenxiao.androidfire.ui.more.contract.SendMessageContract;
import com.jaydenxiao.common.baserx.RxSchedulers;

import java.util.List;

import rx.Observable;


/**
 * Created by Zwei  on 2018/5/30.
 * E-Mail Address：592296083@qq.com
 */

public class SendMessageModel implements SendMessageContract.Model {

    @Override
    public Observable<SendMessageBeans> SendMessage(String phoneList, String content) {
        return Api.getDefault(HostType.NETEASE_NEWS_VIDEO).sendMessage(phoneList,content)
                .compose(RxSchedulers.<SendMessageBeans>io_main());
    }

}
