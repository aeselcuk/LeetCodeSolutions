 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeTwoSortedLists {
    
    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    
        ListNode firstNode = new ListNode();
        ListNode resultNode = firstNode;
        while( list1 != null && list2 != null){
            

            if(list1.val < list2.val){
                resultNode.next = list1;
                resultNode = resultNode.next;
                list1 = list1.next;
            }else {
                resultNode.next = list2;
                resultNode = resultNode.next;
                list2 = list2.next;
            }
        }

        if(list1 == null) resultNode.next = list2;
        if(list2 == null) resultNode.next = list1;

        return firstNode.next;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        
        n1.next = n2;
        n2.next = n3;

        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(5);

        n4.next = n5;
        n5.next = n6;


        mergeTwoLists(n1, n4);
    }
}
