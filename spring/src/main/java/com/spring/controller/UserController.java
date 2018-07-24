package com.spring.controller;


import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller    // 声明该类是个控制器
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 请求的具体方法可以不写
    //  @RequestMapping注解有两个作用，表明注解的方法是个请求处理方法。要处理"/login"路径的请求
    // 登录页面
    @RequestMapping(value = "/login")
    public String login() {

        return "login"; // 返回的是视图文件的名称
   }

    @RequestMapping("/test")
    public void test(){
        List<User> userList = userService.find("aaa","123qwe");
        System.out.println(userList.size());
    }

}








/// 在controller里面通过model直接传值给页面
//    @RequestMapping(value = "/check")
//    public String check(Model model) {
//        User user = new User();
//        user.setId(5);
//        user.setUsername("在不成功就要跳河了");
//        model.addAttribute("user", user);
//        return "success";
//    }

//    @RequestMapping(value = "/check")
//    public String check(Integer id) {
//        User user = new User();
//        user.setId(5);
//        user.setUsername("在不成功就要跳河了");
//        ModelAndView mv = new ModelAndView("success");
//        mv.addObject("user", user);
//        return "success";
//    }

/// 用spring的依赖注入给controller里面的user传值，并在页面显示出来，这里利用了spring的xml配置bean
//    @RequestMapping(value = "/check")
//    public String check(Model model){
//
//        model.addAttribute(user);
//        return "success";
//    }
//
// 利用servlet传值给页面
//@RequestMapping(value = "/checkList")
//public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse httpServletResponse){
//
//    // 模拟service获取用户列表
//    List<User> userList = userServiceImpl.queryUserList();
//    // 返回modelAndView
//    ModelAndView mv = new ModelAndView();
//    // 相当于request的setAttribut
//    mv.addObject("userlist" ,userList);
//    // 指定视图
//    mv.setViewName("success");
//    return mv;



//   @RequestMapping(value = "/check")
//   public String check(Model model){
//        model.addAttribute(user);
//       return "success";
//   }

// 列表
//    @RequestMapping("/checkLogin")
//    public String login(User user,
//                        Model model,
//                        HttpServletRequest httpServletRequest){
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("username",user.getUsername());
//        map.put("password",user.getPassword());
//        List<User> userList = userService.find();
//        if(userList != null && userList.size() > 0){
//            httpServletRequest.getSession().setAttribute("user",userList.get(0));
//            return "success";  // 转向主页(登录成功页面)
//        }
//        model.addAttribute("errorMsg","登录失败账号或密码错误");
//        return "login";
//    }
//
