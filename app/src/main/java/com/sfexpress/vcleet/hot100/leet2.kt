package com.sfexpress.vcleet.hot100


class ListNode @JvmOverloads constructor(var value : Int = 0, var next : ListNode? = null)

fun main() {
    val v1 = ListNode(2)
    val v2 = ListNode(3)
    val v3 = ListNode(4)
    val v4 = ListNode(2)
    val v5 = ListNode(5)
    val v6 = ListNode(7)
    v1.next = v2
    v2.next = v3
    v4.next = v5
    v5.next = v6
    var v = addTwoNumbers(v1, v4)
    while (v != null){
        print(v.value)
        v = v.next
    }
}
//两数相加
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if(l1 == null || l2 == null){
        return null
    }
    var ll1 = l1
    var ll2 = l2
    var head : ListNode? = null
    var tail : ListNode? = head
    var check = 0
    while (ll1 != null || ll2 != null){
        val v1 = ll1?.value ?: 0
        val v2 = ll2?.value ?: 0
        val sum = v1 + v2 + check
        check = sum / 10
        if(head == null){
            head = ListNode(sum % 10)
            tail = head
        } else {
            tail?.next = ListNode(sum % 10)
            tail = tail?.next
        }
        if(ll1 != null){
            ll1 = ll1.next
        }
        if(ll2 != null){
            ll2 = ll2.next
        }
    }
    if(check > 0){
        tail?.next = ListNode(check)
    }

    return head
}