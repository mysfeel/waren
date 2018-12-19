package org.waren.common.pojo;

import java.util.Date;

import org.beetl.sql.core.annotatoin.Table;

/* 
* 
* gen by beetlsql 2018-12-19
*/
@Table(name = "test-dev.sys_user")
public class SysUser extends Abs {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8042744565445284483L;
	
	private Long id;
	/*
	 * 注册邮箱
	 */
	private String email;
	/*
	 * 登录名（字母+数字+下划线）
	 */
	private String loginname;
	/*
	 * 注册手机号
	 */
	private String mobile;
	/*
	 * 密码，加密存储
	 */
	private String password;
	private Long version;
	private Date createTime;
	private Date updateTime;

	public SysUser() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 注册邮箱
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 注册邮箱
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 登录名（字母+数字+下划线）
	 * 
	 * @return
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * 登录名（字母+数字+下划线）
	 * 
	 * @param loginname
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * 注册手机号
	 * 
	 * @return
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * 注册手机号
	 * 
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 密码，加密存储
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 密码，加密存储
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
