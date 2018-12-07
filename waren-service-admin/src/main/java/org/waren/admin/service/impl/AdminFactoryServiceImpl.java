/**
 * 
 */
package org.waren.admin.service.impl;

import org.waren.admin.service.AdminFactoryService;
import org.waren.admin.service.IndexService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author think
 *
 */
@Service(version = "1.0.0")
public class AdminFactoryServiceImpl implements AdminFactoryService {

	/* (non-Javadoc)
	 * @see org.waren.admin.service.AdminFactoryService#indexService()
	 */
	@Override
	public IndexService indexService() {
		// TODO Auto-generated method stub
		return null;
	}

}
