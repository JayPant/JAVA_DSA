import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewBinaryTree {

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
        int hd;
        Node node;

        TreeInfo(Node node, int hd) {
            this.hd = hd;
            this.node = node;
        }
    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        Queue<TreeInfo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new TreeInfo(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            TreeInfo curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }

            // populate map
            else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                // min belongs to left side
                if (curr.node.left != null) {
                    q.add(new TreeInfo(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                // max belongs to right side
                if (curr.node.right != null) {
                    q.add(new TreeInfo(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // 1
        // / \
        // 2 3
        // \
        // 4
        // \
        // 5
        // \
        // 6

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        topView(root);
        // System.out.println("Height: "+ height(root));

    }
}
