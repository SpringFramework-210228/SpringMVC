package com.ak.controller;
import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import com.ak.Pojo.MyUser;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;

 
@Controller
public class UserController {
 
	public UserController(){
		super();
	}


	@RequestMapping("/loginForm")
	public String loginForm(Model model){
		return "MyLogin";
	}

	@RequestMapping("/loginForm1")
	public String loginForm2(Model model){
		return "MyLogin1";
	}

	@RequestMapping("/login2")
	public String login(@ModelAttribute MyUser user,Model model,HttpServletRequest request){
		if(user.getPassword().equals("123")){ //密码为123456则登录成功
			//从后台代码获取国际化信息的username
			RequestContext rContext = new RequestContext(request);
			String username = rContext.getMessage("username");
			//将获取的username保存到user对象中并设置到model
			user.setUsername(username);
			model.addAttribute("user", user);
			return "success";
		}
		return "MyLogin";
	}

	@RequestMapping("/login3")
	public String login(String request_locale,Model model,HttpServletRequest request){
		if(request_locale!=null){
			if(request_locale.equals("zh_CN")){  //设置中文环境
				Locale locale = new Locale("zh","CN");
				request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
			}
			else if(request_locale.equals("en_US")){ //设置英文环境
				Locale locale = new Locale("en","US");
				request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
			}
			else{  //使用之前的环境
				request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, LocaleContextHolder.getLocale());
			}
		}
		MyUser user = new MyUser();
		model.addAttribute("user", user);
		//跳转页面
		return "MyLogin1";
	}

}