package com.example.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.CompoundButton;

import androidx.appcompat.widget.AppCompatCheckBox;

public class checkbox_custom extends AppCompatCheckBox {
    private boolean isChecked;


    public checkbox_custom(Context context) {
        super(context);

    }

    public checkbox_custom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.checkboxCustom);
        try {

            isChecked=typedArray.getBoolean(R.styleable.checkboxCustom_isChecked,false);
            if(isChecked==true)
            {
                setChecked(true);
                setText("Checked");
                setTextSize(24);
                setTextColor(Color.GREEN);
                setBackgroundColor(Color.MAGENTA);
            }else
            {
                setChecked(false);
                setText("notChecked");
                setTextColor(Color.RED);
            }
        }
        finally {
            typedArray.recycle();
        }
    }

    public checkbox_custom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
