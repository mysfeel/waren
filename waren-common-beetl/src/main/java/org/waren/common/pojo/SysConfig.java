package org.waren.common.pojo;

import org.beetl.sql.core.annotatoin.Table;

/* 
* 
* gen by beetlsql 2018-12-19
*/
@Table(name = "test-dev.sys_config")
public class SysConfig {

	private String description;
	private String id;
	private String value;
	private Long version;

	public SysConfig() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
