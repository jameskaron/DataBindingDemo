package com.m.databindingdemo.viewholder;

import android.databinding.BindingConversion;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/**
 * Created by James on 09/03/2018.
 */
public class TestViewModel {

    @BindingConversion
    public static ColorDrawable convertColorToDrawable(String colorString){
        int color = Color.parseColor(colorString);
        return new ColorDrawable(color);
    }
}
