package com.sfexpress.vcleet.blade_offer2

const val mod: Int = 1000000007
fun fib(n: Int): Int {
    if (n < 2) {
        return n
    }
    var q = 0
    var p = 0
    var r = 1
    for (i in 2..n) {
        q = p
        p = r
        r = (p + q) % mod
    }
    return r
}

fun main() {
    print(fib((100)))
}