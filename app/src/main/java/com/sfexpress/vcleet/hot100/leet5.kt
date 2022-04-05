package com.sfexpress.vcleet.hot100

//动态规划解法
fun longestPalindrome(s: String): String {
    val len = s.length
    //边界条件,长度为1的字符串本身就是最长回文串
    if(len == 1){
        return s
    }
    //结果数组，f[i][j]表示s[i,j]是否是回文串
    val f = Array(len){
        BooleanArray(len)
    }
    //初始条件，所有长度为1的子串是回文串
    for(i in 0 until len){
        f[i][i] = true
    }
    //最长回文长度
    var maxLen = 1
    var begin = 0
    //计算的回文长度从2开始
    for(l in 2 .. len){
        for(i in 0 until len){
            val j = i + l -1
            //越界直接退出当前循环
            if(j >= len){
                break
            }
            if(s[i] == s[j]){
                if(l <= 3){
                    f[i][j] = true
                } else {
                    f[i][j] = f[i + 1][j - 1]
                }
            }
            //记录最大长度
            if(f[i][j] && l > maxLen){
                maxLen = l
                begin = i
            }
        }
    }

    return s.substring(begin, begin + maxLen)
}

//中心扩展
class Solution1 {
    fun longestPalindrome(s: String): String {
        val len = s.length
        //边界条件,长度为1的字符串本身就是最长回文串
        if(len == 1){
            return s
        }
        var start = 0
        var end = 0
        var maxLen = 1
        for(i in 0 until len){
            val len1 = expandAroundCenter(s, i, i)
            val len2 = expandAroundCenter(s, i, i+1)
            val len = kotlin.math.max(len1, len2)
            if(len > end - start + 1){
                start = i - (len-1)/2
                end = i + len / 2
            }
        }

        return s.substring(start, end+1)
    }

    //获取当前回文中心的最大长度
    fun expandAroundCenter(s : String, left : Int, right: Int) : Int{
        var len = 0
        val sl = s.length
        var l = left
        var r = right
        while (l >= 0 && r < sl && s[l] == s[r]){
            len = r - l + 1
            l--
            r++
        }

        return len
    }
}