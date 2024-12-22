import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;


public class Perform {

    public static int height(Node root) {
        int h1 = 0, h2 = 0;
        if(root == null){return 0;}
        if(root.left != null){h1 = height(root.left);}
        if(root.right != null){h2 = height(root.left);}
        return Math.max(h1, h2) + 1;
        /*if (root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int height = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            height++;
        }
        return height - 1;*/
    }

    public static void reverseTree(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.right;
        root.right = root.left;
        root.left = temp;
        reverseTree(root.left);
        reverseTree(root.right);
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.getData());
        inorder(root.right);
    }

    static boolean lookUp(Node root, int data, String path) {
        if (root.data == data) {
            System.out.println("Найдено");
            if (Objects.equals(path, " ")){
                System.out.println("Корень");
            }
            else{
            System.out.println(path);}
            return true;
//            return root;
        }
        if (root.left != null) {
            if (lookUp(root.left, data, path + " left "))
            {return true;};
        }
        if (root.right != null) {
            if (lookUp(root.right, data, path + " right ")){
                return true;
            };
        }
        if (Objects.equals(path, " ")) {
            System.out.println("Узла не существует в дереве");
        }
        return false;
    }

    public static int getWidth(Node root, int level)
    {
        if (root == null)
            return 0;

        if (level == 1)
            return 1;
        else if (level > 1)
            return getWidth(root.left, level - 1) + getWidth(root.right, level - 1);
        return 0;
    }

    public static int getMaxWidth(Node root)
    {
        int maxWidth = 0;
        int width;
        int h = height(root);
        int i;

        /* Get width of each level and compare
           the width with maximum width so far */
        for (i = 1; i <= h; i++) {
            width = getWidth(root, i);
            if (width > maxWidth)
                maxWidth = width;
        }

        return maxWidth;
    }
    public static int size(Node root){
        if (root == null){
            return 0;
        }
        else{
            return (size(root.left) + 1 + size(root.right));
        }
    }

}
