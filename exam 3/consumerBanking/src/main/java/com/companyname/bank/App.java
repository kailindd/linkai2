package com.companyname.bank;

import java.util.Scanner;

import test.app;

/**
 * Hello world!
 *
 */
public class app {
	public static void main( String[] args )
    {
    	
    	Integer year;
    	Integer mouth;
    	Integer day;
    	String y;
    	String m;
    	String d;
    	System.out.println("请输入一个日期：(格式为YYYY-MM-DD) 要用0 占位 ");
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        y= s.substring(0, 4);
        m= s.substring(5, 7);
        d= s.substring(8,10);
        year  =Integer.getInteger(y);
        mouth =Integer.getInteger(m);
        day   =Integer.getInteger(d);
        
        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
        
        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
        //2月
        if(mouth==2||day<28){
        	day=day+1;
        	System.out.println("下一天是："+year+"-"+mouth+"-"+day);
        }else if(mouth==2||day==28){
        	mouth=3;
        	day =1;
        	System.out.println("下一天是："+year+"-"+mouth+"-"+day);
        }
        // 4 6 9 11 月
        else if(mouth==4 && mouth==6 && mouth ==9 && mouth==11 ){
        	if(day< 30){
        		day=day+1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}else if(day==30){
        		mouth=mouth+1;
        		day=1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}
        }
        //1 3 5 7 8 10 
        else if(mouth==1 && mouth==3 && mouth==5 && mouth==7 && mouth==8 && mouth == 10 ){
        	if(day< 31){
        		day=day+1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}else if(day==31){
        		mouth=mouth+1;
        		day=1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}
    	}
        //12
        else if(mouth==12 ){
        	if(day< 31){
        		day=day+1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}else if(day==31){
        		year=year+1;
        		mouth=1;
        		day=1;
        		System.out.println("下一天是："+year+"-"+mouth+"-"+day);	
        	}
    	}
        //其他
        else{
        	System.out.println("您输入的日期不存在！~");
        }
        
        
        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
    }

}