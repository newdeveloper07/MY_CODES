

// import java.util.*;



// public class PracticeBinaryTree {
//     static class Node{
//         int data;
//         Node left = null;
//         Node right = null;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }

       

//     }
//     static class BinaryTrees{
//         static int idx = -1;
//         public static void buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;

//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;
//         }     

           
//     }
//     public static void levelOrder(Node root){
//         if(root == null){
//             return;
//         }
//         Queue<Node> q= new LinkedList<>();
//         q.add(root);
//         q.add(null);
//         while(!q.isEmpty()){
//             Node currNode = q.remove();
//             if(currNode == null){
//                 System.out.println();
//                 if(q.isEmpty()){
//                     break;

//                 }else{
//                     System.out.println(root.data);
//                     if(currNode.left!= null){
//                        q.add(currNode.left);
//                     }
//                     if(currNode.right!= null){
//                        q.add(currNode.right);
                
//                 }
//             }

//         }
//     }

//     public static void main(String[] nargs){
//         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         BinaryTrees tree = new BinaryTrees();
//         Node root = tree.buildTree(nodes);
//         levelOrder(root);

//     }
    
    
// }

import java.util.*;

public class PracticeBinaryTree {
    static class Node {
        int data;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if ( nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                    
                }else{
                    q.add(null);
                }
            } else {
                System.out.println(currNode.data + " "); // Print the current node's data
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);
        levelOrder(root);
    }
}

