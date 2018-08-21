
public class BinarySearchTreeTest {

	public static void main(String[] args) {

		System.out.println("teste");
		
		BinarySearchTree<Integer, Integer> t = new BinarySearchTree<>(); 
		t.insert(0, 1);
		t.insert(1, 10);
		t.insert(10, 3);
		t.insert(20, 21);
		t.insert(15, 546);
		t.insert(2, 5416);
		t.insert(-5, 23140);
		t.insert(-4, 123);
		t.insert(-20, 120);
		t.insert(21, 578);
		
		//9 Nodes; 4 folhas; 4 internos;
		
		Integer number = t.search(-5);
		
		System.out.println(t);
		System.out.println(t.countInternalNodes());
		
		//System.out.println(t);
	}

}
