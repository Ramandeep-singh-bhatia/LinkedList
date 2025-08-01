public class Insert {
    public SNode insertBeforeHeadSLL(SNode head, int nodeVal){
        SNode newNode = new SNode(nodeVal);
        if(head != null)
            newNode.next = head;
        return newNode;
    }

    public SNode insertAfterHeadSLL(SNode head, int nodeVal){
        SNode newNode = new SNode(nodeVal);
        if(head == null)
            return newNode;
        SNode temp = head.next;
        head.next = newNode;
        newNode.next = temp;
        return head;
    }

    public SNode insertBeforeTailSLL(SNode head, int nodeVal){
        SNode newNode = new SNode(nodeVal);
        if(head == null)
            return newNode;
        if(head.next == null) {
            newNode.next = head;
            return newNode;
        }
        SNode temp = head;
        SNode prev = head;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = newNode;
        newNode.next = temp;
        return head;
    }

    public SNode insertAfterTailSLL(SNode head, int nodeVal){
        SNode newNode = new SNode(nodeVal);
        if(head == null)
            return null;
        SNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public SNode insertBeforeKthSLL(SNode head, int nodeValue, int k){
        if(head == null)
            return null;
        SNode newNode = new SNode(nodeValue);
        if(k == 1){
            newNode.next = head;
            return newNode;
        }
        int count = 0;
        SNode temp = head;
        SNode prev = head;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = newNode;
                newNode.next = temp;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public SNode insertAfterKthSLL(SNode head, int nodeValue, int k){
        if(head == null)
            return null;
        SNode newNode = new SNode(nodeValue);
        if(k == 1){
            head.next = newNode;
            return head;
        }
        int count = 0;
        SNode temp = head;
        while(temp != null){
            count++;
            if(count == k){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public SNode insertBeforeValueSLL(SNode head, int nodeValue, int value){
        SNode newNode = new SNode(nodeValue);

        if(head == null)
            return null;

        if(head.val == value){
            newNode.next = head;
            return newNode;
        }
        SNode temp = head;
        SNode prev = head;
        while(temp != null){
            if(temp.val == value){
                newNode.next = prev.next;
                prev.next = newNode;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public SNode insertAfterValueSLL(SNode head, int nodeValue, int value){
        if(head == null)
            return null;

        SNode newNode = new SNode(nodeValue);
        SNode temp = head;
        while(temp != null){
            if(temp.val == value){
                if(temp.next != null)
                    newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
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
