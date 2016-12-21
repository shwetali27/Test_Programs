package com.bridgeit.RedisDemo;

import java.util.Map;

import redis.clients.jedis.Jedis;

public class RedisTest {
	public static void main(String[] args){
		
		Jedis jedis = new Jedis("localhost");
		System.out.println(jedis.ping());
		
		jedis.hset("welcom", "one", "1");
		jedis.hset("welcom", "two", "2");
		jedis.hset("welcom", "three", "3");
		jedis.hset("welcom", "four", "4");
		
		Map<String,String> hi = jedis.hgetAll("welcom");
		
		System.out.println(jedis.hgetAll("welcom"));
	}
	
}
