class FreqStack {
    Map<Integer, Integer> freqMap;
    Map<Integer, Stack<Integer>> freqStack;
    int maxFreq;
    public FreqStack() {
        freqMap = new HashMap<>();
        freqStack = new HashMap<>();
        maxFreq = 0;
    }

    //1.increment val
    
    public void push(int val) {
        int freq = freqMap.getOrDefault(val,0)+1;
        freqMap.put(val, freq);
        if(freq > maxFreq) maxFreq = freq;
        freqStack.putIfAbsent(freq, new Stack<>());
        freqStack.get(freq).push(val);
    }
    
    public int pop() {
       int val = freqStack.get(maxFreq).pop();

        freqMap.put(val, freqMap.get(val)-1);

        if(freqStack.get(maxFreq).isEmpty()){
            maxFreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */