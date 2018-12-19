/**
 * 
 */
package org.waren.admin.service;

import java.util.List;

import org.waren.common.pojo.SysMenu;

/**
 * Index Service 首页
 * 
 * @author think
 *
 */
public interface IndexService {

	/**
	 * 拿到菜单
	 * 
	 * @return
	 */
	List<SysMenu> menus();
}
