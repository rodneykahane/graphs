package graphs;

public class App {

	public static void main(String[] args) {
	/*	Graph myGraph = new Graph(5);
		myGraph.addEdge(0,1);
		myGraph.addEdge(0,2);
		myGraph.addEdge(0,3);
		myGraph.addEdge(1,2);
		myGraph.addEdge(1,4);
		myGraph.addEdge(2,3);
		myGraph.addEdge(3,1);
		myGraph.addEdge(4,0);
		myGraph.addEdge(4,3);
		
		Object[] values = myGraph.adj(2);
		for(Object val: values) {
			System.out.println(val);
		}*/
		
		/*Node nodeA = new Node();
		nodeA.data = 4;		
		
		Node nodeB = new Node();
		nodeB.data = 3;		
		
		Node nodeC = new Node();
		nodeC.data = 7;		
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;*/
		
		//System.out.println(listLength(nodeA)); //4
		//System.out.println(listLength(nodeB));//3
		//System.out.println(nodeD.data);
		
		Node stateSt = new Node();
		Node avenelSt = new Node();
		Node poconoPl = new Node();
		Node williamAve = new Node();		
		Node elmSt = new Node();
		
		stateSt.path1 = avenelSt;
		stateSt.path2 = elmSt;
		
		avenelSt.path1 = poconoPl;
		
		poconoPl.path1 = elmSt;
		
		williamAve.path1 = poconoPl;
		williamAve.path2 = elmSt;
		williamAve.path3 = stateSt;
		
	}//end main
	public static int listLength(Node aNode) {		
		int length=0;		
		
		Node currentNode = aNode;		
		
		while(currentNode != null) {
			length++;
			currentNode = currentNode.next;			
		}			
		
		return length;	
		
	}//end listLength

}//end class
