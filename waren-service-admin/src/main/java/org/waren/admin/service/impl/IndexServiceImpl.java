/**
 * 
 */
package org.waren.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.waren.admin.service.IndexService;
import org.waren.common.beetl.UserDao;
import org.waren.common.pojo.User;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author think
 *
 */
@Service(version = "1.0.0")
public class IndexServiceImpl implements IndexService {

	@Autowired
	private UserDao userDao;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.waren.admin.service.IndexService#menus()
	 */
	@Override
	public List<String> menus() {
		List<String> list = new ArrayList<>();
		list.add("Menu");
		
		List<User> list2 = userDao.select("a");
		
		list2.forEach(u -> {
			System.out.println(u.getId());
		});
		
		return list;
	}

}
