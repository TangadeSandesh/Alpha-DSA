package Graphs;

import java.util.*;

public class AdjecencyList {
    static class edge
    {
        int s;
        int d;
        int w;

        public edge(int s, int d, int w)
        {
            this.s=s;
            this.d=d;
            this.w=w;
        }

    }   

    public static void main(String args[])
    {
        int v=5;
        
        ArrayList<edge>[] graph=new ArrayList[v];

        for(int i=0; i<v; i++)
        {
            graph[i] = new ArrayList<>();
        }
        //v=0
        graph[0].add(new edge(0,1,5));

        //v=1
        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,3));

        //v=2
        graph[2].add(new edge(2,3,1));
        graph[2].add(new edge(2,1,5));
        graph[2].add(new edge(2,4,2));

        //v=3
        graph[3].add(new edge(3,2,1));
        graph[3].add(new edge(3,1,3));

        //v=4
        graph[4].add(new edge(4,2,2));

        //2's neighbours
        for(int i=0; i<graph[2].size(); i++)
        {
            edge e= graph[2].get(i);
            System.out.println(e.d);
        }
        
    }
}
