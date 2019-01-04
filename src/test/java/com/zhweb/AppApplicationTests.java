package com.zhweb;

import com.zhweb.app.AppApplication;
import com.zhweb.config.RedisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppApplication.class)
public class AppApplicationTests {
	@Autowired
	private RedisConfig redisConfig;

	@Test
	public void contextLoads() {
		System.err.println("re"+redisConfig.getPort());
	}

}

