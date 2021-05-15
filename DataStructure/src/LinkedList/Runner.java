package LinkedList;

public class Runner {

	public static void main(String[] args) {
		Linkedlist list=new Linkedlist();
		list.insert(500000);
		list.insert(50);
		list.insert(500);
		list.insert(5000);
		list.insertAtStart(66);
		list.insertAtBetween(4,77);
		list.show();
		list.delete(0);
		list.show();

	}

}
