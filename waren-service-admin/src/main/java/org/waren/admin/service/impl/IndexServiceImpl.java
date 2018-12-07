/**
 * 
 */
package org.waren.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.waren.admin.service.IndexService;

/**
 * @author think
 *
 */
//@Service(version = "1.0.0")
public class IndexServiceImpl implements IndexService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.waren.admin.service.IndexService#menus()
	 */
	@Override
	public List<String> menus() {
		List<String> list = new ArrayList<>();
		list.add("Menu");
		return list;
	}

}
