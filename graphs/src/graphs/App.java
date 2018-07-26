package graphs;

public class App {

	public static void main(String[] args) {
		Graph myGraph = new Graph(5);
		myGraph.addEdge(0,1);
		myGraph.addEdge(0,2);
		myGraph.addEdge(0,3);
		myGraph.addEdge(1,2);
		myGraph.addEdge(1,4);
		myGraph.addEdge(2,3);
		myGraph.addEdge(3,1);
		myGraph.addEdge(4,0);
		myGraph.addEdge(4,3);
		
		Object[] values = myGraph.adj(4);
		for(Object val: values) {
			System.out.println(val);
		}
		
		Graph myGraph2 = new Graph(5);
		myGraph2.addEdgeLL(0,1);
		myGraph2.addEdgeLL(0,2);
		myGraph2.addEdgeLL(0,3);
		myGraph2.addEdgeLL(1,2);
		myGraph2.addEdgeLL(1,4);
		myGraph2.addEdgeLL(2,3);
		myGraph2.addEdgeLL(3,1);
		myGraph2.addEdgeLL(4,0);
		myGraph2.addEdgeLL(4,3);
		
		myGraph2.adjLL(4);
		
		myGraph2.listLength();
		
		/*
		Node nodeA = new Node();
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
		
		/*Node stateSt = new Node();
		Node avenelSt = new Node();
		Node poconoPl = new Node();
		Node williamAve = new Node();		
		Node elmSt = new Node();
		
		stateSt.path1 = avenelSt;
		stateSt.path2 = elmSt;
		stateSt.data = 1;
		
		avenelSt.path1 = poconoPl;
		stateSt.data = 2;
		
		poconoPl.path1 = elmSt;
		poconoPl.data = 3;
		
		williamAve.path1 = poconoPl;
		williamAve.path2 = elmSt;
		williamAve.path3 = stateSt;
		williamAve.data = 4;
		
		elmSt.path1 = williamAve;
		elmSt.path2 = avenelSt;
		elmSt.data = 5;
*/		
		//Graph.listRoutes(stateSt);
		
	}//end main
	
	

}//end class
