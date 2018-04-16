package com.cy.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;


/**
 * Created by lenovo on 2017/7/17.
 */

public class BaseDialog extends Dialog {

    public BaseDialog(Context context) {
        this(context, 0);

    }

    public BaseDialog(Context context, int themeResId) {
        super(context, themeResId);
        requestWindowFeature(Window.FEATURE_NO_TITLE);// 去除对话框的标题
        getWindow().setBackgroundDrawableResource(R.drawable.dialog_bg);//设置对话框边框背景,必须在代码中设置对话框背景，不然对话框背景是黑色的

        setDimAmount(0.2f);
    }

    /*
             */
    public BaseDialog config(@LayoutRes int layoutResID, boolean canceledOnTouchOutside) {


        config(layoutResID, 0.2f, Gravity.CENTER, AnimInType.CENTER, WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT, canceledOnTouchOutside);

        return this;
    }

    /*
             */
    public BaseDialog config(@NonNull View view, boolean canceledOnTouchOutside) {


        config(view, 0.2f, Gravity.CENTER, AnimInType.CENTER, WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT, canceledOnTouchOutside);

        return this;
    }

    /*
             */
    public BaseDialog config(@LayoutRes int layoutResID, int gravity, AnimInType animInType, boolean canceledOnTouchOutside) {

        config(layoutResID, 0.2f, gravity, animInType, WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT, canceledOnTouchOutside);


        return this;
    }

    /*
             */
    public BaseDialog config(@NonNull View view, int gravity, AnimInType animInType, boolean canceledOnTouchOutside) {

        config(view, 0.2f, gravity, animInType, WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT, canceledOnTouchOutside);


        return this;
    }

    /*
             */
    public BaseDialog config(@LayoutRes int layoutResID, int gravity, AnimInType animInType,
                             int width, int height, boolean canceledOnTouchOutside) {

        config(layoutResID, 0.2f, gravity, animInType, width, height, canceledOnTouchOutside);

        return this;
    }

    /*
             */
    public BaseDialog config(@NonNull View view, int gravity, AnimInType animInType,
                             int width, int height, boolean canceledOnTouchOutside) {

        config(view, 0.2f, gravity, animInType, width, height, canceledOnTouchOutside);

        return this;
    }

    /*
           参数：dimAmount背景阴影
            */
    public BaseDialog config(@LayoutRes int layoutResID, float dimAmount, int gravity, AnimInType animInType,
                             int width, int height, boolean canceledOnTouchOutside) {
        setContentView(layoutResID);//填充对话框布局


        setDimAmount(dimAmount);

        getWindow().setGravity(gravity);

        setAnimType(animInType);


        getWindow().setLayout(width, height);

        setCanceledOnTouchOutside(canceledOnTouchOutside ? true : false);
        return this;
    }

    /*
           参数：dimAmount背景阴影
            */
    public BaseDialog config(@NonNull View view, float dimAmount, int gravity, AnimInType animInType,
                             int width, int height, boolean canceledOnTouchOutside) {
        setContentView(view);//填充对话框布局


        setDimAmount(dimAmount);

        getWindow().setGravity(gravity);

        setAnimType(animInType);


        getWindow().setLayout(width, height);

        setCanceledOnTouchOutside(canceledOnTouchOutside ? true : false);
        return this;
    }

    /*
           参数：dimAmount背景阴影
            */
    public BaseDialog config(@NonNull View view, @Nullable ViewGroup.LayoutParams params, float dimAmount, int gravity, AnimInType animInType,
                             int width, int height, boolean canceledOnTouchOutside) {
        setContentView(view, params);//填充对话框布局


        setDimAmount(dimAmount);

        getWindow().setGravity(gravity);

        setAnimType(animInType);


        getWindow().setLayout(width, height);

        setCanceledOnTouchOutside(canceledOnTouchOutside ? true : false);
        return this;
    }

    /*
    动画类型
     */
    public BaseDialog setAnimType(AnimInType animInType) {

        if (animInType == AnimInType.CENTER) {
            getWindow().setWindowAnimations(R.style.dialog_zoom);
            return this;

        }
        if (animInType == AnimInType.LEFT) {
            getWindow().setWindowAnimations(R.style.dialog_anim_left);
            return this;

        }
        if (animInType == AnimInType.TOP) {
            getWindow().setWindowAnimations(R.style.dialog_anim_top);
            return this;

        }
        if (animInType == AnimInType.RIGHT) {
            getWindow().setWindowAnimations(R.style.dialog_anim_right);
            return this;

        }
        if (animInType == AnimInType.BOTTOM) {
            getWindow().setWindowAnimations(R.style.dialog_anim_bottom);
            return this;

        }
        return this;
    }

    public void setOffset(int x, int y) {
        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.x = x;
        layoutParams.y = y;


    }

    public float getDimAmount() {
        return getWindow().getAttributes().dimAmount;
    }

    /*
    设置背景阴影,必须setContentView之后调用才生效
     */
    public BaseDialog setDimAmount(float dimAmount) {


        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.dimAmount = dimAmount;

        return this;
    }


    /*
    动画类型
     */
    public enum AnimInType {
        CENTER(0),
        LEFT(2),
        TOP(4),
        RIGHT(3),
        BOTTOM(1);

        AnimInType(int n) {
            intType = n;
        }

        final int intType;
    }
}
