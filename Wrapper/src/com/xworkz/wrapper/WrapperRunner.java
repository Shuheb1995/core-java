package com.xworkz.wrapper;


//Write 4 variables in each of the Wrapper class -> in that 2 manually wrapping ,  2 is giving to compiler  , 
//1 variable with manually getting data , and 1 variable automatically

public class WrapperRunner {
	
	public static void main(String[] args) {
		
		//manually wrapping
		Byte by = Byte.valueOf((byte)10);
		Byte by1 = Byte.valueOf((byte)20);
		System.out.println(by);
		System.out.println(by1);
		
		//giving to compiler 
		Byte by2 = 10;
		Byte by3 = 20;
		System.out.println(by2);
		System.out.println(by3);
		
		System.out.println("------------");
		
		//manually getting Data
		byte a = by.byteValue();
		System.out.println(a);
		//automatically getting data
		byte a1 = by1;
		System.out.println(a1);
		
      System.out.println("-------------------------------------------------------");
      
		//manually wrapping
		Short srt = Short.valueOf((short)101);
		Short srt1 = Short.valueOf((short)202);
		System.out.println(srt);
		System.out.println(srt1);
		
		//giving to compiler 
		Short srt2 = 103;
		Short srt3 = 204;
		System.out.println(srt2);
		System.out.println(srt3);
		
		System.out.println("------------");
		
		//manually getting Data
				short aa = srt.shortValue();
				System.out.println(aa);
				//automatically getting data
				short aa1 = srt1;
				System.out.println(aa1);
		
		System.out.println("------------------------------------------------------");
		
		//manually wrapping
		Integer it = Integer.valueOf(1010);
		Integer it1 = Integer.valueOf(2022);
		System.out.println(it);
		System.out.println(it1);
		
		//giving to compiler 
		Integer it2 = 1002;
		Integer it3 = 2023;
		System.out.println(it2);
		System.out.println(it3);
		
		System.out.println("------------");
		
		//manually getting Data
		int aaa = it.intValue();
		System.out.println(aaa);
		//automatically getting data
		int aaa1 = it1;
		System.out.println(aaa1);
		System.out.println("------------------------------------------------------");
		

		//manually wrapping
		Long i = Long.valueOf(10544020L);
		Long i1 = Long.valueOf(2003565L);
		System.out.println(i);
		System.out.println(i1);
		
		//giving to compiler 
		Long i2 = 100510202L;
		Long i3 = 2016115151L;
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println("------------");
		
		//manually getting Data
				long bb = i.longValue();
				System.out.println(bb);
				//automatically getting data
				long bb1 = i1;
				System.out.println(bb1);

		System.out.println("------------------------------------------------------");
		
		        //manually wrapping
				Character ch = Character.valueOf('A');
				Character ch1 = Character.valueOf('B');
				System.out.println(ch);
				System.out.println(ch1);
				
				//giving to compiler 
				Character ch2 = 'C';
				Character ch3 = 'D';
				System.out.println(ch2);
				System.out.println(ch3);
				
				System.out.println("------------");
				
				//manually getting Data
						char br = ch.charValue();
						System.out.println(br);
						//automatically getting data
						char br1 = ch3;
						System.out.println(br1);
						
				System.out.println("------------------------------------------------------");
				
				//manually wrapping
				Float h = Float.valueOf(0.1f);
				Float h1 = Float.valueOf(0.2f);
				System.out.println(h);
				System.out.println(h1);
				
				//giving to compiler 
				Float h2 = 0.3f;
				Float h3 = 0.4f;
				System.out.println(h2);
				System.out.println(h3);
				
				System.out.println("------------");
				
				//manually getting Data
						float f = h1.floatValue();
						System.out.println(f);
						//automatically getting data
						float f1 = h3;
						System.out.println(f1);
						
				System.out.println("------------------------------------------------------");
				
				//manually wrapping
				Double d = Double.valueOf(0.01);
				Double d1 = Double.valueOf(0.02);
				System.out.println(d);
				System.out.println(d1);
				
				//giving to compiler 
				Double d2 = 0.03;
				Double d3 = 0.04;
				System.out.println(d2);
				System.out.println(d3);
				
				System.out.println("------------");
				
				//manually getting Data
						double o = d.doubleValue();
						System.out.println(o);
						//automatically getting data
						double o1 = d2;
						System.out.println(o1);
						
				System.out.println("------------------------------------------------------");
				
				//manually wrapping
				Boolean b = Boolean.valueOf(true);
				Boolean b1 = Boolean.valueOf(false);
				System.out.println(b);
				System.out.println(b1);
				
				//giving to compiler 
				Boolean b2 = false;
				Boolean b3 = true;
				System.out.println(b2);
				System.out.println(b3);
				
				System.out.println("------------");
				
				//manually getting Data
						boolean bln = b1.booleanValue();
						System.out.println(bln);
						//automatically getting data
						boolean bln1 = b3;
						System.out.println(bln1);
		
		
		
		
	}

}


