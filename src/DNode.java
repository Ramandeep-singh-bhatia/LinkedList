public class DNode {
    int val;
    DNode next;
    DNode prev;

    public DNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    public DNode(int val, DNode prev){
        this.val = val;
        this.next = null;
        this.prev = prev;
    }
}
