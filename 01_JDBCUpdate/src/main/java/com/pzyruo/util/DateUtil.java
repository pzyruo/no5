package com.pzyruo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	public static String dateToStr(Date date){
		return sdf.format(date);
	}
	public static Date strToDate(String str) throws ParseException{
			return sdf.parse(str);
	}
}
