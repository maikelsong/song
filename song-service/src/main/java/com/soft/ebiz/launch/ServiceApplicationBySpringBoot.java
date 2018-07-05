/*
 * Copyright (C), 2013-2018, 上汽集团
 * FileName: DemoApplication.java
 * Author:   raolesong
 * Date:     2018年7月5日 上午10:50:02
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.soft.ebiz.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication(exclude= {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
@ImportResource("classpath:conf/applicationContext-service.xml")
public class ServiceApplicationBySpringBoot {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplicationBySpringBoot.class, args);
	}
}
