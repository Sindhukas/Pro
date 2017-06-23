package Pro;

import java.util.Scanner;

public class Pangram {
	public static final int n=26;
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		String s=s1.next();
		Pangram obj=new Pangram();
		int d=obj.check(s);
		if(d==-1)
			System.out.println("It is not a pangram");
		else
			System.out.println("It is a pangram");
	}
	public int check(String arr){
		if(arr.length()<n){
			return -1;
		}
		for(char c='A';c<='Z';c++){
			if((arr.indexOf(c)<0)&&(arr.indexOf((char)(c+32))<0)){
				return -1;
			}
		}
		return 1;
	}
	
}
