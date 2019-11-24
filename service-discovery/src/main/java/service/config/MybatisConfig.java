package service.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

//    private final DataSourceProperties dataSourceProperties;
//    private final MybatisProperties mybatisProperties;
//
//    public MybatisConfig(DataSourceProperties dataSourceProperties, MybatisProperties mybatisProperties) {
//        this.dataSourceProperties = dataSourceProperties;
//        this.mybatisProperties = mybatisProperties;
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//
//        dataSource.setUrl(dataSourceProperties.getUrl());
//        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
//        dataSource.setUsername(dataSourceProperties.getUsername());
//        dataSource.setPassword(dataSourceProperties.getPassword());
//        return dataSource;
//    }
//
//    @Bean
//    public DataSourceTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setTypeAliasesPackage(mybatisProperties.getTypeAliasesPackage());
//        sessionFactory.setMapperLocations(mybatisProperties.resolveMapperLocations());
//        return sessionFactory.getObject();
//    }

}
