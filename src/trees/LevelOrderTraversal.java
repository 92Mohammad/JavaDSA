package trees;

import java.util.*;

class LevelOrderTraversal{
    class Node {
        private int value;
        protected Node left;
        protected Node right;

        Node (int value) {
            this.value = value;
            
        }
        public int getValue(){
            return this.value;
    
        }
    }
    private static final String Queue = null;   
    private Node root;


    public void insert(int value) {
        root = insert(value, root); 
    }

    private Node insert(int value, Node node) {
        if (node == null){
            node = new Node(value);
            return node;
        }

        if (value < node.value){
            node.left = insert(value, node.left);
        }
        if (value > node.value){
            node.right = insert(value, node.right);
        }
        return node;
    
    }

    public void levelOrder(Node node){
        if (node == null){
            return;
        }
        Queue<Node> queue = new PriorityQueue<>();
        queue.add(node);
        queue.add(null);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
        }


    }

    public static void main(String[] args) {
        
    }




}