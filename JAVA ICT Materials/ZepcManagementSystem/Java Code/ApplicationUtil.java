package com.cts.zepcpd.util;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cts.zepcpd.exception.ProductOrderException;

public class ApplicationUtil {

	/**
	 * @param fileName
	 * @return List<String>
	 * @throws ProductOrderException
	 */
	public static List<String> readFile(String fileName) throws ProductOrderException {
		List<String> productOrderList = new ArrayList<String>();

		//Code here..
		
		return productOrderList;
	}

	/**
	 * @param util
	 *            Date
	 * @return sql Date
	 */
	public static java.sql.Date convertUtilToSqlDate(java.util.Date uDate) {
		java.sql.Date sDate = null;
		
		//Code here..

		return sDate;
	}

	/**
	 * @param inDate
	 * @return Date
	 */
	public static Date convertStringToDate(String inDate) {
		//Code here..

		return new Date(); //TODO change this return value
	}

	public static boolean checkIfValidOrder(Date dtOfOrder, Date dtOfDelivery, String manager) {
		boolean orderValidity = false;
		
		//Code here..

		return orderValidity;
	}
}
