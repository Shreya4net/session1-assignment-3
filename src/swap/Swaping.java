package swap;

public class Swaping {
	public static void main(String[] args){
int a=10;
int b=20;
System.out.println("Before Swaping a="+a);
System.out.println("Before Swaping b="+b);
swap( a, b);
	
	}	
	
public static void swap(int a, int b){
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swaping a="+a);
System.out.println("After Swaping b="+b);
}
}