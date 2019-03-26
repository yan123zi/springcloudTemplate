package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
//		return new RandomRule();//随机算法
//		return new RoundRobinRule();//轮询算法
		return new RandomRule_ZY();//每台机器五次
	}
}
