/**
 * 
 */
package org.waren.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 * @author waren
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String root(Model model, HttpServletRequest request)
	{
		return "forward:/index";
	}
	
	@RequestMapping("/index")
	public String index(Model model, HttpServletRequest request)
	{
		return "index";
	}
}
