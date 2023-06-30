package ses2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode reversed = reverseList(head);

        ListNode curr1 = head;
        ListNode curr2 = reversed;

        while (curr1 != null && curr2 != null) {
            if (curr1.val != curr2.val) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return true;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean isPalindrome = isPalindrome(head);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
