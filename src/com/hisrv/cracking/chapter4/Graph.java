package com.hisrv.cracking.chapter4;

import java.util.List;

public class Graph {
	
	private List<List<GraphNode>> mGraph;
	
	public List<GraphNode> getSucccessors(GraphNode node) {
		return mGraph.get(node.index);
	}
	
}
