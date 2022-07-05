import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



    class Graph {
        int size;
        private LinkedList<Integer> adj[];
        public Graph(int size) {
            this.size=size;
            adj= new LinkedList[size];
            for(int i=0;i<size;i++) {
                adj[i] = new LinkedList();
            }
        }

        public void addEdge(int x,int y) {
            adj[x].add(y);
        }

        public int BFS(int v) {
            int count=0;
            boolean visited[] = new boolean[size];
            Queue<Integer> q = new LinkedList();
            for(int i=0;i<size;i++) {
                if(visited[i]==false) {
                    count++;
                    visited[i]=true;
                    q.add(i);
                    while(!q.isEmpty()) {
                        int a = q.poll();
                        for(int elem : adj[a]) {
                            if(!visited[elem]) {
                                q.add(elem);
                                visited[elem]=true;
                            }

                        }
                    }
                }
            }
            return count;

        }
    }
    class Result {

        /*
         * Complete the 'countGroups' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING_ARRAY related as parameter.
         */

        public static int countGroups(List<String> related) {
            // Write your code here
            Graph g = new Graph(related.size());
            for(int j=0;j<related.size();j++) {
                for(int i=0;i<related.get(j).length();i++) {
                    if(related.get(j).charAt(i)=='1') {
                        g.addEdge(j, i);
                    }

                }
            }
            return g.BFS(1);
        }

    }
