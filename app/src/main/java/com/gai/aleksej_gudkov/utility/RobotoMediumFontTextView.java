package com.gai.aleksej_gudkov.utility;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class RobotoMediumFontTextView extends TextView {

    //[Comment] Very bad. Copy/Paste code. Hardcode

    public RobotoMediumFontTextView(Context context) {
        super(context);
        String fontPath = "fonts/roboto_medium.ttf";
        Typeface face= Typeface.createFromAsset(context.getAssets(), fontPath);
        this.setTypeface(face);
    }

    public RobotoMediumFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        String fontPath = "fonts/roboto_medium.ttf";
        Typeface face= Typeface.createFromAsset(context.getAssets(), fontPath);
        this.setTypeface(face);
    }

    public RobotoMediumFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        String fontPath = "fonts/roboto_medium.ttf";
        Typeface face= Typeface.createFromAsset(context.getAssets(), fontPath);
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);
        //[Comment] What this method actually do?

    }
}
