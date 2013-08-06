package com.hisrv.cracking.chapter4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Problem2 {
	
	public boolean hasRoute(Graph graph, GraphNode start, GraphNode end) {
		HashSet<GraphNode> visited = new HashSet<GraphNode> ();
		LinkedList<GraphNode> toBeVisited = new LinkedList<GraphNode> ();
		toBeVisited.add(start);
		while (!toBeVisited.isEmpty()) {
			GraphNode node = toBeVisited.remove();
			visited.add(node);
			List<GraphNode> list = graph.getSucccessors(node);
			for (GraphNode neighbour : list) {
				if (neighbour.equals(end)) {
					return true;
				}
				if (visited.contains(neighbour)) {
					//do nothing
				} else {
					toBeVisited.add(neighbour);
				}
			}
		}
		return false;
	}
}
