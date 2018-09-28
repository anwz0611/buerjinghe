package com.jaydenxiao.androidfire.ui.main.fragment;

import android.view.View;

import com.jaydenxiao.androidfire.R;
import com.jaydenxiao.androidfire.ui.bases.activity.AssociationInfoActivity;
import com.jaydenxiao.common.base.BaseFragment;
import com.jaydenxiao.common.commonwidget.NormalTitleBar;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by Zwei  on 2018/6/7.
 * E-Mail Address：592296083@qq.com
 */

public class JichuFragment extends BaseFragment {
    @Bind(R.id.ntb)
    NormalTitleBar ntb;
    @Override
    protected int getLayoutResource() {
        return R.layout.jichu_fragment;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    protected void initView() {
        ntb.setTvLeftVisiable(false);
        ntb.setTitleText(getString(R.string.jichu_title));
    }
    @OnClick({R.id.layout_base_quhua, R.id.layout_ad_station, R.id.layout_small_watersh, R.id.layout_heliu, R.id.layout_difang})
    public void OnClick(View view){
    switch (view.getId()){

        case R.id.layout_base_quhua:

            break;
        case R.id.layout_ad_station:

            break;
        case R.id.layout_small_watersh:
            AssociationInfoActivity.startAction(getContext());
            break;
        case R.id.layout_heliu:

            break;
        case R.id.layout_difang:

            break;
    }


    }
}
