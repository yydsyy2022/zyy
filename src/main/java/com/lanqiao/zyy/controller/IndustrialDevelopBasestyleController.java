package com.lanqiao.zyy.controller;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopBasestyle;
import com.lanqiao.zyy.domain.IndustrialDevelopTecSerOrg;
import com.lanqiao.zyy.service.IndustrialDevelopBasestyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndustrialDevelopBasestyleController {

    @Autowired
    IndustrialDevelopBasestyleService industrialDevelopBasestyleService;

    @GetMapping("/industryBaseStyle")//根据条件查找
    public String selectBySelective(IndustrialDevelopBasestyle baseStyle, Integer pageNum, Model model, HttpSession session){
        if (pageNum == null) {
            pageNum=1;
            session.setAttribute("baseStyle",baseStyle);
        }else {
            baseStyle= (IndustrialDevelopBasestyle) session.getAttribute("baseStyle");
        }
        Page<IndustrialDevelopBasestyle> baseStyleList=this.industrialDevelopBasestyleService.selectBySelective(baseStyle,pageNum,5);
        model.addAttribute("baseStyleList",baseStyleList);
        return "";
    }

    //用于修改时根据id查找返回数据
    @GetMapping("/industryBaseStyle/query")
    public String selectByPrimaryKey(Integer id,String code){
        IndustrialDevelopBasestyle baseStyle = this.industrialDevelopBasestyleService.selectByPrimaryKey(id,code);
        return "/update";
    }

    @GetMapping("/industryBaseStyle/insert")
    public String insert(IndustrialDevelopBasestyle baseStyle){
        this.industrialDevelopBasestyleService.insert(baseStyle);
        return "";
    }

    @GetMapping("/industryBaseStyle/delete")
    public String delete(Long id){
        this.industrialDevelopBasestyleService.deleteByPrimaryKey(id);
        return "";
    }

    @PostMapping("/industryBaseStyle/update")
    public String update(IndustrialDevelopBasestyle baseStyle){
        this.industrialDevelopBasestyleService.updateByPrimaryKeySelective(baseStyle);
        return "";
    }
}
