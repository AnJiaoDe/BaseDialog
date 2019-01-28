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

public class ProgressDialog extends BaseDialog {

    private MaterialProgressDrawable progress;

    private ValueAnimator valueAnimator;
    private CircleImageView imageView;

    public ProgressDialog(Context context) {
        super(context);
        setCanceledOnTouchOutside(false);

        FrameLayout frameLayout = new FrameLayout(context);

        imageView = new CircleImageView(context);

        progress = new MaterialProgressDrawable(getContext(), imageView);


        //设置圈圈的各种大小
        progress.updateSizes(MaterialProgressDrawable.DEFAULT);

        progress.showArrow(false);
        imageView.setImageDrawable(progress);

        frameLayout.addView(imageView);


        valueAnimator = valueAnimator.ofFloat(0f, 1f);

        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float n = (float) animation.getAnimatedValue();
                //圈圈的旋转角度
                progress.setProgressRotation(n * 0.5f);
                //圈圈周长，0f-1F
                progress.setStartEndTrim(0f, n * 0.8f);
                //箭头大小，0f-1F
                progress.setArrowScale(n);
                //透明度，0-255
                progress.setAlpha((int) (255 * n));
            }
        });

        getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
        setContentView(frameLayout);

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


    }


    public ProgressDialog duration(long duration) {
        valueAnimator.setDuration(duration);

        return this;
    }


    public ProgressDialog radius_iv(float radius_iv) {
        imageView.radius(radius_iv);

        return this;
    }

    public ProgressDialog color_iv(int color_iv) {
        imageView.color(color_iv);

        return this;
    }

    public ProgressDialog color_bg_progress(int color_bg_progress) {
        progress.setBackgroundColor(color_bg_progress);

        return this;
    }

    /**
     * //圈圈颜色,可以是多种颜色
     *
     * @param colors_progress
     * @return
     */
    public ProgressDialog colors_progress(int... colors_progress) {
        progress.setColorSchemeColors(colors_progress);

        return this;
    }

    @Override
    public void show() {
        super.show();
        if (progress == null) return;
        progress.start();
        if (valueAnimator == null) return;
        valueAnimator.start();


    }

    @Override
    public void hide() {
        super.hide();
        if (progress == null) return;
        progress.stop();
        if (valueAnimator == null) return;
        valueAnimator.cancel();


    }
}
