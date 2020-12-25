package DataStructure.LinkedList;

public class Controller {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(0);
        linkedList.append(1);
        linkedList.push(0);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(6);
        linkedList.push(10);
        linkedList.push(11);

        linkedList.printList();
        System.out.println("인덱스 투 노드:"+linkedList.nodeAtIndex(0).value);

    }
}
