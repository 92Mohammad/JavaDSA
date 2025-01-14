package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class LevelOrder extends BinaryTree{
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);

        LevelOrder level = new LevelOrder();
        System.out.println(level.levelOrderTraversal(tree.root));

    }

    public ArrayList<ArrayList<Integer>> levelOrderTraversal(Node node){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (node == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();            
            for (int i = 0; i < size; i++) {
                Node current =  queue.remove();
                currentLevel.add(current.value);

                if (current.left != null){
                    queue.add(current.left);
                }
                if (current.right != null){
                    queue.add(current.right);
                }
            }

            result.add(currentLevel);
        }
        return result;
    }
}

