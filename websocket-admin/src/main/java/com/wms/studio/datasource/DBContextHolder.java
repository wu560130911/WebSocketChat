/**
 *  Copyright 2015 WMS(560130911@163.com)
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.wms.studio.datasource;

/**
 * @author WMS
 * @date 2015年6月2日-下午5:13:48
 * @version 1.0
 */
public class DBContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	/**
	 * 设置数据源
	 * 
	 * @param dbType
	 *            本类中两个静态变量的值
	 */
	public static void setDBType(String dbType) {
		contextHolder.set(dbType);
	}

	public static String getDBType() {
		return contextHolder.get();
	}

	public static void clearDBType() {
		contextHolder.remove();
	}
}
