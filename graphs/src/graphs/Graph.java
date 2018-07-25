package graphs;

import java.util.ArrayList;

public class Graph {
	private int vCount;
	private int eCount;
	
	private ArrayList[] adjacents;  //try replacing with singly linked list
	
	public Graph(int vCount) {
		this.vCount = vCount;
		this.eCount = 0;
		adjacents = new ArrayList [vCount];
		
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
	
	public Object[] adj(int src) {
		return adjacents[src].toArray();
	}
	
}//end class
