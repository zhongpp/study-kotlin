package com.zpp.basic;

/**
 * @author pingpingZhong
 * Date: 2017/9/8
 * Time: 15:36
 */

val params = hashMapOf("param1" to "time1", "param2" to "time2", "param3" to "city","param4" to 4)

fun main(args: Array<String>) {
    opration()
}

fun opration() {
    for (entry in params) {
        println(entry.key)
        println(entry.value)
    }
    print(params["param1"])

    params.forEach { t, u ->
        when(u) {
            is Int -> println("Int£º"+u)
            is Long -> println("Long£º"+u)
            is Float -> println("Float£º"+u)
            is Boolean -> println("Boolean£º"+u)
            is Double -> println("Double£º"+u)
            is String -> println("String£º"+u)
        }
        println(t.substring(t.length-1,t.length))
        println("map key:$t,map value:${u}")
    }

}