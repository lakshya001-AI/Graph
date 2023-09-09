package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

  // We will be creating a graph using the hashmap
  private HashMap<String,  ArrayList<String>> adjlist = new HashMap<>();

  //So, in the graph we are mainly having four operations addvertex, addEdges, removeVertex, removeEdges

  //Printlist method

    public void printGraph(){
        System.out.println(adjlist);
    }

    //AddVertex method

  public boolean addVertex(String value){
      if(adjlist.get(value) == null){
          adjlist.put(value, new ArrayList<>());
          return true;
      }
      return false;
  }

    //AddEdges method

    public boolean addEdges(String vertex1, String vertex2){
        if(adjlist.get(vertex1) != null && adjlist.get(vertex2) != null){
            adjlist.get(vertex1).add(vertex2);
            adjlist.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    //RemoveEdges method

    public boolean removeEdges(String vertex1, String vertex2){
        if(adjlist.get(vertex1) != null && adjlist.get(vertex2) != null){
            adjlist.get(vertex1).remove(vertex2);
            adjlist.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    //RemoveVertex method

    public boolean removeVertex(String vertex){
        if(adjlist.get(vertex) != null){
            adjlist.remove(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }





}
