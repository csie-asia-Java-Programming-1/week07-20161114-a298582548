package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 105021010 邱信喆
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int[]v2 = new int[v1];
		for(int i = 0;i<v1;i++){
		v2[i] = scn.nextInt();
	    }
	    System.out.println( fun1(v2,v1));
	    }

	public static float fun1(int[]v2,int v1){
		float v3 = 0;
		float v4 = 0;
		
	    for(int i = 0;i<v2.length;i++){
		v3+=v2[i];
	}
	    for(int v = 0;v<v2.length;v++){
	    	v4 += Math.pow(v2[v]-v3/v1, 2);
	    }
	    float v5 = v4/v1;
		return v5;	
	}

}


