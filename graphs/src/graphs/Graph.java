package graphs;

import java.util.ArrayList;

public class Graph {
	private int vCount;
	private int eCount;
	private int eCountLL;

	private ArrayList[] adjacents;  //try replacing with singly linked list
	Node adjacentsLL = new Node();

	public Graph(int vCount) {
		this.vCount = vCount;
		this.eCount = 0;
		this.eCountLL = 0;
		adjacents = new ArrayList[vCount];

		for(int i=0;i<vCount;i++) {
			adjacents[i] = new ArrayList<Integer>();
		}	
	}//end constructor

	public int getVertexCount() {
		return vCount;
	}

	public int getEdgeCount() {
		return eCount;
	}

	public void addEdge(int src, int dest) {
		adjacents[src].add(dest);
		eCount++;
	}	

	public void addEdgeLL(int src, int dest) {
		int cnt=0;
		adjacentsLL.src=src;
		adjacentsLL.dest[cnt]=dest;
		eCount++;
	}//end addEdgeLL

	public Object[] adj(int src) {
		return adjacents[src].toArray();
	}

	public void adjLL(int src) {
		Node tmpNode2 = adjacentsLL;

		while(tmpNode2 != null) {

			if(tmpNode2.src==src) {
				System.out.println("("+tmpNode2.src+" "+tmpNode2.dest+")");				
			}
			tmpNode2 = tmpNode2.next;
		}//end while		


	}//end adjLL

	public int listLength() {		
		int length=0;		

		Node currentNode = adjacentsLL;		

		while(currentNode != null) {
			System.out.println("Node "+length+" src is "+currentNode.src+" and dest is "+currentNode.dest);
			//System.out.println("length is "+length);
			length++;			
			currentNode = currentNode.next;			
		}			
		System.out.println("length is "+length);
		return length;	

	}//end listLength

}//end class
