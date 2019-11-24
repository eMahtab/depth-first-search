package net.mahtabalam;

import java.util.ArrayList;
import java.util.List;

public class Node {
	String name;
	ArrayList<Node> children = new ArrayList<Node>();

	public Node(String name) {
		this.name = name;
	}

	public Node addChild(String name) {
		Node child = new Node(name);
		children.add(child);
		return this;
	}

	public List<String> depthFirstSearch(List<String> array) {
		array.add(this.name);
		for (Node node : this.children) {
			node.depthFirstSearch(array);
		}
		return array;
	}
}
