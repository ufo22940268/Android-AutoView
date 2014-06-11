package me.biubiubiu.autoview.library;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by ccheng on 6/11/14.
 */
public class AutoLinearLayout extends LinearLayout {

    public AutoLinearLayout(Context context) {
        super(context);
    }

    public AutoLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setBackgroundDrawable(Drawable d) {
        AutoBgButtonBackgroundDrawable layer = new AutoBgButtonBackgroundDrawable(d);
        super.setBackgroundDrawable(layer);
    }
}
