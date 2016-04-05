package graph;

/**
 * This <b>Class</b> is an edge without direction
 * @author Gauchoux, Robilliard
 */
public class UnDirectedEdge extends Edge{

	private Vertex vertex1;
	private Vertex vertex2;
	
	/**
	 * This method make a edge without a source and an end vertex
	 * @param vertex1n: a Vertex 
	 * @param vertex2: a Vertex
	 */
	public UnDirectedEdge(Vertex vertex1, Vertex vertex2) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
	}

}
