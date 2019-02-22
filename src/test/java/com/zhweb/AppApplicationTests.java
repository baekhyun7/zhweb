package com.zhweb;

import com.zhweb.app.AppApplication;
import com.zhweb.config.RedisConfig;
import com.zhweb.util.MD5Util;
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
	@Test
	public void methdo(){
		String s = MD5Util.MD5(MD5Util.MD5("123456admin8d78869f470951332959580424d4bf4f"));
		System.err.println("s"+s);
	}

}

