package com.example.customnewshape

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

/**
 * Created by Santanu ^_^ since October 2019
 */
class NewWidget(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
    ConstraintLayout(context, attrs, defStyleAttr) {

    var mRoot : View = View.inflate(context, R.layout.new_layout, this)

    /**
     * Set the new background color
     */
    fun withBackGroundColor(color : Int) {
        mRoot.setBackgroundColor(color)
    }
}