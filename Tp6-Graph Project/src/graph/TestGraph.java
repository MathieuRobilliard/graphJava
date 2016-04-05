package graph;

/**
 * This <b>Class</b> make a graph with few vertices and edges.
 * @author Gauchoux, Robilliard
 */
public class TestGraph {

	/**
	 * The main: create a graph with 3 vertices and 2 edges.
	 * @param args: for main 
	 * @return a test graph
	 */
	public static void main(String[] args) {
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		
		Edge directedEdge = new DirectedEdge(vertex1, vertex2);
		Edge unDirectedEdge = new UnDirectedEdge(vertex2, vertex3);

	}

}
