package test.mydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("lookupTest.xml");
		GetBeanTest test = (GetBeanTest) ac.getBean("getBeanTest");
		test.showMe();
	}
}
