package org.dubbo.api.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboMain {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo.xml" });
		context.start();
		System.in.read(); // 按任意键退出
//		Main.main(args);
	}
}
