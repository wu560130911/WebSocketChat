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
package com.wms.studio.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wms.studio.api.dto.UserDisableReason;
import com.wms.studio.api.dto.UserRole;
import com.wms.studio.entity.User;
import com.wms.studio.mapper.UserMapper;

/**
 * @author WMS
 * @date 2015年5月19日-上午9:20:44
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class TestSpringApplication {

	@Resource
	private UserMapper userMapper;

	@Test
	public void test() {
		User user = new User("560130911", "test", "test", "test", new Date(),
				false, "test", UserRole.用户, UserDisableReason.正常);
		userMapper.addUser(user);
		//User t = userMapper.findUserById("560130911");
	}
}
