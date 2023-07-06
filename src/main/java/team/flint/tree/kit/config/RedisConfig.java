//package team.flint.archetype.kit.config;
//
//import cn.hutool.core.util.ObjectUtil;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang3.StringUtils;
//import org.redisson.api.NameMapper;
//import org.redisson.codec.JsonJacksonCodec;
//import org.redisson.spring.starter.RedissonAutoConfigurationCustomizer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import team.flint.archetype.kit.config.properties.RedissonProperties;
//
//@Slf4j
//@Configuration
//@EnableCaching
//@EnableConfigurationProperties(RedissonProperties.class)
//public class RedisConfig {
//    @Autowired
//    private RedissonProperties redissonProperties;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Bean
//    public RedissonAutoConfigurationCustomizer redissonCustomizer() {
//        return config -> {
//            config.setThreads(redissonProperties.getThreads())
//                    .setNettyThreads(redissonProperties.getNettyThreads())
//                    .setCodec(new JsonJacksonCodec(objectMapper));
//            RedissonProperties.SingleServerConfig singleServerConfig = redissonProperties.getSingleServerConfig();
//            if (ObjectUtil.isNotNull(singleServerConfig)) {
//                // 使用单机模式
//                config.useSingleServer()
//                        //设置redis key前缀
//                        .setNameMapper(new KeyPrefixHandler(redissonProperties.getKeyPrefix()))
//                        .setTimeout(singleServerConfig.getTimeout())
//                        .setClientName(singleServerConfig.getClientName())
//                        .setIdleConnectionTimeout(singleServerConfig.getIdleConnectionTimeout())
//                        .setSubscriptionConnectionPoolSize(singleServerConfig.getSubscriptionConnectionPoolSize())
//                        .setConnectionMinimumIdleSize(singleServerConfig.getConnectionMinimumIdleSize())
//                        .setConnectionPoolSize(singleServerConfig.getConnectionPoolSize());
//            }
//            // 集群配置方式 参考下方注释
//            RedissonProperties.ClusterServersConfig clusterServersConfig = redissonProperties.getClusterServersConfig();
//            if (ObjectUtil.isNotNull(clusterServersConfig)) {
//                config.useClusterServers()
//                        //设置redis key前缀
//                        .setNameMapper(new KeyPrefixHandler(redissonProperties.getKeyPrefix()))
//                        .setTimeout(clusterServersConfig.getTimeout())
//                        .setClientName(clusterServersConfig.getClientName())
//                        .setIdleConnectionTimeout(clusterServersConfig.getIdleConnectionTimeout())
//                        .setSubscriptionConnectionPoolSize(clusterServersConfig.getSubscriptionConnectionPoolSize())
//                        .setMasterConnectionMinimumIdleSize(clusterServersConfig.getMasterConnectionMinimumIdleSize())
//                        .setMasterConnectionPoolSize(clusterServersConfig.getMasterConnectionPoolSize())
//                        .setSlaveConnectionMinimumIdleSize(clusterServersConfig.getSlaveConnectionMinimumIdleSize())
//                        .setSlaveConnectionPoolSize(clusterServersConfig.getSlaveConnectionPoolSize())
//                        .setReadMode(clusterServersConfig.getReadMode())
//                        .setSubscriptionMode(clusterServersConfig.getSubscriptionMode());
//            }
//            log.info("初始化 redis 配置");
//        };
//    }
//}
//
//record KeyPrefixHandler(String keyPrefix) implements NameMapper {
//
//    KeyPrefixHandler(String keyPrefix) {
//        //前缀为空 则返回空前缀
//        this.keyPrefix = StringUtils.isBlank(keyPrefix) ? "" : keyPrefix + ":";
//    }
//
//    /**
//     * 增加前缀
//     */
//    @Override
//    public String map(String name) {
//        if (StringUtils.isBlank(name)) {
//            return null;
//        }
//        if (StringUtils.isNotBlank(keyPrefix) && !name.startsWith(keyPrefix)) {
//            return keyPrefix + name;
//        }
//        return name;
//    }
//
//    /**
//     * 去除前缀
//     */
//    @Override
//    public String unmap(String name) {
//        if (StringUtils.isBlank(name)) {
//            return null;
//        }
//        if (StringUtils.isNotBlank(keyPrefix) && name.startsWith(keyPrefix)) {
//            return name.substring(keyPrefix.length());
//        }
//        return name;
//    }
//
//}
