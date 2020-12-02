package com.myc.dateexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Sample {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		//dd-date
		//MM-month in number
		//MMM-jan,feb,mar,
		//MMMM-jan
		//YY-20,98,97
		//YYYY-2020
		//W--Week 
		//D-->day
		//HH-->hours
		//mm-->min
		//ss-->sec
		String s = sdf.format(date);
		System.out.println(s);
		String inputDate = "10-Feb-2020";//String (date is there in string format)
		Date d=sdf.parse(inputDate);
		System.out.println(d);
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.YEAR, 100);
		Date d1=c.getTime();
		System.out.println("after adding 100days to 01-Feb-2020 "+d1);
		
		String s1="abcde";
		//length
		//charAt(int p)
		char c1=s1.charAt(2);
		//substring(int st,int end)
		//indexOf(char ch)
		
	}

}
