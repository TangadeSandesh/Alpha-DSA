package Graphs;
import java.util.*;

public class BFSfun {
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

    public static void creategraph(ArrayList<edge> graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));

        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));

        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(4,5,1));
        graph[5].add(new edge(5,6,1));

        graph[6].add(new edge(6,5,1));

    }
    public static void bfs(ArrayList<edge>[] graph)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);   //src=0

        while(!q.isEmpty())
        {
            int curr=q.remove();

            if(!vis[curr])
            {
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0; i<graph[curr].size(); i++)
                {
                    edge e=graph[curr].get(i);
                    q.add(e.d);
                }
            }
        }
    }

    public static void dfs(ArrayList<edge>[] graph, int curr, boolean vis[])
    {
        //visit
        System.out.print(curr +" ");
        vis[curr]=true;

        for(int i=0; i<graph[curr].size();i++)
        {
            edge e= graph[curr].get(i);
            if(!vis[e.d])
            {
                dfs(graph, e.d, vis);
            }
            
        }
    }
    public static void main(String args[])
    {
        int v=7;
        ArrayList<edge>[] graph=new ArrayList[v];
        creategraph(graph);
        //bfs(graph);
        dfs(graph, 0, new boolean[v]);
    }
}
