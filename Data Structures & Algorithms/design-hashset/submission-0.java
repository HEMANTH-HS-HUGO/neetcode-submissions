
class ListNode{
    int key;
    ListNode next;
    
    public ListNode(int key){
        this.key = key;
    }

}

class MyHashSet {
    private ListNode[] buckets;

    public MyHashSet() {
        buckets = new ListNode[10000];
        for(int i = 0; i< 10000; i++){
            buckets[i] = new ListNode(-1);
        }
    }
    
    public void add(int key) {
        ListNode curr = this.buckets[key % buckets.length];
        while(curr.next != null){
            if(curr.next.key == key){
                return;
            }

            curr = curr.next;
        }
        curr.next = new ListNode(key);
    }
    
    public void remove(int key) {
        ListNode curr = this.buckets[key % buckets.length];
        while(curr.next != null){
            if(curr.next.key == key){
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode curr = this.buckets[key % buckets.length];
        while(curr.next != null){
            if(curr.next.key == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */