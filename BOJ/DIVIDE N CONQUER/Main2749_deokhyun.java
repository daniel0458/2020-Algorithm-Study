package Divide;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class Main2749 {
//	
//	public static void main(String[] args) throws IOException {
//
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		int div = 1000000;
//		long[] arr = new long[n+1];
//		
//		arr[0]=0;
//		arr[1]=1;
//		
//		for(int i=2 ;i<arr.length;i++) {
//			arr[i]=arr[i-1]+arr[i-2];
//			arr[i]=arr[i]%div;
//		}
//		
//		System.out.println(arr[n]);
//		
//		
//	}
//	
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main2749 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        int pisano = 1500000; // �ǻ�� �ֱ�
        long[] arr = new long[pisano];
        arr[0] = 0; arr[1] = 1;
 
        for(int i=2 ; i<pisano && i<=n ; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000;  // �Ǻ���ġ ���� 1,000,000 ���� ���� ������ ���� ���� 
        }
 
        if(n >=pisano){
            n %= pisano;
        }
 
        System.out.println(arr[(int) n]);
    }
}
