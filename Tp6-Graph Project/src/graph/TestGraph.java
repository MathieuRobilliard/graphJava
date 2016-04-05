package graph;

/**
 * Test library to make a graph with few vertices and edges.
 * @author Gauchoux, Robilliard
 */
public class TestGraph {

	public static void main(String[] args) {
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		
		Edge directedEdge = new DirectedEdge(vertex1, vertex2);
		Edge unDirectedEdge = new UndirectedEdge(vertex2, vertex3);

	}

}
