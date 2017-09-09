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
            is Int -> println("Int��"+u)
            is Long -> println("Long��"+u)
            is Float -> println("Float��"+u)
            is Boolean -> println("Boolean��"+u)
            is Double -> println("Double��"+u)
            is String -> println("String��"+u)
        }
        println(t.substring(t.length-1,t.length))
        println("map key:$t,map value:${u}")
    }

}