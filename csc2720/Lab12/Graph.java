// Hakan Can Gunerli Lab12 DataStr 
//Sorry for the formatting, it makes it easier for me to read the code  in VSCODE this way. 

import java.util.*;
public class Graph {
   public static void main(String[] args) 
   {
      // Create a graph of 5 vertices
      Graph g2 = new Graph(5);
      g2.addEdge(0, 1);
      g2.addEdge(0, 4);
      g2.addEdge(0, 3);
      g2.addEdge(2, 0);
      g2.addEdge(3, 2);
      g2.addEdge(4, 3);
      g2.addEdge(4, 1);
      g2.printGraph();
      Integer[][] adjMatrix = generateAdjMatrix(g2);
      printMatrix(adjMatrix);

   }

   public static Integer[][] generateAdjMatrix(Graph g) 
   {
      // my code, moved it here it could be checked easier.
      Integer[][] adjacencyMatrix = new Integer[g.numVertices][g.numVertices];
      int rows, columns; // will be used to iterate through the matrices and produce adj matrix
      for (rows = 0; rows < adjacencyMatrix.length;) 
      {
         for (columns = 0; columns < adjacencyMatrix[rows].length;) 
         {
            adjacencyMatrix[rows][columns] = 0;
            columns++; // iterate until columns are met from the matrix, and iterate o^2. 
         }
         rows++; // iterate
      }
      for (rows = 0; rows < g.numVertices;) 
      {
         for (columns = 0; columns < g.adjacencyList[rows].size();) 
         {
            adjacencyMatrix[rows][g.adjacencyList[rows].get(columns)] = 1; // add the values to the matrix, the ones. 
            ++columns;
         }
         ++rows;
      }
      return adjacencyMatrix;
   }

   public static void printMatrix(Integer[][] adjMatrix) {
      // my code, moved it here it could be checked easier.
      int i, j;
      for (i = 0; i < adjMatrix.length;) {

         for (j = 0; j < adjMatrix[i].length;) // size of the rows iteration, print the matrices
         {
            System.out.print(adjMatrix[i][j]);
            j++;
         }
         System.out.println();
         i++; // iterate
      }
   }

   int numVertices;
   LinkedList<Integer>[] adjacencyList;

   Graph(int n) {
      numVertices = n;
      adjacencyList = new LinkedList[numVertices];
      for (int i = 0; i < numVertices; i++) {
         adjacencyList[i] = new LinkedList<Integer>();
      }
   }

   void addEdge(Integer src, Integer des) {
      this.adjacencyList[src].add(des);
   }

   void printGraph() 
   {
      for (int i = 0; i < this.numVertices; i++) 
      {
         System.out.println("Adjacency list of vertex : " + i);
         System.out.print("" + i + " : ");
         int j = 0;
         for (; j < this.adjacencyList[i].size() - 1; j++) 
         {
            System.out.print(this.adjacencyList[i].get(j));
            System.out.print(" --> ");
         }
         if (j == adjacencyList[i].size() - 1) 
         {
            System.out.println(this.adjacencyList[i].get(j));
         } 
         else 
         {
            System.out.println();
         }
      }
   }

}