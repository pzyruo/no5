package com.pzyruo.util;

import java.util.Random;

public class RandomUtil {
	private static Random random = new Random();
	public static int getRandomCode(){
		return 100000+ random.nextInt(900000);
	}
}
