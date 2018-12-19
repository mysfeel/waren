package org.waren.common.pojo;

import org.beetl.sql.core.annotatoin.Table;

/* 
* 
* gen by beetlsql 2018-12-19
*/
@Table(name = "test-dev.sys_menu")
public class SysMenu extends Abs {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7149818341633634653L;
	/*
	 * 菜单ID
	 */
	private Long id;
	/*
	 * 排序
	 */
	private Integer sort;
	/*
	 * 菜单ICON
	 */
	private String icon;
	/*
	 * 权限标识
	 */
	private String identifier;
	/*
	 * 菜单名称
	 */
	private String name;
	/*
	 * 父节点
	 */
	private Long parentId;
	/*
	 * 类型
	 */
	private String type;
	/*
	 * URL
	 */
	private String url;
	/*
	 * 版本
	 */
	private Long version;

	public SysMenu() {
	}

	/**
	 * 菜单ID
	 * 
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 菜单ID
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 排序
	 * 
	 * @return
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * 排序
	 * 
	 * @param sort
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	/**
	 * 菜单ICON
	 * 
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 菜单ICON
	 * 
	 * @param icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * 权限标识
	 * 
	 * @return
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * 权限标识
	 * 
	 * @param identifier
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * 菜单名称
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 菜单名称
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 父节点
	 * 
	 * @return
	 */
	public Long getParentId() {
		return parentId;
	}

	/**
	 * 父节点
	 * 
	 * @param parentId
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * 类型
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 类型
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * URL
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * URL
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 版本
	 * 
	 * @return
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * 版本
	 * 
	 * @param version
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

}
