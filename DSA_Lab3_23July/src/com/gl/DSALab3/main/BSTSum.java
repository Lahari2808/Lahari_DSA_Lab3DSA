package com.gl.DSALab3.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.gl.DSALab3.Service.*;

public class BSTSum {

	public static void main(String[] args) {
		BSTOperations bst = new BSTOperations();
		BSTSum input = new BSTSum();
		input.populateTree(bst);
		input.performOperations(bst);
	}

	private void populateTree(BSTOperations bst) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements to insert in the BST: ");
		int n = sc.nextInt();
		System.out.print("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();
			bst.insert(data);
		}
		// Consume the newline character from the buffer
		sc.nextLine();
		// Do not close the scanner here
	}

	private void performOperations(BSTOperations bst) {
		Scanner sc = new Scanner(System.in);
		System.out.print("In-order traversal of the BST: ");
		bst.inOrderTraverse(bst.root);

		System.out.print("\nEnter the target sum to find a pair: ");
		int targetSum = 0;
		try {
			targetSum = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Invalid input. Please enter a valid integer.");
			sc.close();
			return;
		}
		bst.findPairWithGivenSum(targetSum);

		sc.close(); // Close the scanner after reading the target sum
	}

}
