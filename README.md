# Graph Implementation in Java using HashMap and Adjacency List

This repository contains a simple implementation of a graph data structure in Java using a HashMap to represent the vertices and an adjacency list to store the edges. The implementation provides methods for adding vertices, adding edges, removing edges, and removing vertices from the graph.

## Table of Contents

- [Getting Started](#getting-started)
- [Graph Structure](#graph-structure)
- [Methods](#methods)
- [Usage](#usage)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To use this graph implementation in your Java project, you can clone this repository or download the source code and include it in your project. Make sure you have Java installed on your system.

## Graph Structure

This graph implementation is based on an adjacency list representation. It consists of two main data structures:

1. **Vertices**: Vertices are stored as keys in a HashMap. Each vertex is associated with an ArrayList that stores its adjacent vertices.

2. **Edges**: Edges between vertices are represented by adding vertices to each other's adjacency lists.

## Methods

The following methods are available for interacting with the graph:

1. `addVertex(V vertex)`: Adds a new vertex to the graph.

2. `addEdge(V source, V destination)`: Adds an edge between two vertices.

3. `removeEdge(V source, V destination)`: Removes the edge between two vertices.

4. `removeVertex(V vertex)`: Removes a vertex and all its associated edges from the graph.

5. `getAdjacencyList(V vertex)`: Returns the adjacency list for a given vertex.

6. `getVertices()`: Returns a Set containing all the vertices in the graph.

7. `isEmpty()`: Checks if the graph is empty.

8. `size()`: Returns the number of vertices in the graph.

## Usage

1. Create a new instance of the `Graph` class by specifying the data type for the vertices, e.g., `Graph<Integer> graph = new Graph<>();`.

2. Use the provided methods to add vertices, add edges, remove edges, or remove vertices as needed.

3. You can also query the graph using methods like `getAdjacencyList` to retrieve adjacency information.

## Example

```java
public class GraphExample {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();
        
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(1, 2);
        
        System.out.println("Vertices: " + graph.getVertices());
        System.out.println("Adjacency List for 1: " + graph.getAdjacencyList(1));
        
        graph.removeEdge(1, 2);
        graph.removeVertex(1);
        
        System.out.println("Vertices after removal: " + graph.getVertices());
    }
}
```

## Contributing

If you want to contribute to this project, feel free to fork the repository, make your changes, and submit a pull request. Please follow the standard Java coding conventions and make sure your code is well-documented.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
