package org.example.medium;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode current = null;
        int sum;
        int k = 0;
        while (l1 != null || l2 != null) {
            int a;
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            sum = val1 + val2 + k;
            k = sum / 10;
            a = sum % 10;
            ListNode newNode = new ListNode(a);
            if (res == null) {
                res = newNode;
                current = res;
            } else {
                current.next = newNode;
                current = newNode;
            }
            assert l1 != null;
            l1 = l1.next;
            assert l2 != null;
            l2 = l2.next;
        }
        if (k > 0)
            current.next = new ListNode(k);
        return res;
    }
}
