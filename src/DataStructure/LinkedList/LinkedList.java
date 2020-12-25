package DataStructure.LinkedList;

public class LinkedList<Value> {
    private Node<Value> head; //첫번째 노드
    private Node<Value> tail; //마지막 노드

    public boolean isEmpty(){
        return head == null; // 첫번째 노드가 null 이면, 비어있다.
    }

    //Adds a value at the front of the list. 0(1)
    //맨 앞에 노드 추가
    public void push(Value value) { //저장할 값을 매개변수로 받고
        head = new Node<Value>(value, head); // 삽입노드를 첫번째 노드로 지정, 이전 노드를 첫번째노드(삽입노드)가 가리키도록 함.
        if (tail == null){ //마지막 노드가 없으면,
            tail = head; //첫번째노드를 마지막 노드로 지정
        }// 마지막 노드가 있으면, 마지막 노드를 건드릴 필요는 없음
    }

    //Adds a value at the end of the list. O(1)
    // 맨 뒤에노드 추가
    public void append(Value value) {
        if (isEmpty()) {
            push(value); //첫번째 노드로 삽입
        } else {
            tail.next = new Node<Value>(value); //마지막 노드가 가리키는 곳을 삽입노드로 지정. 즉, 삽입노드가 마지막노드가 됨.
            tail = tail.next; // 마지막 노드를 삽입노드의 주소값 할당
        }
    }

    // insert after a node. O(1)
    // 중간에 노드 추가
    public Node<Value> insert(Value value, int index){
        Node<Value> preNode = nodeAtIndex(index);
        if (tail == preNode) { //기준 노드가 마지막 노드라면
            append(value); //맨 뒤에 추가
            return tail;
        } else { //마지막 노드가 아니라면
           preNode.next = new Node<Value>(value, preNode.next); //삽입노드는 이전노드의 next 노드를 가리키토록함. 이전 노드는 삽입 노드를 가리키도록.
           return preNode.next; //삽입한 노드 리턴
        }
    }

    //Return a node given index. O(n)
    public Node<Value> nodeAtIndex(int index) {
        Node<Value> currentNode = head;
        int currentIndex = 0;

        //현재 접근한 인덱스가 기준 인덱스와 같아지면, 반복을 멈추고 해당 노드 리턴
        while (currentNode != null && currentIndex < index) { //0이면 0번쨰 노드 리턴. 비어있으면 null 리턴
            currentNode = currentNode.next;
            currentIndex += 1;
        }
        return currentNode;
    }

    // Removes the value at the front of the list. O(1)
    // 맨 앞 삭제
    public Value pop() {
        Value removedValue = head.value;
        head = head.next; //두번쨰 노드를 첫번째 노드로 지정 -> 첫번째 노드는 연결이 끊김
        if (isEmpty()) {
            tail = null;
        }
        return removedValue;
    }

    // Removes the value at the end of the list. O(n)
    // 맨 뒤 노드 삭제
    public Value removeLast() {
        if (head == null) { return null; }
        if (head.next == null) { return pop(); }

        Node<Value> prev = head;
        Node<Value> current = head;

        while (current.next != null) { //다음노드가 없으면(즉, 마지막 노드라면) 탐색 종료.
            prev = current; //현재노드로 이전 노드로
            current = current.next; //다음노드를 현재 노드로, 바꾸면서 탐색
        }
        prev.next = null; //마지막 노드의 이전 노드가 가리키는 곳을 없앰으로써 마지막 노드와의 연결을 끊음.
        tail = prev; //마지막 노드는 뒤에서 두번째 노드가 되는 것
        return current.value; //연결이 끊긴 노드의 값 리턴
    }

    /// Removes a value anywhere in the list. O(1)
    // 위치 관계 없이 노드 삭제
    public Value remove(Node<Value> preNode) {
        Value removedValue = preNode.next.value; //다음노드의 값 저장
        if (preNode.next == tail) { // 이전노드의 다음노드가 마지막 노드라면
            tail = preNode; //이전노드를 마지막노드로 지정
        }
        preNode.next = preNode.next.next; // 이전노드가 가리는 곳을, 이전 노드의 다음 다음 노드로 변경
        return removedValue; //삭제된 값 리턴
    }

    /// 전체 노드 출력
    public void printList() {
        if (head == null) {
            System.out.println("리스트가 비어 있습니다.");
        }else{
            Node<Value> current = head;

            while (current.next != null) {
                System.out.println(current.value);
                current = current.next;
            }
            System.out.println(current.value);
        }
    }
}
