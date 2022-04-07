/**
 * Don't change this code
 */
package com.cts.zepcpd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.zepcpd.exception.ProductOrderException;


public class DBConnectionManager {

	private static DBConnectionManager instance;
	public static final String PROPERTY_FILE = "database.properties";
	public static final String DRIVER = "drivername";
	public static final String URL = "url";
	public static final String USER_NAME = "username";
	public static final String PASSWORD = "password";

	private static Connection connection = null;
	private static Properties props = null;

	/**
	 * @throws ProductOrderException
	 */
	private DBConnectionManager() throws ProductOrderException {
		loadProperties();
		try {
			Class.forName(props.getProperty(DRIVER));
			this.connection = DriverManager.getConnection(props.getProperty(URL), props.getProperty(USER_NAME), 
					props.getProperty(PASSWORD));
		} catch (ClassNotFoundException ex) {
			throw new ProductOrderException("Could not find Driver class ", ex.getCause());
		} catch (SQLException e) {
			throw new ProductOrderException("Database Connection Creation Failed", e.getCause());
		}
	}

	/**
	 * @return Connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @return DBConnectionManager
	 * @throws ProductOrderException
	 */
	public static DBConnectionManager getInstance() throws ProductOrderException {
		
       // Code here
		
		return null;
	}

	/**
	 * @throws ProductOrderException
	 */
	private void loadProperties() throws ProductOrderException {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(PROPERTY_FILE);
			props = new Properties();
			props.load(inputStream);
		} catch (FileNotFoundException e) {
			throw new ProductOrderException("Database Property File Not Found", e.getCause());
		} catch (IOException e) {
			throw new ProductOrderException("Exception during property file I/O", e.getCause());
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					throw new ProductOrderException("Exception during property file I/O", e.getCause());
				}
			}
		}
	}
}

