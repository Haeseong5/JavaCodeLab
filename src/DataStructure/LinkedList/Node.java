package DataStructure.LinkedList;

public class Node<Value> {
  public Value value;
  public Node<Value> next;

  public Node(Value value) {
    this.value = value;
    this.next = null;
  }

  public Node(Value value, Node<Value> next) {
    this.value = value;
    this.next = next;
  }
}