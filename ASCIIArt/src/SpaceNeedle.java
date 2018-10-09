
public class SpaceNeedle {
	
	private static int SIZE=4; //SIZE can be 2,3,4.. (put in a SIZE!!)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       drawpole();  //draws proportional number of vertical lines 
       drawTop1();  //draws proportional colons inside the space needle
       drawLine();  //draws quotation marks inside the space needle
       drawTop2();  //draws proportional  /\ (triangles) 
       drawpole();  //same as previously stated 
       drawpole2(); //draw vertical line with proportional number of %
       drawTop1(); //same as previously stated
       drawLine(); //same as previously stated    
	}

	public static void drawpole() {
		for (int i=1; i<=SIZE; i++) {
	    	for (int j=1; j<=3*SIZE; j++)
	    		System.out.print (" ");
	    	System.out.println ("||");
	    }	
	}
	
	public static void drawTop1() {
		for(int i=1; i<=SIZE; i++) {
			for (int j=1; j<=3*SIZE-3*i; j++) {
			System.out.print (" ");}
		
			
			System.out.print ("__/");	
			
			
			for (int j=1; j<= (i-1)*3 ; j++) {
				System.out.print(":");}
			
			System.out.print ("||");
			
			for (int j=1; j<= (i-1)*3 ; j++) {
				System.out.print(":");}
			
			System.out.print ("\\__");
			
		    System.out.println();		
		    
		}	
		
	}
	
	public static void drawLine() {
		System.out.print ("|");
		for (int i=1; i<=6*SIZE; i++) {
			System.out.print ("\"");
		}
		System.out.print ("|");
		System.out.println();
	}
	
	public static void drawTop2 () {
		for(int i=1; i<=SIZE; i++) {
			for (int j=1; j<=2*(i-1); j++) {
				System.out.print (" ");}
			System.out.print ("\\_");
			
			for (int j=1; j<=SIZE*3+1-2*i;j++) {
			System.out.print ("/\\");}
			
			
			System.out.print ("_/");
			System.out.print (" ");
			System.out.println ();	
						
		}
	}
	
	public static void drawpole2() {
			 for (int i=1;i<=SIZE*SIZE;i++) {
		    	   for (int j=1; j<=2*SIZE+1; j++) {
		    	   System.out.print (" ");
		    	   }
		    	 
		    	   System.out.print ("|");
		    	  for (int j=1; j<= SIZE-2; j++) {
		    	   System.out.print ("%");}
		    	  
		    	   System.out.print ("||");
		    	   for (int j=1; j<= SIZE-2; j++) {
		    	   System.out.print ("%");}
		    	   
		    	   System.out.print("|");
		    	   System.out.println ();
		    	   
		       }
	}
		
	
	
	
}
