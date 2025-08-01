public class Delete {
    public SNode deleteHeadSLL(SNode head){
        if(head == null || head.next == null)
                return null;
        head = head.next;

        return head;
    }

    public SNode deleteTailSLL(SNode head){
        if(head == null || head.next == null)
            return null;
        SNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public SNode deleteKthNodeSLL(SNode head, int k){
        if(k == 0 || head == null)
            return null;
        if(k == 1){
            head = head.next;
            return head;
        }
        int count  = 0;
        SNode temp = head;
        SNode prev = head;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public SNode deleteValueSLL(SNode head, int value){
        if(head == null)
            return null;

        if (head.val == value)
            return head.next;
        SNode prev = head;
        SNode temp = head;
        while(temp != null){
            if(temp.val == value){
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public void printSLL(SNode head){
        if(head == null)
            System.out.println("Head is null");
        else {
            while(head.next != null){
                System.out.println("Node Value -> " + head.val + " Node.next -> " + head.next.val);
                head = head.next;
            }

            System.out.println("Node Value -> " + head.val + " Node.next -> NULL");
        }
    }
}
