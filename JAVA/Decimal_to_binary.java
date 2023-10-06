import java.util.*;

public class dec_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int quotient=s.nextInt();
		long num=0;
		int i=1;
		int remainder=0;
		while(quotient>0){
			remainder=(int)quotient%2;
			num=num+remainder*i;
			i=i*10;
			quotient=quotient/2;
		}
		System.out.println(num);

	}

}