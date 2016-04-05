package graph;

/**
 * This <b>interface</b> represent the graph, which has vertices and edges
 * @author Gauchoux, Robilliard
 */
public interface Graph {
	
	/**
	 * Create a new Edge in this graph, going from the source vertex to the target vertex, and returns the created edge.
	 * @param vertexSource
	 * @param vertexEnd
	 * @return
	 */
	public Edge addEdge(Vertex vertexSource, Vertex vertexEnd);
	
	/**
	 * Adds the specified edge to this graph, going from the source vertex to the target vertex.
	 * @param vertex1
	 * @param vertex2
	 * @param edge
	 */
	public void addEdge(Vertex vertex1, Vertex vertex2, Edge edge);
	
	/**
	 * Adds the specified vertex to this graph if not already present.
	 * @param vertex
	 */
	public void addVertex(Vertex vertex);
	
	/**
	 * Returns true if this graph contains the specified edge.
	 * @param e
	 */
	public Boolean containsEdge(Edge e);
	
	/**
	 * Returns true if and only if this graph contains an edge going from the source vertex to the target vertex.
	 * @param sourceVertex
	 * @param targetVertex
	 * @return
	 */
	public Boolean containsEdge(Vertex sourceVertex, Vertex targetVertex);
	
	/**
	 * Returns true if this graph contains the specified vertex.
	 * @param v
	 * @return
	 */
	public Boolean containsVertex(Vertex v);
	
	/**
	 * Returns an edge connecting source vertex to target vertex if such vertices and such edge exist in this graph.
	 * @param sourceVertex
	 * @param targetVertex
	 * @return
	 */
	public Edge getEdges(Vertex sourceVertex, Vertex targetVertex);
	
	/**
	 * Returns the source vertex of an edge.
	 * @param e
	 */
	public Vertex getEdgeSource(Edge e);
	
	/**
	 * Returns the target vertex of an edge.
	 * @param e
	 * @return
	 */
	public Vertex getEdgeTarget(Edge e);
	
	/**
	 * Removes the specified edge from the graph.
	 * @param e
	 */
	public void removeEdge(Edge e);
	
	/**
	 * Removes the specified vertex from this graph including all its touching edges if present.
	 * @param v
	 */
	public void removeVertex(Vertex v);
	
}
