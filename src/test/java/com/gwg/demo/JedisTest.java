package com.gwg.demo;


import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class JedisTest {
	
	public static void main(String[] args) {
		Set<HostAndPort> nodes = new HashSet<HostAndPort>();

		nodes.add(new HostAndPort("10.9.20.18", 6392));
		nodes.add(new HostAndPort("10.9.20.18", 6393));
		nodes.add(new HostAndPort("10.9.20.18", 6394));
		nodes.add(new HostAndPort("10.9.20.19", 6392));
		nodes.add(new HostAndPort("10.9.20.19", 6393));
		nodes.add(new HostAndPort("10.9.20.19", 6394));
		JedisCluster cluster = new JedisCluster(nodes);
		cluster.set("name", "gaoweigang");
		System.out.println(cluster.get("name"));
		
		
	}
	
}
