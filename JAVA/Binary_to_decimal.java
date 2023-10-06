import java.util.*;
import java.lang.Math;
public class Binary_to_decimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int counter=0;
		int binary=0;
		while(n>0){
			int digit=n%10;
			if(digit==0){
				counter++;
				
			}
			else{
				binary=binary+(int)(Math.pow(2, counter));
				counter++;
			}
			n=n/10;
		}
		System.out.println(binary);


	}

}

