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
package com.wms.studio.mapper;

import com.wms.studio.entity.User;
import com.wms.studio.mybatis.SimpleSqlSessionTemplate;

/**
 * @author WMS
 * @date 2015年5月19日-上午8:41:28
 * @version 1.0
 */
public interface UserMapper extends SimpleSqlSessionTemplate {

	User findUserById(String id);

	User findUserByEmail(String email);

	void addUser(User user);
}
