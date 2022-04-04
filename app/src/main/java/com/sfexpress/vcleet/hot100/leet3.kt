package com.sfexpress.vcleet.hot100

import kotlin.math.max

/**
 * {类描述}
 *
 * @author veganchen
 * @since 2022/4/4 07:56
 */

fun main() {
    val s = "aaacbckkabc"
    print(lengthOfLongestSubstring(s))
}

fun lengthOfLongestSubstring(s: String): Int {
    //判断重复字符用
    val set = HashSet<Char>()
    //右指针
    var rk = -1
    //左指针
    var i = 0
    //结果
    var ans = 0
    val len = s.length
    repeat(s.length) {
        if (i != 0) {
            set.remove(s[i - 1])
        }
        while (rk + 1 < len && !set.contains(s[rk + 1])) {
            set.add(s[rk + 1])
            rk++
        }
        ans = max(ans, rk + 1 - i)
        i++
    }

    return ans
}