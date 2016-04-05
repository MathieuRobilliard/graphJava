package graph;

/**
 * Describe an edge connecting two vertices
 * @author Gauchoux, Robilliard
 */
public class UndirectedEdge extends Edge {

	/**
	 * Make an undirected edge with two vertices
	 * @param vertex1 A vertex
	 * @param vertex2 Another vertex
	 */
	public UndirectedEdge(Vertex vertex1, Vertex vertex2) {
		super(vertex1, vertex2);
	}

}
