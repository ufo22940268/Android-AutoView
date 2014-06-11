package me.biubiubiu.autoview.library;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ccheng on 6/11/14.
 */
public class AutoButtonView extends Button {

    public AutoButtonView(Context context) {
        super(context);
    }

    public AutoButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoButtonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setBackgroundDrawable(Drawable d) {
        AutoBgButtonBackgroundDrawable layer = new AutoBgButtonBackgroundDrawable(d);
        super.setBackgroundDrawable(layer);
    }
}
