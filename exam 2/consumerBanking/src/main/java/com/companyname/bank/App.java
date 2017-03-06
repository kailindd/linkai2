package com.companyname.bank;

import java.util.Scanner;

import test.app;

/**
 * Hello world!
 *
 */
public class app {
	public static int getcount(int salary){
		int shuifei = 0;
		if (salary<1500) {
			System.out.println("税费为："+0);
		}
			else if (salary>1500&&salary<4500) {
				shuifei=(int) (1500*0.03+(salary-1500)*0.1);
				System.out.println("税费为："+(int) (1500*0.03+(salary-1500)*0.1));
			}
		if (salary>4500&&salary<9000) {
			System.out.println("税费为："+(int)(1500*0.03+(300)+(salary-4500)*0.2));
			
		}
		else if(salary>9000&&salary<35000){
			System.out.println("税费为："+(int)(1500*0.03+(300)+(900)+(salary-9000)*0.25));
		}
		if (salary>35000&&salary<55000) {
			System.out.println("税费为："+(int)(1500*0.03+(300)+(900)+(26000*0.25)+(salary-35000)*0.3));
			
		}
		else if (salary>55000&&salary<80000) {
			
			System.out.println("税费为："+(int)(1500*0.03+(300)+(900)+(26000*0.25)+(6000)+(salary-55000)*0.35));
		}
			
		
		
		
			
			
		
		return shuifei;
		
	}
	public static void main(String[] args) {
		 Scanner scanner =new Scanner(System.in);
	     System.out.println("请输入工资:");
	     int salary=scanner.nextInt();
	     app.getcount(salary);
		
	}

}