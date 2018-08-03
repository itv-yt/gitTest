package com.example.yangtao.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    private Paint mPaint;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(getResources().getColor(android.R.color.holo_orange_light));
        canvas.drawCircle(200, 200, 100, mPaint);
        canvas.drawLine(20, 300, 700, 605, mPaint);
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setAlpha(88);
        mPaint.setStrokeWidth(5);
        mPaint.setColor(getResources().getColor(android.R.color.holo_green_light));
    }
}
