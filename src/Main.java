public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(1,"Ian Restrepo");
        binaryTree.insert(2, "Manuela Zuluaga");
        binaryTree.insert(8, "Juan Restrepo");
        binaryTree.insert(6, "Sebastian Marín");
        binaryTree.insert(3, "Belki Jhoana");

        binaryTree.Traverse(binaryTree.Root);
    }
}