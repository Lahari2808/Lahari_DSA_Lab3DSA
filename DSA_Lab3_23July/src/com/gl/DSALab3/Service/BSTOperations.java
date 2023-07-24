package com.gl.DSALab3.Service;

import java.util.HashSet;
import java.util.Set;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BSTOperations {

	public Node root;

	public void insert(int key) {
		root = insertNode(root, key);
	}

	private Node insertNode(Node node, int key) {
		if (node == null) {
			node = new Node(key);
			return node;
		}

		if (key < node.data)
			node.left = insertNode(node.left, key);
		else if (key > node.data)
			node.right = insertNode(node.right, key);

		return node;
	}

	public void inOrderTraverse(Node root) {
		if (root == null)
			return;

		inOrderTraverse(root.left);
		System.out.print(root.data + " ");
		inOrderTraverse(root.right);
	}

	public void findPairWithGivenSum(int targetSum) {
		Set<Integer> set = new HashSet<>();
		if (!findPairUtility(root, targetSum, set))
			System.out.println("Print nodes are not found");
	}

	private boolean findPairUtility(Node root, int targetSum, Set<Integer> set) {
		if (root == null)
			return false;
		if (findPairUtility(root.left, targetSum, set))
			return true;
		int diff = targetSum - root.data;
		if (set.contains(diff)) {
			System.err.println("Pair is found (" + diff + "," + root.data + ")");
			return true;
		} else
			set.add(root.data);
		return findPairUtility(root.right, targetSum, set);
	}
}
