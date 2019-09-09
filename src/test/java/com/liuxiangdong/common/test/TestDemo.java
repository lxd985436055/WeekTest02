package com.liuxiangdong.common.test;

import org.junit.Test;

import com.liuxiangdong.common.utils.StringUtils;

public class TestDemo {

	/**
	 * 测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法
	 * */
	@Test
	public void PhontTest() {
		boolean phone = StringUtils.isPhone("13965826578");
		boolean phone2 = StringUtils.isPhone("1235698520");
		System.out.println(phone);
		System.out.println(phone2);
	}
	
	/**
	 * 测试StringUtil工具类中的是否为邮箱isEmail()工具方法
	 * */
	@Test
	public void EmailTest() {
		boolean email = StringUtils.isEmail("666@qq.com");
		boolean email2 = StringUtils.isEmail("666@qq.com.cn");
		System.out.println(email);
		System.out.println(email2);
	}
	
	/**
	 * 测试StringUtil工具类中toHtml()方法，传一段文本进去，输出带html标签的文本
	 * */
	@Test
	public void HtmlTest() {
		String html = StringUtils.toHtml("的痕迹案例可能是你大立科技爱死你大立科技阿森纳第六届奥克斯多年来卡死大家啊肯定假设的吉普赛就打死建档立卡所经历的看");
		String html2 = StringUtils.toHtml("的痕迹案例可能是你大立科技爱死你大立科技阿森纳第六届奥克斯多年来卡死大家啊肯定假设的吉普赛就打死建档立卡所经历的看");
		String html3 = StringUtils.toHtml("的痕迹案例可能是你大立科技爱死你大立科技阿森纳第六届奥克斯多年来卡死大家啊肯定假设的吉普赛就打死建档立卡所经历的看");
		String html4 = StringUtils.toHtml("的痕迹案例可能是你大立科技爱死你大立科技阿森纳第六届奥克斯多年来卡死大家啊肯定假设的吉普赛就打死建档立卡所经历的看");
		System.out.println(html);
		System.out.println(html2);
		System.out.println(html3);
		System.out.println(html4);
	}
	
	
}
