package com.jaydenxiao.androidfire.ui.more.presenter;

import com.jaydenxiao.androidfire.R;
import com.jaydenxiao.androidfire.app.AppConstant;
import com.jaydenxiao.androidfire.bean.PolicyLawInfoBeans;
import com.jaydenxiao.androidfire.bean.SendMessageBeans;
import com.jaydenxiao.androidfire.ui.more.contract.PolicyLawInfoContract;
import com.jaydenxiao.androidfire.ui.more.contract.SendMessageContract;
import com.jaydenxiao.common.baserx.RxSubscriber;

import java.util.List;

import rx.functions.Action1;

/**
 * Created by Zwei  on 2018/5/30.
 * E-Mail Address：592296083@qq.com
 */

public class SendMessagePresenter extends SendMessageContract.Presenter {
    @Override
    public void SendMessageRequest(String phoneList, String content) {
        mRxManage.add(mModel.SendMessage(phoneList,content).subscribe(new RxSubscriber<SendMessageBeans>(mContext, false) {
            @Override
            protected void _onNext(SendMessageBeans SendMessageBeans) {
                mView.returnSendMessage(SendMessageBeans);
                mView.stopLoading();
            }

            @Override
            public void onStart() {
                super.onStart();
                mView.showLoading(mContext.getString(R.string.loading));
            }

            @Override
            protected void _onError(String message) {
                mView.showErrorTip(message);
            }
        }));


    }

    @Override
    public void onStart() {
        super.onStart();

    }


}
