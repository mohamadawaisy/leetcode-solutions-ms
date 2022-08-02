/*
 * Click `Run` to execute the snippet below!
 */

//Given a matrix of positive integers, what is the minimum path sum from (0,0) to (n-1, //m-1)?

import java.io.*;
import java.util.*;

import org.apache.commons.lang3.tuple.Pair;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());

    for (String string : strings) {
      System.out.println(string);
    }
  }

int findMinimalPath(int mat[][]) {
  //validation

  //DS 
  int n = mat.length;
  int m = mat[0].length;
  int[][] dist = new int[n][m];
  for(int i=0;i<n;i++) {
      for(int j=0;j<m;j++) {
          dist[i][j] = Integer.MAX_VALUE;
      }
  }
  dist[0][0] = 0;
  Queue<Pair<Integer,Integer>> queue = new  LinkedList<Pair<Integer,Integer>>();

  //BFS
  queue.add(new Pair<Integer,Integer>(0,0));

  while(!queue.isEmpty()) {
        Pair<Integer,Integer> p = queue.poll();
        int i = p.getKey();
        int j = p.getValue();
        getNighbours(...);


    }

  //return res
  return dist[n-1][m-1];
}

boolean inRange(int i, int j, int n,int m) {
  if(i<n&&i>=0&&j<m&&j>=0) return true;
  return false;
}

void getNighbours(Queue<Pair<Integer,Integer>> queue, int i, int j,int n,int m,int[][] dist, int mat[][]){
        int newi = i+1;
        int newj = j;
        if(inRange(newi,newj,n,m)&&dist[newi][newj]>dist[i][j]+mat[newi][newj]) {
            dist[newi][newj] = Math.min(dist[newi][newj],dist[i][j]+mat[newi][newj]);
            queue.add(new Pair<Integer,Integer>(newi,newj));
        }
        
        newi = i-1;
        newj = j;
        if(inRange(newi,newj,n,m)&&dist[newi][newj]>dist[i][j]+mat[newi][newj]) {
            dist[newi][newj] = Math.min(dist[newi][newj],dist[i][j]+mat[newi][newj]);
            queue.add(new Pair<Integer,Integer>(newi,newj));
        }
        newi = i;
        newj = j+1;
        if(inRange(newi,newj,n,m)&&dist[newi][newj]>dist[i][j]+mat[newi][newj]) {
            dist[newi][newj] = Math.min(dist[newi][newj],dist[i][j]+mat[newi][newj]);
            queue.add(new Pair<Integer,Integer>(newi,newj));
        }
        newi = i;
        newj = j-1;
        if(inRange(newi,newj,n,m)&&dist[newi][newj]>dist[i][j]+mat[newi][newj]) {
            dist[newi][newj] = Math.min(dist[newi][newj],dist[i][j]+mat[newi][newj]);
            queue.add(new Pair<Integer,Integer>(newi,newj));
        }
        
}
}



