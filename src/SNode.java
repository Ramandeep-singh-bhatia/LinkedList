public class SNode {
    int val;
    SNode next;

    public SNode(int val){
        this.val = val;
        this.next = null;
    }

    public SNode(int val, SNode next){
        this.val = val;
        this.next = next;
    }
}
