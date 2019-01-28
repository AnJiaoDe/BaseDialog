package com.cy.basedialog;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

import com.cy.dialog.BaseDialog;
import com.cy.dialog.progress.ProgressDialog;

public class MainActivity extends BaseActivity {
    private BaseDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_center).setOnClickListener(this);
        findViewById(R.id.btn_left).setOnClickListener(this);
        findViewById(R.id.btn_top).setOnClickListener(this);
        findViewById(R.id.btn_right).setOnClickListener(this);
        findViewById(R.id.btn_bottom).setOnClickListener(this);
        findViewById(R.id.btn_progress).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_center:
                dialog = new BaseDialog(this);
                dialog.contentView(R.layout.dialog_center)
                        .canceledOnTouchOutside(true).show();
                dialog.findViewById(R.id.tv_confirm).setOnClickListener(this);
                dialog.findViewById(R.id.tv_cancel).setOnClickListener(this);

                break;
            case R.id.btn_left:
                BaseDialog dialog_left = new BaseDialog(this);

                dialog_left.contentView(R.layout.dialog_left)
                        .layoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT))
                        .dimAmount(0.5f)
                        .gravity(Gravity.LEFT | Gravity.CENTER)
                        .animType(BaseDialog.AnimInType.LEFT)
                        .canceledOnTouchOutside(true).show();

                break;
            case R.id.btn_top:
                BaseDialog dialog_top = new BaseDialog(this);

                dialog_top.contentView(R.layout.dialog_photo)
                        .layoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT))
                        .dimAmount(0.5f)
                        .gravity(Gravity.TOP)
                        .offset(0, ScreenUtils.dpInt2px(this, 48))
                        .animType(BaseDialog.AnimInType.TOP)
                        .canceledOnTouchOutside(true).show();


                break;
            case R.id.btn_right:
                BaseDialog dialog_right = new BaseDialog(this);

                dialog_right.contentView(R.layout.dialog_right)
                        .layoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT))

                        .gravity(Gravity.RIGHT | Gravity.CENTER)
                        .animType(BaseDialog.AnimInType.RIGHT)
                        .offset(20, 0)
                        .canceledOnTouchOutside(true).show();

                break;
            case R.id.btn_bottom:
                BaseDialog dialog_bottom = new BaseDialog(this);

                dialog_bottom.contentView(R.layout.dialog_photo)
                        .gravity(Gravity.BOTTOM)
                        .animType(BaseDialog.AnimInType.BOTTOM)
                        .canceledOnTouchOutside(true).show();


                break;
            case R.id.btn_progress:

                ProgressDialog progressDialog = new ProgressDialog(this);
                progressDialog.color_iv(0xffffffff)
                        .color_bg_progress(0xffffffff)
                        .colors_progress(0xff2a5caa).show();
                break;
            case R.id.tv_confirm:
                dialog.dismiss();
                break;
            case R.id.tv_cancel:
                dialog.dismiss();
                break;
        }

    }
}
