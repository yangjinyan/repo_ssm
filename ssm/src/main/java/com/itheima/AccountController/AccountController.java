package com.itheima.AccountController;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(path = "/test")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping(path = "/findAll")
    public String findAll(Model model){
        //调用service方法
        List<Account> list = accountService.findAll();
        //System.out.println("list = " + list);
        model.addAttribute("list", list);
        System.out.println("表现层查询所有。。。");
        return "list";
    }

    /**
     * 保存的方法
     * @param account
     * @param request
     * @param response
     */
    @RequestMapping(path = "/save")
   public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.save(account);
        //重定向到查询所有的方法
        response.sendRedirect(request.getContextPath()+"/test/findAll");
        return ;

   }
}
