class Solution {
    HashMap<Node,Node>result=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        if(result.containsKey(node)){
            return result.get(node);
        }
        Node clone =new Node(node.val);
        result.put(node,clone);
        for(int i=0;i<node.neighbors.size();i++){
            Node next=node.neighbors.get(i);
            clone.neighbors.add(cloneGraph(next));
        }
        return clone;
    }
}
