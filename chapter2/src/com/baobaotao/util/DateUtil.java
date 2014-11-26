package com.baobaotao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static String defaultSimpleFormater = "yyyy-MM-dd hh:mm:ss";

	/**
	 * 9.* Ĭ�ϼ������ַ��� 10.* 1 * @return 12.
	 */
	public static String getDefaultSimpleFormater() {
		return defaultSimpleFormater;
	}

	/**
	 * 17.* ����Ĭ�ϼ����ڸ�ʽ�ַ��� 18.* 19.* @param defaultFormatString 20.
	 */
	public static void setDefaultSimpleFormater(String defaultFormatString) {
		DateUtil.defaultSimpleFormater = defaultFormatString;
	}

	/**
	 * 25.* ��ʽ������ 26.* 27.* @param date 28.* @param formatString 29.* @return
	 * 30.
	 */
	public static String format(Date date, String formatString) {
		SimpleDateFormat df = new SimpleDateFormat(formatString);
		return df.format(date);
	}

	/**
	 * 36.* ��ʽ������(ʹ��Ĭ�ϸ�ʽ) 37.* 38.* @param date 39.* @return 40.
	 */
	public static String format(Date date) {
		return format(date, defaultSimpleFormater);
	}

	/**
	 * 45.* ת�������� 46.* 47.* @param dateString 48.* @param formatString 49.* @return
	 * 50.
	 */
	public static Date parse(String dateString, String formatString) {
		SimpleDateFormat df = new SimpleDateFormat(formatString);
		try {
			return df.parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 60.* ת��������(ʹ��Ĭ�ϸ�ʽ) 6 * 62.* @param dateString 63.* @return 64.
	 */
	public static Date parse(String dateString) {
		return parse(dateString, defaultSimpleFormater);
	}

	/**
	 * 69.* ���� 70.* 7 * @return 72.
	 */
	public static Date yesterday() {
		return addDay(-1);
	}

	/**
	 * 77.* ���� 78.* 79.* @return 80.
	 */
	public static Date tomorrow() {
		return addDay(1);
	}

	/**
	 * 85.* ���� 86.* 87.* @return 88.
	 */
	public static Date now() {
		return new Date(System.currentTimeMillis());
	}

	/**
	 * 93.* ���ռ� 94.* 95.* @param value 96.* @return 97.
	 */
	public static Date addDay(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_YEAR, value);
		return now.getTime();
	}

	/**
	 * 104.* ���ռ�,ָ������ 105.* 106.* @param date 107.* @param value 108.* @return
	 * 109.
	 */
	public static Date addDay(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.DAY_OF_YEAR, value);
		return now.getTime();
	}

	/**
	 * 117.* ���¼� 118.* 119.* @param value 120.* @return 12
	 */
	public static Date addMonth(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MONTH, value);
		return now.getTime();
	}

	/**
	 * 128.* ���¼�,ָ������ 129.* 130.* @param date 13 * @param value 132.* @return
	 * 133.
	 */
	public static Date addMonth(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.MONTH, value);
		return now.getTime();
	}

	/**
	 * 14 * ����� 142.* 143.* @param value 144.* @return 145.
	 */
	public static Date addYear(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.YEAR, value);
		return now.getTime();
	}

	/**
	 * 152.* �����,ָ������ 153.* 154.* @param date 155.* @param value 156.* @return
	 * 157.
	 */
	public static Date addYear(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.YEAR, value);
		return now.getTime();
	}

	/**
	 * 165.* ��Сʱ�� 166.* 167.* @param value 168.* @return 169.
	 */
	public static Date addHour(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.HOUR_OF_DAY, value);
		return now.getTime();
	}

	/**
	 * 176.* ��Сʱ��,ָ������ 177.* 178.* @param date 179.* @param value 180.* @return
	 * 18
	 */
	public static Date addHour(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.HOUR_OF_DAY, value);
		return now.getTime();
	}

	/**
	 * 189.* �����Ӽ� 190.* 19 * @param value 192.* @return 193.
	 */
	public static Date addMinute(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MINUTE, value);
		return now.getTime();
	}

	/**
	 * 200.* �����Ӽ�,ָ������ 20 * 202.* @param date 203.* @param value 204.* @return
	 */
	public static Date addMinute(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.MINUTE, value);
		return now.getTime();
	}

	/**
	 * 213.* ��� 214.* 215.* @return 216.
	 */
	public static int year() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR);
	}

	/**
	 * 222.* �·� 223.* 224.* @return 225.
	 */
	public static int month() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.MONTH);
	}

	/**
	 * 23 * ��(��) 232.* 233.* @return 234.
	 */
	public static int day() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 240.* Сʱ(��) 24 * 242.* @return 243.
	 */
	public static int hour() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.HOUR);
	}

	/**
	 * 249.* ���� 250.*
	 * 
	 * @return
	 */
	public static int minute() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.MINUTE);
	}

	/**
	 * 258.* �� 259.* 260.* @return
	 */
	public static int second() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.SECOND);
	}

	/**
	 * 267.* ���ڼ�(��ݼ�) 268.* 269.* @return
	 */
	public static int weekday() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.DAY_OF_WEEK) - 1;
	}

	/**
	 ** ��������? 277.* 278.* @return 279.
	 */
	public static boolean isAm() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.AM_PM) == 0;
	}

	/**
	 * ��������?
	 * 
	 * @return
	 */
	public static boolean isPm() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.AM_PM) == 1;
	}
}
