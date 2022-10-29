
public class DeleteNode {

	public static void main(String[] args) {
		int[] dataSet = {1,2,3,4,5,6,7,8,9,10};
		Node1 head=null;
		Node1 curr = null;
		Node1 deleteNode = null;
		for(int i=0;i<dataSet.length;i++) {
			if(head==null) {
				head = new Node1(dataSet[i]);
				curr = head;
			}
			else {
				
				curr.next = new Node1(dataSet[i]);
				curr = curr.next;
				if(dataSet[i]==5) {
					deleteNode = curr;
				}
			}
		}
		Node1 nextNode = deleteNode.next;
		deleteNode.data = nextNode.data;
		deleteNode.next = nextNode.next;
		
		Node1 newHead =  head;
		while(newHead!=null) {
			System.out.print(newHead.data + "->");
			newHead = newHead.next;
		}

	}
}

class Node1{
	Node1 next = null;
	int data;
	Node1(int data){
		this.data = data;
	}
}

