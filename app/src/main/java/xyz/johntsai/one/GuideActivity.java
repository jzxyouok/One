package xyz.johntsai.one;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by JohnTsai(mailto:johntsai.work@gmail.com) on 16/7/27.
 * 引导页
 */
public class GuideActivity extends BaseActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
    }
}
