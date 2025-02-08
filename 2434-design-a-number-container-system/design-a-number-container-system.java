class NumberContainers {

    Map<Integer, PriorityQueue<Integer>> num;
    Map<Integer, Integer> idx;
    public NumberContainers() {
        num = new HashMap<>();
        idx = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(idx.containsKey(index)) {
            int prevNum = idx.get(index);
            if(prevNum == number) return;
            num.get(prevNum).remove(index);
        }
        num.computeIfAbsent(number, k -> new PriorityQueue<>()).offer(index);
        idx.put(index, number);
    }
    
    public int find(int number) {
        PriorityQueue<Integer> pq = num.getOrDefault(number, new PriorityQueue<>());
        return pq.isEmpty() ? -1 : pq.peek();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */