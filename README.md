  微信公众号
 ![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-a6969884111cd3b4?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

[简书](https://www.jianshu.com/u/b8159d455c69)

[GitHub](https://github.com/AnJiaoDe/BaseDialog)

[APK](https://github.com/AnJiaoDe/BaseDialog/tree/master/app/build/outputs/apk)


**使用方法**

将libray模块复制到项目中,或者直接在build.gradle中依赖:

```
allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
	}
```

```
dependencies {
	        compile 'com.github.AnJiaoDe:BaseDialog:V1.1.8'
	}
```

**1.Center**

![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-652a850d1aff532d?imageMogr2/auto-orient/strip)

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginLeft="20dp"
    android:layout_marginRight="20dp"
    android:background="@drawable/white_shape"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="80dp"
        android:text="确定删除吗？"
        android:textSize="16sp"
        android:gravity="center"/>
    <View
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:background="@color/line"/>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <TextView
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="48dp"

            android:text="取消"
            android:id="@+id/tv_cancel"
            android:gravity="center"
            android:textSize="16sp"/>
        <View
            android:layout_width="1dp"
            android:layout_height="match_parent"
            android:background="@color/line"/>
        <TextView
            android:layout_width="0dp"
            android:layout_weight="1"
            android:id="@+id/tv_confirm"
            android:layout_height="48dp"
            android:text="确定"
            android:gravity="center"

            android:textSize="16sp"/>
    </LinearLayout>
</LinearLayout>
```
**2.Left**

![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-2c3a288099162853?imageMogr2/auto-orient/strip)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="250dp"
    android:layout_height="match_parent"
    android:background="@color/white"

    android:orientation="vertical">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:text="Google Assistant: 一句 OK, Google，多少手指都用不上了
人工智能是今年的 Google I/O 的一大主题。在发布会一开始，Google CEO 桑达拉·皮蔡（Sundar Pichai）就强调机器学习在生活中扮演的重要角色。随后，一系列基于 Google 人工智能的产品纷至沓来。



OK, Google. 这句耳熟能详的命令，如今承载了 Google 全新的产品——Google Assistant.

之所以 Google Assistant 是发布会上首个亮相的产品，是因为后续登场的数个产品都基于这一技术。Google 用将近十年的时间，改善自己的语音识别技术，更强调自然语义和对话式搜索。"
        android:textSize="16sp" />

</LinearLayout>
```

**3.Top**

![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-b6e68994c9834a87?imageMogr2/auto-orient/strip)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    android:orientation="vertical">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:id="@+id/tv_photo"
            android:layout_width="match_parent"
            android:layout_height="56dp"
            android:gravity="center"
            android:text="拍照"
            android:textSize="16sp" />

        <View
            android:layout_width="match_parent"
            android:layout_height="0.1dp"
            android:background="@color/line" />

        <TextView

            android:id="@+id/tv_album"
            android:layout_width="match_parent"
            android:layout_height="56dp"
            android:gravity="center"
            android:text="从相册选择"

            android:textSize="16sp" />
    </LinearLayout>
    <View
        android:layout_width="match_parent"
        android:layout_height="10dp"
        android:background="@color/bg"/>
    <TextView
        android:id="@+id/tv_photo_cancel"
        android:layout_width="match_parent"
        android:layout_height="56dp"
        android:gravity="center"
        android:text="取消"

        android:textSize="16sp" />
</LinearLayout>
```

**4.Right**

![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-512226550e5fbc79?imageMogr2/auto-orient/strip)


```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="250dp"
    android:layout_height="match_parent"
    android:background="@color/white"

    android:orientation="vertical">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:text="Google Assistant: 一句 OK, Google，多少手指都用不上了
人工智能是今年的 Google I/O 的一大主题。在发布会一开始，Google CEO 桑达拉·皮蔡（Sundar Pichai）就强调机器学习在生活中扮演的重要角色。随后，一系列基于 Google 人工智能的产品纷至沓来。



OK, Google. 这句耳熟能详的命令，如今承载了 Google 全新的产品——Google Assistant.

之所以 Google Assistant 是发布会上首个亮相的产品，是因为后续登场的数个产品都基于这一技术。Google 用将近十年的时间，改善自己的语音识别技术，更强调自然语义和对话式搜索。"
        android:textSize="16sp" />

</LinearLayout>
```

**5.Bottom**

![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-375e40d3a159e280?imageMogr2/auto-orient/strip)

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    android:orientation="vertical">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:id="@+id/tv_photo"
            android:layout_width="match_parent"
            android:layout_height="56dp"
            android:gravity="center"
            android:text="拍照"
            android:textSize="16sp" />

        <View
            android:layout_width="match_parent"
            android:layout_height="0.1dp"
            android:background="@color/line" />

        <TextView

            android:id="@+id/tv_album"
            android:layout_width="match_parent"
            android:layout_height="56dp"
            android:gravity="center"
            android:text="从相册选择"

            android:textSize="16sp" />
    </LinearLayout>
    <View
        android:layout_width="match_parent"
        android:layout_height="10dp"
        android:background="@color/bg"/>
    <TextView
        android:id="@+id/tv_photo_cancel"
        android:layout_width="match_parent"
        android:layout_height="56dp"
        android:gravity="center"
        android:text="取消"

        android:textSize="16sp" />
</LinearLayout>
```

**6.Progress**

![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-0eb2f94cf75307f7?imageMogr2/auto-orient/strip)
 
 

```
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

```

 **源码：**
 
 **BaseDialog**

```
public class BaseDialog extends Dialog {

    public BaseDialog(Context context) {
        this(context, 0);

    }


    public BaseDialog(Context context, int themeResId) {
        super(context, themeResId);

        requestWindowFeature(Window.FEATURE_NO_TITLE);// 去除对话框的标题
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0x00000000);
        getWindow().setBackgroundDrawable(gradientDrawable);//设置对话框边框背景,必须在代码中设置对话框背景，不然对话框背景是黑色的

        dimAmount(0.2f);
    }

    public BaseDialog contentView(@LayoutRes int layoutResID) {
        getWindow().setContentView(layoutResID);
        return this;
    }


    public BaseDialog contentView(@NonNull View view) {
        getWindow().setContentView(view);
        return this;
    }

    public BaseDialog contentView(@NonNull View view, @Nullable ViewGroup.LayoutParams params) {
        getWindow().setContentView(view, params);
        return this;
    }
    public BaseDialog layoutParams(@Nullable ViewGroup.LayoutParams params) {
        getWindow().setLayout(params.width, params.height);
        return this;
    }


    /**
     * 点击外面是否能dissmiss
     *
     * @param canceledOnTouchOutside
     * @return
     */
    public BaseDialog canceledOnTouchOutside(boolean canceledOnTouchOutside) {
        setCanceledOnTouchOutside(canceledOnTouchOutside);
        return this;
    }

    /**
     * 位置
     *
     * @param gravity
     * @return
     */
    public BaseDialog gravity(int gravity) {

        getWindow().setGravity(gravity);

        return this;

    }

    /**
     * 偏移
     *
     * @param x
     * @param y
     * @return
     */
    public BaseDialog offset(int x, int y) {
        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.x = x;
        layoutParams.y = y;

        return this;
    }

    /*
       设置背景阴影,必须setContentView之后调用才生效
        */
    public BaseDialog dimAmount(float dimAmount) {

        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.dimAmount = dimAmount;
        return this;
    }


    /*
   动画类型
    */
    public BaseDialog animType(BaseDialog.AnimInType animInType) {


        switch (animInType.getIntType()) {
            case 0:
                getWindow().setWindowAnimations(R.style.dialog_zoom);

                break;
            case 1:
                getWindow().setWindowAnimations(R.style.dialog_anim_left);

                break;
            case 2:
                getWindow().setWindowAnimations(R.style.dialog_anim_top);

                break;
            case 3:
                getWindow().setWindowAnimations(R.style.dialog_anim_right);

                break;
            case 4:
                getWindow().setWindowAnimations(R.style.dialog_anim_bottom);

                break;
        }
        return this;
    }


    /*
    动画类型
     */
    public enum AnimInType {
        CENTER(0),
        LEFT(1),
        TOP(2),
        RIGHT(3),
        BOTTOM(4);

        AnimInType(int n) {
            intType = n;
        }

        final int intType;

        public int getIntType() {
            return intType;
        }
    }
}

```

 **ProgressDialog**

```
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

```

 
 
 **更新日志**
 
 *V1.1.1*
  - Android BaseDialog(开发必备)动画、加载进度、阴影、上下左右中 进入
  
  

**License**

 Copyright [AnJiaoDe] [name of copyright owner]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
   
   [GitHub](https://github.com/AnJiaoDe)

关注专题[Android开发常用开源库](https://www.jianshu.com/c/3ff4b3951dc5)

[简书](https://www.jianshu.com/u/b8159d455c69)

 微信公众号
 ![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-a6969884111cd3b4?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

QQ群
![这里写图片描述](http://upload-images.jianshu.io/upload_images/11866078-8fa028ef79948e75?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

 
