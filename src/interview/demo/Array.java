package interview.demo;

public class Array {
 public static void main(String[] args) {
	short a[]=new short[10];
	a[0]=1;
	a[1]=2;
	for(int i=0;i<5;i++)
	System.out.println("arrays:"+a[i]);
	a[3]=new Integer(5);
	
	for(int i=0;i<5;i++)
	System.out.println("arrays:"+a[i]);
}

/*
 * @Override public String toString() { return "Array []"; }
 */
}
