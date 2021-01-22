package DataStructure.HashTable;


import java.util.LinkedList;

public class HashTableImpl {

    class Node {
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] table; //LinkedList 배열

    public HashTableImpl(int size) {
        table = new LinkedList[size];
    }

    Long getHashCode(String key) {
        Long hashCode = 0L;

        for (char c : key.toCharArray()) {
            hashCode += (long) c;
        }
        return hashCode;
    }

    public int getIndex(Long hashCode) {
        return (int)(hashCode % table.length);
    }

    private Node searchNode(int index, String key) {
        LinkedList<Node> indexedList = table[index];

        for (Node n : indexedList) {
            if (n.key == key) {
                return n;
            }
        }
        return null;
    }

    public void put(String key, String value) {
        Long hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        if (table[index] == null) {
            table[index] = new LinkedList<Node>();
            table[index].add(new Node(key, value));
        }
        else {
            Node searched = searchNode(index, key);

            if (searched != null) { searched.value = value; }
            else { table[index].add(new Node(key, value)); }
        }
    }

    public String get(String key) {
        Long hashCode = getHashCode(key);
        int index = getIndex(hashCode);

        Node searched = searchNode(index, key);

        if (searched == null) { return ""; }
        else { return searched.value; }
    }

    public static void main(String[] args) {
        HashTableImpl hashTable = new HashTableImpl(10);
        hashTable.put("one","1");
        hashTable.put("two","2");
        hashTable.put("three","3");
        System.out.println(hashTable.get("three"));


    }
}
