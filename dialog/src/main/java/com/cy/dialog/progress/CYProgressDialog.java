package com.cy.dialog.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

import com.cy.dialog.BaseDialog;


/**
 * Created by lenovo on 2017/12/20.
 */

public class CYProgressDialog extends BaseDialog {

    private MaterialProgressDrawable mProgress;

    private ValueAnimator valueAnimator;

    public CYProgressDialog(Context context) {
        super(context);
        setCanceledOnTouchOutside(false);

    }

    /**
     * @param color_iv
     * @param radius_iv
     * @param color_bg_progress
     * @param colors_progress
     * @return
     */

    public CYProgressDialog config(int color_iv, float radius_iv, int color_bg_progress, int... colors_progress) {
        config(0.2f, color_iv, radius_iv, color_bg_progress, colors_progress);


        return this;
    }

    public CYProgressDialog config(float dimAmount, int color_iv, float radius_iv, int color_bg_progress, int... colors_progress) {


        FrameLayout frameLayout = new FrameLayout(getContext());


        CircleImageView imageView = new CircleImageView(getContext(), color_iv, radius_iv);


        mProgress = new MaterialProgressDrawable(getContext(), imageView);


        mProgress.setBackgroundColor(color_bg_progress);
        //圈圈颜色,可以是多种颜色
        mProgress.setColorSchemeColors(colors_progress);
        //设置圈圈的各种大小
        mProgress.updateSizes(MaterialProgressDrawable.DEFAULT);

        mProgress.showArrow(false);
        imageView.setImageDrawable(mProgress);

        frameLayout.addView(imageView);


        valueAnimator = valueAnimator.ofFloat(0f, 1f);
        valueAnimator.setDuration(600);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float n = (float) animation.getAnimatedValue();
                //圈圈的旋转角度
                mProgress.setProgressRotation(n * 0.5f);
                //圈圈周长，0f-1F
                mProgress.setStartEndTrim(0f, n * 0.8f);
                //箭头大小，0f-1F
                mProgress.setArrowScale(n);
                //透明度，0-255
                mProgress.setAlpha((int) (255 * n));
            }
        });

        getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
        setContentView(frameLayout);


        setDimAmount(dimAmount);

        setOnKeyListener(new OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {

                if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
                    hide();
                    return true;
                }
                return false;
            }
        });

        return this;
    }

    @Override
    public void show() {
        super.show();
        if (mProgress == null) return;

        mProgress.start();
        if (valueAnimator == null) return;

        valueAnimator.start();


    }

    @Override
    public void hide() {
        super.hide();
        if (mProgress == null) return;

        mProgress.stop();
        if (valueAnimator == null) return;

        valueAnimator.cancel();


    }

    public void setBackgroundColor(int color) {
        if (mProgress == null) return;

        mProgress.setBackgroundColor(color);

    }

    public void setColorSchemeColors(int... colors) {
        if (mProgress == null) return;

        mProgress.setColorSchemeColors(colors);

    }
}
