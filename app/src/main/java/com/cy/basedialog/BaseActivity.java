package com.cy.basedialog;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


/**
 * Created by lenovo on 2017/4/25.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    private String toast_permission;
    private OnPermissionHaveListener onPermissionHaveListener;
    public SharedPreferences sharedPreferences;


    public SharedPreferences.Editor editor;


    public Context context_applicaiton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        setStatusBarTransparent();

        sharedPreferences = getSharedPreferences("SP", Context.MODE_PRIVATE);

        editor = sharedPreferences.edit();

        context_applicaiton = getApplicationContext();

    }

    public Context getContext_applicaiton() {
        return context_applicaiton;
    }

    public void setContext_applicaiton(Context context_applicaiton) {
        this.context_applicaiton = context_applicaiton;
    }





    //??????????????????????????????????????????????????????????????????????

    /*
            Acitivity跳转
             */
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void showToast(int string_id) {
        Toast.makeText(this, getResources().getString(string_id), Toast.LENGTH_SHORT).show();
    }


    public void startAppcompatActivity(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }


    public SharedPreferences.Editor getEditor() {
        return editor;
    }

    public void setEditor(SharedPreferences.Editor editor) {
        this.editor = editor;
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public void setSharedPreferences(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }


    public void initData() {
    }
    /*
    状态栏全透明去阴影
     */

    public void setStatusBarTransparent() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
    /*
    状态栏隐藏
     */

    public void setStatusBarHide() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
    /*

     */

    public void replaceFragment(int framelayout_id, Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(framelayout_id, fragment).commitAllowingStateLoss();
    }


    public Fragment createFragment(int position) {
        return null;
    }

    /*
          6.0权限检查
           */
    public void checkPermission(String[] permission, String toast_permission, OnPermissionHaveListener onPermissionHaveListener) {
        ActivityCompat.requestPermissions(this, permission, 1);
        this.toast_permission = toast_permission;

        this.onPermissionHaveListener = onPermissionHaveListener;

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        for (int i = 0; i < permissions.length; i++) {
            if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {

                showToast(toast_permission);
                return;
            }
        }
        if (onPermissionHaveListener != null) {
            onPermissionHaveListener.onPermissionHave();
        }


    }

    public interface OnPermissionHaveListener {
        public void onPermissionHave();
    }
}
