public class DiameterOpti {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeInfo {
        int hi;
        int di;

        TreeInfo(int hi, int di) {
            this.hi = hi;
            this.di = di;
        }
    }

    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int treeHeight = Math.max(left.hi,right.hi)+1;

        int leftDia = left.di;
        int rightDia = right.di;
        int selfDia = left.hi + right.hi+1;

        int treeDia = Math.max(selfDia, Math.max(leftDia,rightDia));

        TreeInfo resultInfo = new TreeInfo(treeHeight, treeDia);

        return resultInfo;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left = new Node(6);

        System.out.println("Diameter: " + diameter(root).di);

    }
}
