package com.gai.aleksej_gudkov.utility;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.gai.aleksej_gudkov.R;

public class RobotoMediumFontTextView extends TextView {
    private String mFontPath;
    private Typeface mTypeface;

    public RobotoMediumFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mFontPath = context.getResources().getString(R.string.robotomedium_path);
        mTypeface = Typeface.createFromAsset(context.getAssets(), mFontPath);
        this.setTypeface(mTypeface);
    }
}
