package com.qbk.boca.demo.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import com.qbk.boca.demo.ribbon.BocaRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 代码方式配置负载均衡策略
 * 如果此配置类被@ComponentScan扫描到，则变成全局配置
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
//        return new WeightedResponseTimeRule();
        return new BocaRule();
    }
}
