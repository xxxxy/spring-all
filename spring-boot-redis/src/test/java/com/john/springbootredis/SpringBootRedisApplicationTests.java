package com.john.springbootredis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

class SpringBootRedisApplicationTests {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("47.100.193.5", 16380);
        String ping = jedis.ping();
        System.out.println(ping);
        /*Jedis jedis = new Jedis("47.100.193.5", 16379);
        String ping = jedis.ping();
        System.out.println(ping);

        GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();
        genericObjectPoolConfig.setMaxTotal(100);
        genericObjectPoolConfig.setMaxIdle(20);

        JedisPool jedisPool = new JedisPool(genericObjectPoolConfig, "47.100.193.5", 16379);
        Jedis resource = jedisPool.getResource();
        System.out.println(resource.ping());*/

        Set<HostAndPort> hostAndPorts= new HashSet<>();
        hostAndPorts.add(new HostAndPort("47.100.193.5", 16380));
        hostAndPorts.add(new HostAndPort("47.100.193.5", 16381));
        hostAndPorts.add(new HostAndPort("47.100.193.5", 16382));
        hostAndPorts.add(new HostAndPort("47.100.193.5", 16383));
        hostAndPorts.add(new HostAndPort("47.100.193.5", 16384));
        hostAndPorts.add(new HostAndPort("47.100.193.5", 16385));
        JedisCluster jedisCluster = new JedisCluster(hostAndPorts);
        jedisCluster.set("jediskey", "value");
        String jediskey = jedisCluster.get("jediskey");
        System.out.println(jediskey);
    }
}
