package com.ak.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试 @RequestMapping 注解
 */
@Controller
@RequestMapping("User")
public class UserController_RequestMapping {

    /**
     * http://localhost:8080/web_war_exploded/User/Add
     * Value 的  单路径
     * @return
     */
    @RequestMapping(value = "/Add")
    @ResponseBody
    public String Add(){
        return "add user Sucess";
    }

    /**
     * Value  的多路径
     * @return
     */
    @RequestMapping(value = {"/hello","helloworld"})
    @ResponseBody
    public String Add1(){
        return "dd user Sucess  Value_More";
    }

    /**
     * http://localhost:8080/web_war_exploded/User/Login?name=joker&password=123
     * path 属性讲解
     * @param name
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "/Login" )
    public String Login(String name,String password){
        return "name----"+name+"---- password"+password;
    }


    /**
     * Method  的单个请求
     * @param name
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/Method_Get",method = RequestMethod.GET)
    public String Login1(String name,String password){
        return "name----"+name+"---- password"+password;
    }

    /**
     * Method 的多个请求
     * @param name
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/Method_More",method = {RequestMethod.GET,RequestMethod.POST})
    public String Login2(String name,String password){
        return "name----"+name+"---- password"+password;
    }

    /**
     * param 用法  param!=
     * @return
     */
    @RequestMapping(value = "/Update_NotEqual",params = "name!=joker")
    @ResponseBody
    public String Update(){
        return "param!=";
    }

    /**
     * param 用法  param=
     * @return
     */
    @RequestMapping(value = "/Update_Equal",params = "name=joker")
    @ResponseBody
    public String Update1(){
        return "param==";
    }

    /**
     * param 用法  !param
     * @return
     */
    @RequestMapping(value = "/Update_NotHave",params = "!name")
    @ResponseBody
    public String Update2(){
        return "!param";
    }

    /**
     * param 用法  !param
     * @return
     */
    @RequestMapping(value = "/Update_Have",params = "name")
    @ResponseBody
    public String Update5(String name){
        return "param"+name;
    }

    /**
     * Headers 用法
     * @return
     */
    @RequestMapping(value = "/Delete",headers = "Accept-Language=en,zh-CN;q=0.9,zh;q=0.8")
    @ResponseBody
    public String Update3(){
        return "添加用户成功";
    }

    /**
     *  Consumes 用法
     * @return
     */
//    @RequestMapping(value="/hw" ,consumes= MediaType.TEXT_HTML_VALUE)
	@RequestMapping(value="/hw" ,consumes="text/html") //也可以直接写类型
    public String helloWorld2() {
        return "hello";
    }

    @RequestMapping("/he/*/hw3")
    public String helloWorld3() {
        return "hello";
    }

    @RequestMapping("/h/**/hw3")
    public String helloWorld4() {
        return "hello";
    }

    @RequestMapping("/hw/hw???")//注意：三个问号，要传入3个字符，否则匹配失败
    public String helloWorld5() {
        return "hello";
    }

    /**
     * 等价于     @RequestMapping(value = "getMapping",method = RequestMethod.GET)
     *
     * @return
     */
    @GetMapping("/getMapping")
    public String helloWorld6() {
        return "hello";
    }
}
