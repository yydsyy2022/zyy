package com.lanqiao.zyy.controller;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopChiMed;
import com.lanqiao.zyy.service.IndustrialDevelopChiMedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndustrialDevelopChiMedController {

    @Autowired
    IndustrialDevelopChiMedService industrialDevelopChiMedService;

    @GetMapping("/industryChiMed")//根据条件查找
    public String selectBySelective(IndustrialDevelopChiMed chiMed, Integer pageNum, Model model, HttpSession session){
        if (pageNum == null) {
            pageNum=1;
            session.setAttribute("chiMed",chiMed);
        }else {
            chiMed= (IndustrialDevelopChiMed) session.getAttribute("chiMed");
        }
        Page<IndustrialDevelopChiMed> chiMedList=this.industrialDevelopChiMedService.selectBySelective(chiMed,pageNum,5);
        model.addAttribute("chiMedList",chiMedList);
        return "";
    }

    //用于修改时根据id查找返回数据
    @GetMapping("/industryChiMed/query")
    public String selectByPrimaryKey(Integer id,String code){
        IndustrialDevelopChiMed chiMed = this.industrialDevelopChiMedService.selectByPrimaryKey(id,code);
        return "/update";
    }

    @GetMapping("/industryChiMed/insert")
    public String insert(IndustrialDevelopChiMed chiMed){
        this.industrialDevelopChiMedService.insert(chiMed);
        return "";
    }

    @GetMapping("/industryChiMed/delete")
    public String delete(Integer id,String code){
        this.industrialDevelopChiMedService.deleteByPrimaryKey(id,code);
        return "";
    }

    @PostMapping("/industryChiMed/update")
    public String update(IndustrialDevelopChiMed chiMed){
        this.industrialDevelopChiMedService.updateByPrimaryKeySelective(chiMed);
        return "";
    }
}
