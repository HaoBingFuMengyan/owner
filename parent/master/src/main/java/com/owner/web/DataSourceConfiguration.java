package com.owner.web;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

/**
 * 配置Sqlite数据库的DataSource
 * Created by haobingfu on 2018/8/13.
 */
@Configuration
public class DataSourceConfiguration {

    @Bean(destroyMethod = "", name = "EmbeddeddataSource")
    public DataSource dataSource() {
        String projectPath = System.getProperty("user.dir");
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:" +projectPath.substring(0,projectPath.lastIndexOf("/"))+ "/owner.db");
        dataSourceBuilder.type(SQLiteDataSource.class);
        return dataSourceBuilder.build();
    }

}
