package com.liuxiangdong.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	/**
	 * �ڹ��߰����������һ���ַ���toHtml(String text)���߷���
	 * */
	public static String toHtml(String text) {
		String[] split = text.split("(\r\n)");
		StringBuffer buffer = new StringBuffer();
		for (String string : split) {
			buffer.append("<p>");
			String replace = string.replace("(\r)", "<br/>");
			buffer.append(replace);
			buffer.append("</p>  ");
		}
		return buffer.toString();
	}
	
	/**
	 * StringUtil�������е��Ƿ�Ϊ�й������ֻ�����isPhone()���߷���
	 * */
	public static boolean isPhone(String phone) {
		Pattern pattern = Pattern.compile("^1[3|4|5|7|9][0-9]\\d{8}$");
		Matcher matcher = pattern.matcher(phone);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
	/**
	 * StringUtil�������е��Ƿ�Ϊ����isEmail()���߷���
	 * */
	public static boolean isEmail(String email) {
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|cn)");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
	/**
	 * hasText()���߷�����֤ǰ���ύ��ֵ���ܿգ����ҿհ��ַ���Ҳ����
	 * */
	public static boolean hasText(String str) {
		if(str!=null&&str.length()>0&&str.trim().length()>0) {
			return true;
		}
		return false;
	}
	
	
}
