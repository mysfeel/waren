/**
 * 
 */
package org.waren.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.waren.admin.service.IndexService;
import org.waren.common.pojo.SysMenu;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * 首页
 * @author waren
 *
 */
@Controller
public class IndexController {
	
	@Reference(version = "1.0.0", url = "dubbo://localhost:12345")
	private IndexService indexService;

	@RequestMapping("/")
	public String root(Model model, HttpServletRequest request)
	{
		List<SysMenu> menus = indexService.menus();
		menus.forEach( m -> {
			System.out.println(m.getId());
		});
		return "/index.html";
	}
	
	@RequestMapping("/index")
	public String index(Model model, HttpServletRequest request)
	{
		return "/index.html";
	}
}
