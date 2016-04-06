package graph;


/**
 * Describe a vertex containing an object
 * @author Gauchoux, Robilliard
 */
public class Vertex {
	
	/**
	 * A general contents
	 */
	private Object contents;

	/**
	 * Make a vertex with an contents
	 * @param contents The contents to save in the vertex
	 */
	public Vertex(Object contents) {
		this.contents = contents;
	}
	
	/**
	 * @return The contents of the vertex
	 */
	public Object getContents() {
		return contents;
	}
	
	public String toString() {
		return "" + contents;
	}

}
