class MyHashMap {
    private static final int SIZE = 10000;
    private Node[] table;

    /** Initialize your data structure here. */
    public MyHashMap() {
        table = new Node[SIZE];
    }
    
    /** Value node to store the key-value pair. */
    class Node {
        int key;
        int value;
        Node next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    /** Inserts a key-value pair into the HashMap. If the key already exists, update the corresponding value. */
    public void put(int key, int value) {
        int index = key % SIZE;
        Node prev = find(index, key);
        
        if (prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key. */
    public int get(int key) {
        int index = key % SIZE;
        Node prev = find(index, key);
        
        if (prev.next == null) {
            return -1;
        } else {
            return prev.next.value;
        }
    }
    
    /** Removes the key and its corresponding value if the map contains the mapping for the key. */
    public void remove(int key) {
        int index = key % SIZE;
        Node prev = find(index, key);
        
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }
    
    /** Helper function to find the node before the target key. */
    private Node find(int index, int key) {
        if (table[index] == null) {
            return table[index] = new Node(-1, -1);
        }
        Node prev = table[index];
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
