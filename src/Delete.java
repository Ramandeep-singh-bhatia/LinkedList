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

    public DNode deleteHeadDLL(DNode head){
        if(head == null || head.next == null)
            return null;
        DNode prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;
        return head;
    }

    public DNode deleteTailDLL(DNode head){
        if(head == null || head.next == null)
            return null;
        DNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;

        return head;
    }

    public DNode deleteKthNodeDLL(DNode head, int k){
        if(head == null)
            return null;
        if(k == 1){
            head = head.next;
            head.prev = null;
            return head;
        }
        int count = 0;
        DNode temp = head;
        while(temp != null){
            count++;
            if(count == k){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public DNode deleteValueDLL(DNode head, int value){
        if(head == null)
            return null;
        if(head.val == value){
            head = head.next;
            head.prev = null;
            return head;
        }

        DNode temp = head;
        while(temp != null){
            if(temp.val == value){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    public void printDLL(DNode head){
        if(head == null)
            System.out.println("Head is null");
        else {
            while(head.next != null){
                System.out.println("Node Value -> " + head.val +
                                " Node.prev -> " + (head.prev != null ? head.prev.val : "NULL") +
                                " Node.next -> " + head.next.val);
                head = head.next;
            }

            System.out.println("Node Value -> " + head.val +
                    " Node.prev -> " + (head.prev != null ? head.prev.val : "NULL") +
                    " Node.next -> NULL");
        }
    }
}
