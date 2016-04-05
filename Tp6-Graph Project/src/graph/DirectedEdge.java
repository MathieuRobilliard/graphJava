package graph;

/**
 * This <b>Class</b> is an Oriented edge
 * @author Gauchoux, Robilliard
 */
public class DirectedEdge extends Edge{

	private Vertex vertexOrigin;
	private Vertex vertexEnd;
	
	/**
	 * This method make a edge with a beguining vertex and an end vertex
	 * @param vertexOrigin: the starter Vertex 
	 * @param vertexEnd: the final Vertex of the edge
	 */
	public DirectedEdge(Vertex vertexOrigin, Vertex vertexEnd) {
		this.vertexOrigin = vertexOrigin;
		this.vertexEnd = vertexEnd;
	}
	
}
