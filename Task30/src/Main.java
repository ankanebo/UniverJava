//import static javax.swing.Spring.height;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(7);

        System.out.println(root.getData());
        System.out.println(root.left.getData());
        System.out.println(root.right.getData());
        System.out.println(root.right.left.getData());
        System.out.println(root.right.right.getData());
        System.out.println(root.left.left.getData());
        System.out.println(root.left.right.getData());

        System.out.println("height");
        System.out.println(Perform.height(root));

        Perform.lookUp(root, 4, " ");
        Perform.reverseTree(root);

        System.out.println("reverse root");
        System.out.println(root.getData());
        System.out.println(root.left.getData());
        System.out.println(root.right.getData());
        System.out.println(root.right.left.getData());
        System.out.println(root.right.right.getData());
        System.out.println(root.left.left.getData());
        System.out.println(root.left.right.getData());

        System.out.println("width");
        System.out.println(Perform.getMaxWidth(root));
        System.out.println("Количество узлов");
        System.out.println(Perform.size(root));
    }
}