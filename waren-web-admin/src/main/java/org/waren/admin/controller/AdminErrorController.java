/**
 * 
 */
package org.waren.admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 全局错误页面处理
 * @author think
 *
 */
@Controller
public class AdminErrorController implements ErrorController {

	@RequestMapping("/error")
	public String handleError(HttpServletRequest request) {
		// 获取statusCode:401,404,500
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		if (statusCode == 401) {
			return "/error/401.html";
		} else if (statusCode == 404) {
			return "/error/404.html";
		} else if (statusCode == 403) {
			return "/error/403.html";
		} else {
			return "/error/500.html";
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.boot.web.servlet.error.ErrorController#getErrorPath()
	 */
	@Override
	public String getErrorPath() {
		return "/error";
	}

}
