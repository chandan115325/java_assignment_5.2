package mypack;

import java.util.*;
public class FixedStack implements Stack {
	
	int stack_size;
	int[] arr;
	int count;
	public FixedStack(int size)
	{
		this.stack_size=size;
		arr= new int[this.stack_size];
		
		//System.out.println("array length "+arr.length);
		//System.out.println("stack size is " +this.stack_size);
		
	}
	
	@Override
	public void push(int l) {
		// TODO Auto-generated method stub
		//int i=0;
		if(this.count<this.stack_size)
		{
			//for(;i<this.arr.length;i++)
			//{
				this.arr[this.count] = l;
			//}
		}
		
		else {
			System.out.println("Stack overflow");
		}
		this.count++;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		//System.out.println("working"+this.arr[0]);
		for(int j=this.stack_size-1;j>=0;j--)
		{
			System.out.println("Integers in stack are popped out :" +this.arr[j]);
		}
		return 0;
	}
	
	public static void main(String[] args)
	{	
		int stack_integers_no,s_size, l;
		
		System.out.println("Enter the no of integers in stack to be pushed : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		stack_integers_no = sc.nextInt();
		
		System.out.println("Enter the stack size : ");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		s_size = s.nextInt();
		
		FixedStack fs = new FixedStack(s_size);
		for(int p=0;p<stack_integers_no;p++)
		{
			System.out.println("Enter the integers to be pushed: ");
			l = sc.nextInt(); 
		    fs.push(l);
		 
		}
		fs.pop();
		
	}

}
