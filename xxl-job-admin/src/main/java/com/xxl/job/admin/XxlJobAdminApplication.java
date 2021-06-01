package com.xxl.job.admin;

import org.quartz.Job;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication
public class XxlJobAdminApplication {

	public static void main(String[] args) {
        System.setProperty("druid.filters","xLogSql");
        SpringApplication.run(XxlJobAdminApplication.class, args);
	}

}