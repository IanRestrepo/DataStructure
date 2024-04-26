public class BinaryTree {

    Node Root;
    public BinaryTree() {
        Root=null;
    }

    public void Traverse(Node n) {
        if(n != null) {
            Traverse(n.left);
            System.out.println("The index is: " + n.key + " Staff: " + n.Data);
            Traverse(n.right);
        }
    }
    public void insert(int i, Object Staff){
        Node NewNode = new Node(i);
        NewNode.Data = Staff;

        if (Root == null) {
            Root = NewNode;
        } else{
            Node AuxNode = Root;
            while(AuxNode != null){
                NewNode.Root = AuxNode;
                if(NewNode.key >= AuxNode.key) {
                    AuxNode = AuxNode.right;

                } else {
                    AuxNode = AuxNode.left;
                }
            }
            if (NewNode.key < NewNode.Root.key) {
                NewNode.Root.left = NewNode;
            } else {
                NewNode.Root.right = NewNode;
            }
        }
    }

    private class Node {
        public Node Root;
        public Node right;
        public Node left;
        public int key;
        public Object Data;

        public Node(int index){
            key=index;
            right = null;
            left = null;
            Root = null;
            Data = null;

        }
    }
}
