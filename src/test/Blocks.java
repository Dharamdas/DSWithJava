package test;

class SuperBlocks
{
	static {
		System.out.println("Super Static Block");
	}
	
	{
		System.out.println("Super Instance Block");
	}
	
	SuperBlocks(){
		System.out.println(" Super Blocks Constructor");
	}

}

public class Blocks {

	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	Blocks(){
		System.out.println("Blocks Constructor");
	}
	
	public static void main(String[] args) {

		/*execution flow will be
		 * 0. all execution from super class then sub class
		 * 1. static
		 * 2. instance Block
		 * 3. Constructor
		 * */
		Blocks b = new Blocks();
		
	}

}
