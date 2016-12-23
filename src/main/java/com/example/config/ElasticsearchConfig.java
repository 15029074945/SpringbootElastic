package com.example.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by sherlock on 16/9/21.
 */

@Configuration
@PropertySource(value = "classpath:/elasticsearch.properties")
@EnableElasticsearchRepositories(basePackages = "com.example.repository")
public class ElasticsearchConfig {

    @Resource
    private Environment environment;

    @Bean
    public Client client() {

        Settings settings = Settings.settingsBuilder().put("client.transport.sniff", true).build();
        // on startup
        Client client = null;
        try {
            client = TransportClient.builder().build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(environment.getProperty("elasticsearch.host")), Integer.parseInt(environment.getProperty("elasticsearch.port"))));
                    //.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("host2"), 9300));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // on shutdown
        //client.close();
        return client;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }
}
