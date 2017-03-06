package com.companyname.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import test.app;

/**
 * Hello world!
 *
 */
public class app {
	public static void main( String[] args )
    {
		 float sum=0;
    	 List list=new ArrayList();
    	 for (int i = 0; i < 50; i++) {
    		 int r = (int) (Math.random()*100);
    	  list.add(r);
    	  for (int j = 0; j <50; j++) {
    		  System.out.println("随机生成 50 个小于 100 的数,分别为："+list.indexOf(j));
		Map map=new HashMap();
	    for (int k = 0; k < 50; k++) {
	    	double m=list.indexOf(k)/10;
	    	int n=(int) (m);
	
			
		}
}