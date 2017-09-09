package com.zpp.basic;

/**
 * @author pingpingZhong
 * Date: 2017/8/24
 * Time: 17:35
 */
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {

    fun disable() {}

    open fun animate() {}

    override fun click() {}
}


