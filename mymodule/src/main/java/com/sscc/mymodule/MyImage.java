package com.sscc.mymodule;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * 描述：
 *
 * @author dengpf
 * @since 2018/11/13 09:15.
 */
public class MyImage extends AppCompatImageView {
    public MyImage(Context context) {
        super(context);
    }

    public MyImage(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImage(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
