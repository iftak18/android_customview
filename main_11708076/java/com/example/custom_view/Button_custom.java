package com.example.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;

import androidx.appcompat.widget.AppCompatButton;

public class Button_custom extends AppCompatButton {
    private String Text;
    private boolean setcolor;
    public Button_custom(Context context) {
        super(context);
    }

    public Button_custom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.buttonCustom);
        try {
            Text=typedArray.getString(R.styleable.buttonCustom_setText);
            if(Text==null)
            {
                setText("this is a custom button");
            }else {
                setText("Click Me!");
                setTextColor(Color.GREEN);

            }
            setcolor=typedArray.getBoolean(R.styleable.buttonCustom_setColor,false);
            if(setcolor==true)
            {
                setBackgroundColor(Color.RED);
            }
        }
        finally {
            typedArray.recycle();
        }
    }

    public Button_custom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
