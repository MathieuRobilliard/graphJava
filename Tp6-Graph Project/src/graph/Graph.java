package graph;

/**
 * This interface allows to manipulate a directed or undirected graph
 * @author Gauchoux, Robilliard
 */
public interface Graph {
	
	/**
	 * Creates a new edge, going from the source vertex to the end vertex, and returns it
	 * Both vertices must don't exist in the graph
	 * @param sourceVertex The source of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 * @param endVertex The end of the edge for DirectedEdge, can be both of vertices in case of UndirectedEdge
	 * @return the created edge using parameters
	 */
	public Edge addEdge(Vertex sourceVertex, Vertex endVertex);
	
	/**
	 * Adds an edge to the graph
	 * Edge and vertices of edge must don't exist in the graph
	 * @param edge The edge to add
	 */
	public void addEdge(Edge edge);
	
	/**
	 * Adds a vertex if not already exists
	 * @param vertex A vertex 
	 */
	public void addVertex(Vertex vertex);
	
	/**
	 * Returns if the graph contains the specified edge.
	 * @param edge The edge to test
	 * @return True if exists, False else
	 */
	public Boolean containsEdge(Edge edge);
	
	/**
	 * Returns if the graph contains an edge according to a source vertex and an end vertex
	 * @param sourceVertex The source vertex to test the existence of the edge
	 * @param endVertex The end vertex to test the existence of the edge
	 * @return True if exists, False else
	 */
	public Boolean containsEdge(Vertex sourceVertex, Vertex endVertex);
	
	/**
	 * Returns if the graph contains the specified vertex.
	 * @param vertex The vertex to test
	 * @return True if exists, False else
	 */
	public Boolean containsVertex(Vertex vertex);
	
	/**
	 * Get all edges between two vertices
	 * Both vertices must exist in the graph
	 * @param sourceVertex A source vertex
	 * @param endVertex A end vertex
	 * @return An array of edges
	 */
	public Edge[] getEdges(Vertex sourceVertex, Vertex endVertex);
	
	/**
	 * Removes the specified edge and his vertices from the graph
	 * The edge must be already in the graph
	 * @param edge An existing edge in the graph
	 * @return The removed edge
	 */
	public Edge removeEdge(Edge edge);
	
	/**
	 * Removes the specified vertex from the graph
	 * The vertex must be already in the graph
	 * @param vertex An existing vertex in the graph
	 * @return The removed vertex
	 */
	public Vertex removeVertex(Vertex vertex);
	
}
