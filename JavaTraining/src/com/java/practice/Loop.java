package com.java.practice;
/**
 * this is for loop Tables printing
 * @author yashwanthveerepalli
 * scanner is importing file
 */
	public class Loop {

		/**
		 * the input file undergoes computations and displays the output table
		 */
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	 System.out.println("Please enter the table number : ");
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	       
	        scanner.close();
	        for(int i=1;i<=10;i++)
	        {
	            int s=N*i;
	          
	            System.out.println(N +" x " +i+ " = "+s);
	        }
	        
	    }
	}


