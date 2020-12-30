package com.miumiuhaskeer.snoweffect;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;

/**
 * Class for SnowEffect, that contains drawable and color for snow element
 */
public class SnowElement {

    private final Drawable drawable;
    private final int color;

    public SnowElement(Drawable drawable, int color) {
        this.drawable = drawable;
        this.color = color;
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public SnowElement(Context context, @DrawableRes int drawableRes, @ColorRes int colorRes) {
        this.drawable = context.getDrawable(drawableRes);
        this.color = context.getColor(colorRes);
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public int getColor() {
        return color;
    }
}
