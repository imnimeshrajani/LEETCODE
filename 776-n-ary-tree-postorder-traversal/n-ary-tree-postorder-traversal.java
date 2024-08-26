/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        Stack<Node> parent = new Stack<>(), children  = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        parent.push(root);
        while(!parent.isEmpty()) {
            Node node = parent.pop();
            for(Node n : node.children)
                parent.push(n);

            children.push(node);
        }
        while(!children.isEmpty()) 
            ans.add(children.pop().val);
        return ans;
    }
}