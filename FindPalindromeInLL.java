// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class FindPalindromeInLL {

      public boolean isPalindrome(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            while(fast.next != null && fast.next.next !=null)  //O(n/2)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode reverseHead = reverse(slow.next);  //O(n/2)
            slow = head;
            fast = reverseHead;

            while(slow!=null && fast!=null) // O(n/2)
            {
                if(slow.val!=fast.val) return false;
                slow = slow.next;
                fast = fast.next;
            }

            return true;
        }

        public ListNode reverse(ListNode node)
        {
            ListNode prev = null;
            ListNode curr = node;

            while(curr!=null)
            {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }

    }
