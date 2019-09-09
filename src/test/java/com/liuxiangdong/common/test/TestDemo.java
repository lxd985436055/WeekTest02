package com.liuxiangdong.common.test;

import org.junit.Test;

import com.liuxiangdong.common.utils.StringUtils;

public class TestDemo {

	/**
	 * ����StringUtil�������е��Ƿ�Ϊ�й������ֻ�����isPhone()���߷���
	 * */
	@Test
	public void PhontTest() {
		boolean phone = StringUtils.isPhone("13965826578");
		boolean phone2 = StringUtils.isPhone("1235698520");
		System.out.println(phone);
		System.out.println(phone2);
	}
	
	/**
	 * ����StringUtil�������е��Ƿ�Ϊ����isEmail()���߷���
	 * */
	@Test
	public void EmailTest() {
		boolean email = StringUtils.isEmail("666@qq.com");
		boolean email2 = StringUtils.isEmail("666@qq.com.cn");
		System.out.println(email);
		System.out.println(email2);
	}
	
	/**
	 * ����StringUtil��������toHtml()��������һ���ı���ȥ�������html��ǩ���ı�
	 * */
	@Test
	public void HtmlTest() {
		String html = StringUtils.toHtml("�ĺۼ�����������������Ƽ�����������Ƽ���ɭ�ɵ�����¿�˹������������Ұ��϶�����ļ������ʹ������������������Ŀ�");
		String html2 = StringUtils.toHtml("�ĺۼ�����������������Ƽ�����������Ƽ���ɭ�ɵ�����¿�˹������������Ұ��϶�����ļ������ʹ������������������Ŀ�");
		String html3 = StringUtils.toHtml("�ĺۼ�����������������Ƽ�����������Ƽ���ɭ�ɵ�����¿�˹������������Ұ��϶�����ļ������ʹ������������������Ŀ�");
		String html4 = StringUtils.toHtml("�ĺۼ�����������������Ƽ�����������Ƽ���ɭ�ɵ�����¿�˹������������Ұ��϶�����ļ������ʹ������������������Ŀ�");
		System.out.println(html);
		System.out.println(html2);
		System.out.println(html3);
		System.out.println(html4);
	}
	
	
}
