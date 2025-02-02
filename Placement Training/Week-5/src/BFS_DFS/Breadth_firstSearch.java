package BFS_DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Breadth_firstSearch {

	ArrayList<Integer> adj[];
	int V;
	int E;
	Breadth_firstSearch(int v, int e)
	{
		V = v;
		E = e;
		adj = new ArrayList[V];
		for(int i = 0; i < V; i++)
			adj[i] =  new ArrayList<>();
	}
	
	void add(int src, int dest)
	{
		adj[src].add(dest);
		adj[dest].add(src);
	}
	
	void bfs(int src, boolean vis[])
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		vis[src] = true;
		while(!q.isEmpty())
		{
			int curr = q.poll();
			System.out.print(curr + " ");
			for(int i = 0; i < adj[curr].size(); i++) {
				if(vis[adj[curr].get(i)] == false)
				{
					q.add(adj[curr].get(i));
					vis[adj[curr].get(i)] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Breadth_firstSearch graph = new Breadth_firstSearch(4, 6);
		for(int i = 0; i < 6; i++)
		{
			int src = s.nextInt();
			int dest = s.nextInt();
			graph.add(src, dest);
		}
		s.close();
		boolean visited[] = new boolean[graph.V];
		Arrays.fill(visited, false);
		
		graph.bfs(0,visited);
		

	}

}


