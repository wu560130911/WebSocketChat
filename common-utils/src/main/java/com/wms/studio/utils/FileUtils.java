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
package com.wms.studio.utils;

import java.net.URL;

import org.apache.commons.lang3.StringUtils;

import com.wms.studio.utils.utils.Encodes;

/**
 * @author WMS
 * @date 2015年5月19日-上午9:41:58
 * @version 1.0
 */
public class FileUtils {

	public static String getCleanFilePath(String path) {
		if (StringUtils.isNotBlank(path)) {
			return Encodes.urlDecode(path);
		}
		return null;
	}

	public static String getCleanFilePath(URL url) {
		if (url == null) {
			return null;
		}
		return getCleanFilePath(url.getFile());
	}
}
