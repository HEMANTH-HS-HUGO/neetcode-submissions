class Linkedlist{
    int key;
    int value;
    Linkedlist next;

    public Linkedlist(int key, int val){
        this.key = key;
        this.value = val;
    }
}

class MyHashMap {
    private Linkedlist[] buckets;

    public MyHashMap() {
        buckets = new Linkedlist[10000];
        for(int i=0;i<10000;i++){
            buckets[i] = new Linkedlist(-1, -1); // check -1 to pass or what 
        }
    }
    
    public void put(int key, int value) {
        Linkedlist curr = this.buckets[key % buckets.length];

        while(curr.next != null){
            if(curr.next.key == key){
                curr.next.value = value; // updating if already there
                return;
            }
            curr = curr.next;
        }
        curr.next = new Linkedlist(key,value);
    }
    
    public int get(int key) {
        Linkedlist curr = this.buckets[key % buckets.length];

        while(curr.next != null){
            if(curr.next.key == key){
                return curr.next.value;
            }
            curr = curr.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        Linkedlist curr = this.buckets[key % buckets.length];

        while(curr.next !=null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */