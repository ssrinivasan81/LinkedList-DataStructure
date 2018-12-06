
public class LinkedList {
	Node head; // first node
	
	public void insert(int x) {
		// whenever we call insert, we have to create new node and assign data as passing argu
		Node node = new Node();
		node.data = x;
		node.next = null; // during insert of first element, next pointer to null
		
		if (head == null) { // First object in L.list
			head = node;
		} else { // Imagine we already has node
			Node n = head;
			while (n.next != null) { //way to travel in linked list
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void show() {
		Node node = head; // always start with Head
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data); // last element has reference as NULL value. so manually display it
	}
}
