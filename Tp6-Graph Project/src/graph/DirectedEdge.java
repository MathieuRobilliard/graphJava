package graph;

/**
 * Describe an edge connecting a source vertice and an end vertice
 * @author Gauchoux, Robilliard
 */
public class DirectedEdge extends Edge {

	/**
	 * Make a directed edge with a source vertex and an end vertex
	 * @param vertexSource The source of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 * @param vertexEnd The end of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 */
	public DirectedEdge(Vertex vertexOrigin, Vertex vertexEnd) {
		super(vertexOrigin, vertexEnd);
	}

}
