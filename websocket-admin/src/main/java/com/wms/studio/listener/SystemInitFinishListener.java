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
package com.wms.studio.listener;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.wms.studio.utils.FileUtils;

/**
 * @author WMS
 * @date 2015年5月19日-上午9:05:30
 * @version 1.0
 */
@Component
public class SystemInitFinishListener implements
		ApplicationListener<ContextRefreshedEvent> {

	private static final String SYSTEM_DATABASE_INITIALIZE_KEY = "system.INITIALIZE_DATABASE";
	private static final String FILE_PATH = "/system.properties";
	private static final Logger LOG = Logger
			.getLogger(SystemInitFinishListener.class);

	@Resource
	@Qualifier("props")
	private Properties properties;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (properties != null) {
			Boolean databaseInitialise = Boolean.valueOf(properties
					.getProperty(SYSTEM_DATABASE_INITIALIZE_KEY, "false"));
			if (databaseInitialise) {
				properties.setProperty(SYSTEM_DATABASE_INITIALIZE_KEY, "false");
				URL fileUrl = Class.class.getResource(FILE_PATH);
				if (fileUrl == null) {
					LOG.fatal("配置文件不存在，请检查系统的完整性.");
					return;
				}
				try (BufferedWriter write = new BufferedWriter(new FileWriter(
						FileUtils.getCleanFilePath(fileUrl), false))) {
					properties.store(write, "数据库初始化完成");
				} catch (IOException e) {
					LOG.fatal("写入配置文件失败，请检查", e);
				}
			}
		}
	}

}
