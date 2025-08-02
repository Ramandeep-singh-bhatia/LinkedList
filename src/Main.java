//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*SNode head = new SNode(1);
        SNode two = new SNode(2);
        SNode three = new SNode(3);
        SNode four = new SNode(4);
        SNode five = new SNode(5);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Delete dsll = new Delete();
        System.out.println("Delete Head");
        dsll.printSLL(dsll.deleteHeadSLL(null));
        dsll.printSLL(dsll.deleteHeadSLL(new SNode(7)));
        dsll.printSLL(dsll.deleteHeadSLL(head));

        System.out.println("Delete Tail");

        dsll.printSLL(dsll.deleteTailSLL(null));
        dsll.printSLL(dsll.deleteTailSLL(new SNode(7)));
        dsll.printSLL(dsll.deleteTailSLL(head));

        System.out.println("Delete Kth element");

        dsll.printSLL(dsll.deleteKthNodeSLL(null, 3));
        dsll.printSLL(dsll.deleteKthNodeSLL(head, 0));
        dsll.printSLL(dsll.deleteKthNodeSLL(new SNode(7), 3));
        //dsll.printSLL(dsll.deleteKthNodeSLL(head, 1));
        dsll.printSLL(dsll.deleteKthNodeSLL(head, 3));

        System.out.println("Delete element with a value");

        dsll.printSLL(dsll.deleteValueSLL(null, 3));
        dsll.printSLL(dsll.deleteValueSLL(head, 0));
        //dsll.printSLL(dsll.deleteValueSLL(head, 1));
        dsll.printSLL(dsll.deleteValueSLL(head, 4));

        Insert isll = new Insert();

        System.out.println("Insert Before Head");
        isll.printSLL(isll.insertBeforeHeadSLL(null, 0));
        isll.printSLL(isll.insertBeforeHeadSLL(new SNode(7), 0));
        isll.printSLL(isll.insertBeforeHeadSLL(head, 0));

         System.out.println("Insert After Head");
        isll.printSLL(isll.insertAfterHeadSLL(null, 0));
        isll.printSLL(isll.insertAfterHeadSLL(new SNode(7), 0));
        isll.printSLL(isll.insertAfterHeadSLL(head, 0));

        System.out.println("Insert Before Tail");
        isll.printSLL(isll.insertBeforeTailSLL(null, 0));
        isll.printSLL(isll.insertBeforeTailSLL(new SNode(7), 0));
        isll.printSLL(isll.insertBeforeTailSLL(head, 0));

        System.out.println("Insert After Tail");
        isll.printSLL(isll.insertAfterTailSLL(null, 0));
        isll.printSLL(isll.insertAfterTailSLL(new SNode(7), 0));
        isll.printSLL(isll.insertAfterTailSLL(head, 0));

        System.out.println("Insert Before Kth value");
        isll.printSLL(isll.insertBeforeKthSLL(null, 0, 3));
        isll.printSLL(isll.insertBeforeKthSLL(new SNode(7), 0, 3));
        isll.printSLL(isll.insertBeforeKthSLL(head, 0,3));

        System.out.println("Insert After Kth value");
        isll.printSLL(isll.insertAfterKthSLL(null, 0, 3));
        isll.printSLL(isll.insertAfterKthSLL(new SNode(7), 0, 3));
        isll.printSLL(isll.insertAfterKthSLL(head, 0,3));

        System.out.println("Insert Before node value");
        isll.printSLL(isll.insertBeforeValueSLL(null, 0, 3));
        //isll.printSLL(isll.insertBeforeValueSLL(head, 0, 1));
        isll.printSLL(isll.insertBeforeValueSLL(new SNode(7), 0, 3));
        isll.printSLL(isll.insertBeforeValueSLL(head, 0,3));

        System.out.println("Insert After node value");
        isll.printSLL(isll.insertAfterValueSLL(null, 0, 3));
        //isll.printSLL(isll.insertAfterValueSLL(head, 0, 1));
        isll.printSLL(isll.insertAfterValueSLL(new SNode(7), 0, 3));
        //isll.printSLL(isll.insertAfterValueSLL(head, 0,3));
        isll.printSLL(isll.insertAfterValueSLL(head, 0,5));*/


        DNode head = new DNode(1, null);
        DNode two = new DNode(2, head);
        DNode three = new DNode(3, two);
        DNode four = new DNode(4, three);
        DNode five = new DNode(5, four);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Delete ddll = new Delete();
        /*System.out.println("Delete Head");
        ddll.printDLL(ddll.deleteHeadDLL(null));
        ddll.printDLL(ddll.deleteHeadDLL(new DNode(7)));
        ddll.printDLL(ddll.deleteHeadDLL(head));

        System.out.println("Delete Tail");
        ddll.printDLL(ddll.deleteTailDLL(null));
        ddll.printDLL(ddll.deleteTailDLL(new DNode(7)));
        ddll.printDLL(ddll.deleteTailDLL(head));

        System.out.println("Delete Kth Node");
        ddll.printDLL(ddll.deleteKthNodeDLL(null, 3));
        ddll.printDLL(ddll.deleteKthNodeDLL(head, 0));
        ddll.printDLL(ddll.deleteKthNodeDLL(new DNode(7), 3));
        ddll.printDLL(ddll.deleteKthNodeDLL(head, 1));
        ddll.printDLL(ddll.deleteKthNodeDLL(head, 3));

        System.out.println("Delete element with a value");

        ddll.printDLL(ddll.deleteValueDLL(null, 3));
        ddll.printDLL(ddll.deleteValueDLL(head, 0));
        ddll.printDLL(ddll.deleteValueDLL(head, 1));
        ddll.printDLL(ddll.deleteValueDLL(head, 4));*/
    }
}