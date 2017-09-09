package com.zpp.basic;

/**
 * @author pingpingZhong
 * Date: 2017/8/25
 * Time: 11:32
 */
class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun getFacebookName(accountId: Int) = "fb:$accountId"

class User2 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User2(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User2(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    A.bar()

    val subscribingUser = User2.newSubscribingUser("bob@gmail.com")
    val facebookUser = User2.newFacebookUser(4)
    println(subscribingUser.nickname)
    println(facebookUser.nickname)
}
