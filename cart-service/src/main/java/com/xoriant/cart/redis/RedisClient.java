package com.xoriant.cart.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import com.xoriant.cart.model.ItemLine;

@Configuration
@EnableRedisRepositories
public class RedisClient {

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
		configuration.setHostName("redis-17613.c292.ap-southeast-1-1.ec2.cloud.redislabs.com");
		configuration.setPort(17613);
		configuration.setPassword("Ebw55elrc1tansuWW6j1721s8ubq2LQg");
		return new JedisConnectionFactory();
	}

	@Bean
	public RedisTemplate<String, ItemLine> redisTemplate() {
		RedisTemplate<String, ItemLine> template = new RedisTemplate<String, ItemLine>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		template.setHashKeySerializer(new StringRedisSerializer());
		template.setHashKeySerializer(new JdkSerializationRedisSerializer());
		template.setValueSerializer(new JdkSerializationRedisSerializer());
		template.setEnableTransactionSupport(true);
		template.afterPropertiesSet();
		return template;
//		final RedisTemplate<String, ItemLine> template = new RedisTemplate<String, ItemLine>();
//		template.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
//		template.setKeySerializer(new StringRedisSerializer());
//		template.setHashKeySerializer(new GenericJackson2JsonRedisSerializer());
//		template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//		template.setConnectionFactory(jedisConnectionFactory());
//		template.setEnableTransactionSupport(true);
//		template.afterPropertiesSet();
//		return template;
	}
}
