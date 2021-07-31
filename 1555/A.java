import java.io.*;
import java.util.*;

public class Main
{
    static void getRes(long n){
    	long res = 0;
    	if (n<=6){
    		res = 15;
    	}
    	else {
    		if (n%2==1){
    			n++;
    		}
    		n/=2;
    		res = n*5;
    	}
    	System.out.println(res);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
        	long n = s.nextLong();
        	getRes(n);
        }
    }
}