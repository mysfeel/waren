/**
 * 
 */
package org.waren.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.waren.admin.service.IndexService;
import org.waren.common.dao.SysMenuDao;
import org.waren.common.pojo.SysMenu;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author think
 *
 */
@Service(version = "1.0.0")
public class IndexServiceImpl implements IndexService {

	@Autowired
	private SysMenuDao sysMenuDao;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.waren.admin.service.IndexService#menus()
	 */
	@Override
	public List<SysMenu> menus() {
		return sysMenuDao.all();
	}

}
