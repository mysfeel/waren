/**
 * 
 */
package org.waren.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.waren.admin.service.IndexService;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * 首页
 * @author waren
 *
 */
@Controller
public class IndexController {
	
	@Reference(version = "1.0.0")
	private IndexService indexService;

	@RequestMapping("/")
	public String root(Model model, HttpServletRequest request)
	{
		List<String> menus = indexService.menus();
		menus.forEach( m -> {
			System.out.println(m);
		});
		return "forward:/index";
	}
	
	@RequestMapping("/index")
	public String index(Model model, HttpServletRequest request)
	{
		return "index";
	}
}
