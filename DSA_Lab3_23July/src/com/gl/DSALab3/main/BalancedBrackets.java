package com.gl.DSALab3.main;

import java.util.Scanner;

import com.gl.DSALab3.Service.*;

public class BalancedBrackets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the expression");
		String bracketExpression = sc.next();
		boolean result;
		result = BracketBalance.isBracketBalance(bracketExpression);
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

		sc.close();
	}

}
