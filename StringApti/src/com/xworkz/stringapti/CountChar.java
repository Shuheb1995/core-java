package com.xworkz.stringapti;

public class CountChar {

	public static void main(String[] args) {
       String name="Xworkz ODC BTM";
       char[] ch = name.toCharArray();
       int count = 0;
       for(int i=0;i<=ch.length-1;i++) {
    	   if(ch[i]!=' ') {
    		   System.out.print(ch[i]);
    		   count++;
    	   }else {
    		   
    	   }
       }
       System.out.println();
       System.out.println("Total  numberof char = " +count);
	}

}
 //  'x' 'w' 'o' 'r' 'k' 'z'