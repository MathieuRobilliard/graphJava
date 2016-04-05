package graph;

/**
 * This <b>interface</b> is an edge of the graph
 * @author Gauchoux, Robilliard
 */
public abstract class Edge {
	
	protected Vertex vertexSource;
	protected Vertex vertexEnd;
	
	/**
	 * This method make a edge with a beguining vertex and an end vertex
	 * @param vertexOrigin: the starter Vertex 
	 * @param vertexEnd: the final Vertex of the edge
	 */
	public Edge(Vertex vertexSource, Vertex vertexEnd) {
		this.vertexSource = vertexSource;
		this.vertexEnd = vertexEnd;
	}
	
	public Vertex getSource() {
		return this.vertexSource;
	}

	public Vertex getEnd() {
		return this.vertexEnd;
	}
	
}
