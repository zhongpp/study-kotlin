package com.zpp.basic;

/**
 * @author pingpingZhong
 * Date: 2017/8/24
 * Time: 15:29
 */

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for (i in 100 downTo 1 step 2) {
        println(i)
        println(fizzBuzz(i))
    }
}
