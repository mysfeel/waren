package org.waren.common.pojo;

import java.util.Date;

import org.beetl.sql.core.annotatoin.Table;

/* 
* 
* gen by beetlsql 2018-12-19
*/
@Table(name = "test-dev.sys_log")
public class SysLog extends Abs {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6815438186465363319L;
	private String content;
	private String type;
	private Long userId;
	private String uuid;
	private Long version;
	private Date createTime;

	public SysLog() {
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

}
