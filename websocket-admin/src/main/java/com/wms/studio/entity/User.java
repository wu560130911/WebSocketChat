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
package com.wms.studio.entity;

import java.io.Serializable;
import java.util.Date;

import com.wms.studio.api.dto.UserDisableReason;
import com.wms.studio.api.dto.UserRole;

/**
 * @author WMS
 * @date 2015年5月18日-下午7:21:38
 * @version 1.0
 */
@SuppressWarnings("serial")
public class User implements Serializable {

	private String id;

	private String name;

	private String password;

	private String email;

	private Date register_time;

	private boolean disable;// 是否被锁定

	private String salt;// 加密字符串

	private UserRole role;// 用户身份

	private UserDisableReason disable_reason;

	/**
	 * 
	 */
	public User() {
	}

	public User(String id, String name, String password, String email,
			Date registerTime, boolean disable, String salt, UserRole role,
			UserDisableReason disableReason) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.register_time = registerTime;
		this.disable = disable;
		this.salt = salt;
		this.role = role;
		this.disable_reason = disableReason;
	}

	public User(String id) {
		super();
		this.id = id;
	}

	public User(String id, String name, String password, String email,
			UserRole role) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the disable
	 */
	public boolean isDisable() {
		return disable;
	}

	/**
	 * @param disable
	 *            the disable to set
	 */
	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt
	 *            the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the role
	 */
	public UserRole getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(UserRole role) {
		this.role = role;
	}

	/**
	 * @return the register_time
	 */
	public Date getRegister_time() {
		return register_time;
	}

	/**
	 * @param register_time
	 *            the register_time to set
	 */
	public void setRegister_time(Date register_time) {
		this.register_time = register_time;
	}

	/**
	 * @return the disable_reason
	 */
	public UserDisableReason getDisable_reason() {
		return disable_reason;
	}

	/**
	 * @param disable_reason
	 *            the disable_reason to set
	 */
	public void setDisable_reason(UserDisableReason disable_reason) {
		this.disable_reason = disable_reason;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ ", email=" + email + ", register_time=" + register_time
				+ ", disable=" + disable + ", salt=" + salt + ", role=" + role
				+ ", disable_reason=" + disable_reason + "]";
	}

}
