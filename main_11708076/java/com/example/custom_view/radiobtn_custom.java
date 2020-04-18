package com.example.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatRadioButton;


public class radiobtn_custom extends AppCompatRadioButton {
    private String setText;
    private boolean setColor;
    public radiobtn_custom(Context context) {
        super(context);
    }

    public radiobtn_custom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.radioCustom);
        try {
            setText=typedArray.getString(R.styleable.radioCustom_settext2);
            if(setText==null)
            {
                setText("this is a radio button");
            }else {
                setChecked(true);
                setText("Male");
                setTextColor(Color.GREEN);
                setTextSize(24);

            }
            setColor=typedArray.getBoolean(R.styleable.radioCustom_setColor2,false);
            if(setColor==true)
            {
                setBackgroundColor(Color.MAGENTA);
            }
        }
        finally {
            typedArray.recycle();
        }
    }

    public radiobtn_custom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
