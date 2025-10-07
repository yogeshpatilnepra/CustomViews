package com.nepracorpnest.customviews

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.graphics.toColorInt

@SuppressLint("SetTextI18n")
class FancyButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.buttonStyle
) : AppCompatButton(context, attrs, defStyleAttr) {

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FancyButton)
        val customText = typedArray.getString(R.styleable.FancyButton_fancyText)
        val customColor =
            typedArray.getColor(R.styleable.FancyButton_fancyColor, "#6200EE".toColorInt())
        typedArray.recycle()

        text = customText ?: "Fancy Button 🌟"
        setBackgroundColor(customColor)
        setTextColor(Color.WHITE)
    }
}