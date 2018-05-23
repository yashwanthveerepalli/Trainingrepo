package com.java.practice;
import java.util.*;
import java.security.*;
/**
 * The program is for int to string
 * @author yashwanthveerepalli
 *the util,security are the packages
 */
public class IntString {
	/**
	 * the arguments at run time is taken
	 * @param args -input type
	 */
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   /**
    * Integer to string method is used in the following line
    */
   String s = Integer.toString(n);
   if (n == Integer.parseInt(s)) {
	   /**
	    * here if the if condition got satisfied it prints
	    */
	    System.out.println("Good job");
	   } else {
	    System.out.println("Wrong answer.");
	   }
	  } catch (DoNotTerminate.ExitTrappedException e) {
	   System.out.println("Unsuccessful Termination!!");
	  }
	 }
	}

	//The following class will prevent you from terminating the code using exit(0)!
	class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {

	  private static final long serialVersionUID = 1;
	 }

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	}
