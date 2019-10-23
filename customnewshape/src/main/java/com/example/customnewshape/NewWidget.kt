package com.example.customnewshape

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

/**
 * Created by Santanu ^_^ since October 2019
 */
class NewWidget(context: Context?, attrs: AttributeSet?) :
    ConstraintLayout(context, attrs) {

    var mRoot : View = View.inflate(context, R.layout.new_layout, this)

    /**
     * Set the new background color
     */
    fun withBackGroundColor(color : Int) {
        mRoot.findViewById<View>(R.id.shapebackground).setBackgroundColor(ContextCompat.getColor(context, color))
    }

    /**
     * Set new textColor
     */
    fun setNewTextColor(color: Int) {
        (mRoot.findViewById<View>(R.id.tvNew) as TextView).setTextColor(ContextCompat.getColor(context, color))
    }

    /**
     * Set text
     */
    fun setText(text : String) {
        (mRoot.findViewById<View>(R.id.tvNew) as TextView).text = text
    }
}