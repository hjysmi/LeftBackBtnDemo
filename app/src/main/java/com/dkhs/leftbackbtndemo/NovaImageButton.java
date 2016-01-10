package com.dkhs.leftbackbtndemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class NovaImageButton extends ImageButton {

    private OnClickListener mListener;

    public NovaImageButton(Context paramContext) {
        super(paramContext);
    }

    public NovaImageButton(Context paramContext, AttributeSet paramAttributeSet) {
        super(paramContext, paramAttributeSet);
    }

    @SuppressLint({"NewApi"})
    public NovaImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
    }

    public void setOnClickListener(OnClickListener paramOnClickListener) {
        super.setOnClickListener(paramOnClickListener);
        this.mListener = paramOnClickListener;
    }
}
