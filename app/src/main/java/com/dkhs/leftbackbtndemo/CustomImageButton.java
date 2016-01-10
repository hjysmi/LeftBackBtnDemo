package com.dkhs.leftbackbtndemo;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class CustomImageButton extends NovaImageButton
        implements OnTouchListener {
    public CustomImageButton(Context paramContext) {
        super(paramContext);
        setOnTouchListener(this);
    }

    public CustomImageButton(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
        setOnTouchListener(this);
    }

    public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
        if (paramMotionEvent.getAction() == 0)
            setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
        if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
            setColorFilter(null);
        return false;
    }
}
