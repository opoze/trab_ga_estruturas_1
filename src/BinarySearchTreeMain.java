public class BinarySearchTreeMain {


    public static void main(String[] args) {
        BinarySearchTree<Integer, Integer> BST = new BinarySearchTree<Integer, Integer>();

        BST.insert(4, 4);
        BST.insert(6, 6);
        BST.insert(1, 1);
        BST.insert(3, 3);
        BST.insert(2, 2);
        BST.insert(10,10);
        BST.insert(5, 5);

        System.out.println(BST.toString());
//        System.out.println(BST.countNodes());
//        System.out.println(BST.countInternalNodes());
        System.out.println(BST.descendents(14));

    }

}
