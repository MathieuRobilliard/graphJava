package graph;

/**
 * Describe an edge connecting to two vertices
 * Can be a DirectedEdge or UndirectedEdge
 * @see DirectedEdge
 * @see UndirectedEdge
 * @author Gauchoux, Robilliard
 */
public abstract class Edge {
	
	/**
	 * The source of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 */
	protected Vertex vertexSource;
	
	/**
	 * The end of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 */
	protected Vertex vertexEnd;
	
	/**
	 * Make an edge with two vertices
	 * @param vertexSource The source of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 * @param vertexEnd The end of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 */
	public Edge(Vertex vertexSource, Vertex vertexEnd) {
		this.vertexSource = vertexSource;
		this.vertexEnd = vertexEnd;
	}
	
	/**
	 * @return The source of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 */
	public Vertex getSource() {
		return this.vertexSource;
	}

	/**
	 * @return The end of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 */
	public Vertex getEnd() {
		return this.vertexEnd;
	}
	
}
