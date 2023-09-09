package org.example;

public class Main {
    public static void main(String[] args) {
        Graph graph= new Graph();
        graph.addVertex("A");
        graph.addVertex("B");

        System.out.println();
        System.out.println("Add Vertex to the adjlist");
        graph.printGraph();

        graph.addEdges("A", "B");

        System.out.println();
        System.out.println("Add edges between the vertex");
        graph.printGraph();

        graph.removeEdges("A", "B");

        System.out.println();
        System.out.println("Remove edges between the vertex");
        graph.printGraph();

        graph.removeVertex("B");

        System.out.println();
        System.out.println("Remove Vertex from the adjlist");
        graph.printGraph();





    }
}