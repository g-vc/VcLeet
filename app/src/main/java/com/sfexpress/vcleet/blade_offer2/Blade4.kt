package com.sfexpress.vcleet.blade_offer2

import com.sfexpress.vcleet.bean.ListNode

/**
 * {类描述}
 *
 * @author veganchen
 * @since 2022/4/7 07:57
 */

fun main() {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    node1.next = node2
    node2.next = node3
    val array = Blade4().reversePrint(node1)
    array.forEach {
        print(it)
    }
}

class Blade4 {

    fun reversePrint(head: ListNode?): IntArray {
        if(head == null){
            return intArrayOf()
        }
        //记录链表长度
        var len = 0
        //临时指针
        var tempNode : ListNode? = ListNode(head.`val`)
        tempNode?.next = head.next
        while (tempNode != null){
            len++
            tempNode = tempNode.next
        }
        val array = IntArray(len)
        var tempHead = head
        for(i in len - 1 downTo 0){
            array[i] = tempHead?.`val` ?: 0
            tempHead = tempHead?.next
        }

        return array
    }
}