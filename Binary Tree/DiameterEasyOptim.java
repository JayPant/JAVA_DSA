public class DiameterEasyOptim {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left=null;
            this.right = null;
        }
    }
    static int treeDiameter; 

    public static int height(Node root){
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }

    public static int diameter(Node root){
        findDepth(root);
         return treeDiameter;
    }

    public  static int findDepth(Node root){
        if (root == null) {
            return 0;
        }

        int left = findDepth(root.left);
        int right = findDepth(root.right);

        treeDiameter = Math.max(treeDiameter, left+right)+1;

        return Math.max(left, right)+1;

 
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left = new Node(6);

        System.out.println("Diameter: "+ diameter(root));

    }
}
