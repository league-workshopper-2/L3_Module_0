package IntroToStacks;

import java.awt.geom.Arc2D.Double;
import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random rand=new Random();
		Double dubs;
		for (int i = 0; i < 100; i++) {
		dubs=rand.nextDouble();	
		System.out.println(dubs);
		doubles.push(dubs);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String nums =JOptionPane.showInputDialog("Type a number between 0 and 100");
		int numbers=Integer.parseInt(nums);
		String nums2 = JOptionPane.showInputDialog("Type another number between 0 and 100");
		int numbers2=Integer.parseInt(nums2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
