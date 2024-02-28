class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(leftChild[i] != -1){
                if(visited[leftChild[i]])  return false;
                visited[leftChild[i]] = true;
            }
            if(rightChild[i] != -1){
                if(visited[rightChild[i]])  return false;
                visited[rightChild[i]] = true;
            }
        }
        int idx = -1;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                if(idx == -1) idx = i;
                else return false;
            }
        }
        visited = new boolean[n];
        if(idx == -1 || !helper(idx, leftChild, rightChild, visited)) return false;
        for(int i = 0; i <n; i++) 
            if(!visited[i]) return false;
        return true;
    }
    boolean helper(int val, int[] left, int[] right, boolean[] visited) {
        if(val == -1) return true;
        if(visited[val]) return false;
        visited[val] = true;
        return helper(left[val], left, right,visited) && helper(right[val], left, right, visited);
    }
}