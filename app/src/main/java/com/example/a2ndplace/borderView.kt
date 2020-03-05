package com.example.a2ndplace

import android.R
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View


class borderView(context: Context, attrs: AttributeSet): View(context, attrs) {


    //circle and text colors
    private var circleCol = 0
    private var labelCol = 0
    //label text
    private var circleText: String? = null
    //paint for drawing custom view
    private lateinit var circlePaint: Paint

    init {
        val a = context.theme.obtainStyledAttributes(attrs,
                com.example.a2ndplace.R.styleable.borderViewStyle, 0, 0)
        try {
            //get the text and colors specified using the names in attrs.xml
            circleText = a.getString(com.example.a2ndplace.R.styleable.borderViewStyle_borderLabel)
            circleCol = a.getInteger(com.example.a2ndplace.R.styleable.borderViewStyle_borderColor,0)
            labelCol = a.getInteger(com.example.a2ndplace.R.styleable.borderViewStyle_labelColor,0)
        } finally {
            a.recycle();
        }
        circlePaint = Paint()
    }

    override fun onDraw(canvas: Canvas?) {
        //get half of the width and height as we are working with a circle
        val viewWidth = this.measuredWidth
        val viewHeight = this.measuredHeight
        //get the radius as half of the width or height, whichever is Largeer
        //subtract ten so that it has some space around it
        //var radius = 0
        //radius = if (viewWidthHalf > viewHeightHalf) viewHeightHalf - 10 else viewWidthHalf - 10
        circlePaint.setColor(circleCol);
        circlePaint.setStyle(Paint.Style.STROKE)
        circlePaint.strokeWidth = 10f
        circlePaint.setAntiAlias(true)
        //set the paint color using the circle color specified
        circlePaint.setColor(circleCol)
        canvas?.drawRect(0f,0f,viewWidth.toFloat(),viewHeight.toFloat(), circlePaint)
        //set the text color using the color specified
        circlePaint.setColor(labelCol)
        //set text properties
        circlePaint.setTextAlign(Paint.Align.CENTER)
        circlePaint.setTextSize(50f)
        //draw the text using the string attribute and chosen properties
        canvas?.drawText(circleText?: "No Text!", (viewWidth/2).toFloat(), (viewHeight/2).toFloat(), circlePaint);
    }

}