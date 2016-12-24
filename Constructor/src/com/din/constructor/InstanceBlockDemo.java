package com.din.constructor;

public class InstanceBlockDemo {

	private static int count;
	{
		count++;
	}

	public InstanceBlockDemo() {
		System.out.println("no-args Constructor");
		
	}

	public InstanceBlockDemo(int i) {
		System.out.println("int arg constructor "+i);
		//count++;
	}

	public InstanceBlockDemo(String s) {
		System.out.println("String arg Constructor "+ s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceBlockDemo iBD = new InstanceBlockDemo();
		InstanceBlockDemo iBD1 = new InstanceBlockDemo(10);
		InstanceBlockDemo iBD4 = new InstanceBlockDemo(20);
		InstanceBlockDemo iBD2 = new InstanceBlockDemo("dinesh");
		InstanceBlockDemo iBD3 = new InstanceBlockDemo("Nani");
		System.out.println("Number of objects created :" + count);
	}

}
