
// Author Pranjal Bhardwaj
// Enrollment E19CSE432

class Node {
	int x;
	Node next;
}
class LinkedList {
	Node head = null;
	void add(Node flag){
		if(head == null) {
			head = flag;
		} else {
			Node mark = head;
			while(mark.next != null) {mark = mark.next;}
			mark.next = flag;
		}
	}
	void print(){
		Node mark = head;
		while(mark != null) {
			System.out.print(mark.x+" ");
			mark = mark.next;
		}
	}
	void sort() {
		Node mark = head,flag = head;
		while(flag.next != null) {
			flag = flag.next;
			mark = head;
			while(mark.next != null) {
				if(mark.x > mark.next.x) {
					int temp = mark.x;
					mark.x = mark.next.x;
					mark.next.x = temp;
				}
				mark = mark.next;
			}
		}
	}
}

public class LinkedListBubbleSort {
	public static void main(String[] args) {
		LinkedList temp = new LinkedList();
		for(int i = 10;i > 0;i--) {
			Node flag = new Node();
			flag.x = i;
			temp.add(flag);
		}
		System.out.print("Linked List before sorting: ");
		temp.print();
		temp.sort();
		System.out.print("\nLinked List after sorting: ");
		temp.print();		
	}
}