class Solution {
     public void addToGraph(Map<Integer,List<Integer>> graph,int key,int value) {
        if(graph.containsKey(key)) {
            graph.get(key).add(value);
        } else {
           List<Integer> temp = new ArrayList<Integer>();
           temp.add(value);
           graph.put(key,temp);
        }
    }

    public void getArray(int start,Map<Integer,List<Integer>> graph,int[] ans,int i) {
        ans[i] = start;
        if(i==ans.length-1) {
            return;
        }
        int neighbor = graph.get(start).get(0);
        int j = graph.get(neighbor).indexOf(start);
        graph.get(neighbor).remove(j);
        getArray(neighbor,graph,ans,i+1);
    }
    public int[] restoreArray(int[][] adjacentPairs) {
        int[] restoredArray = new int[adjacentPairs.length+1];
        Map<Integer,List<Integer>> graph = new HashMap<Integer,List<Integer>>();

        for(int i=0; i<adjacentPairs.length; i++) {
            addToGraph(graph,adjacentPairs[i][0],adjacentPairs[i][1]);
            addToGraph(graph,adjacentPairs[i][1],adjacentPairs[i][0]);
        }

        //search 1st element , Key whose having only single elemengt in its list(neighbours)
        int start = 0;
        for(int key: graph.keySet()) {
            if(graph.get(key).size()==1) {
                start = key;
                break;
            }
        }
        
        getArray(start,graph,restoredArray,0);
        return restoredArray;
        }
        
}