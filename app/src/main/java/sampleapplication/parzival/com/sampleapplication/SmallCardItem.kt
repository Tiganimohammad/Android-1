package sampleapplication.parzival.com.sampleapplication

import androidx.annotation.ColorInt

open class SmallCardItem(@ColorInt private val colorRes: Int, text: CharSequence? = "") : CardItem(colorRes, text) {

    override fun getSpanSize(spanCount: Int, position: Int) = spanCount / 2

}