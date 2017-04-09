package mypack;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class VariableStack implements Stack{
	
	int stack_size;
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	public VariableStack(int size) {
		// TODO Auto-generated constructor stub
		
		this.stack_size = size;
	}

	@Override
	public void push(int l) {
		// TODO Auto-generated method stub
		al.add(l);
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		System.out.println("Stack contains: " + this.al.toString());
		return 0;
	}
	
	public static void main(String[] args)
	{
		int s_size,num,l;
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the stack :");
		s_size = sc.nextInt();
		
		VariableStack vs = new VariableStack(s_size);
		
		System.out.println("Enter the number of integers to be pushed in stack");
		num = s.nextInt();
		for(int i=0;i<num;i++ )
		{
			System.out.println("Enter the integer to be pushed in stack");
			l=sc.nextInt();
			vs.push(l);
		}
		
		vs.pop();
	}
}
