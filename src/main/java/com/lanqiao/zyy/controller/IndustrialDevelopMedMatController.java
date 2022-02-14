package com.lanqiao.zyy.controller;

import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopMedMat;
import com.lanqiao.zyy.service.IndustrialDevelopMedMatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;

@Controller
public class IndustrialDevelopMedMatController {


    @Autowired
    IndustrialDevelopMedMatService industrialDevelopMedMatService;

    @GetMapping("/industryMedMat")//根据条件查找
    public String selectBySelective(IndustrialDevelopMedMat medMat, Integer pageNum, Model model, HttpSession session){
        if (pageNum == null) {
            pageNum=1;
            session.setAttribute("medMat",medMat);
        }else {
            medMat= (IndustrialDevelopMedMat) session.getAttribute("baseStyle");
        }
        Page<IndustrialDevelopMedMat> medMatList=this.industrialDevelopMedMatService.selectBySelective(medMat,pageNum,5);
        model.addAttribute("medMatList",medMatList);
        return "";
    }

    //用于修改时根据id查找返回数据
    @GetMapping("/industryMedMat/query")
    public String selectByPrimaryKey(Integer id,String code){
        IndustrialDevelopMedMat medMat = this.industrialDevelopMedMatService.selectByPrimaryKey(id,code);
        return "/update";
    }

    @GetMapping("/industryMedMat/insert")
    public String insert(IndustrialDevelopMedMat baseStyle){
        this.industrialDevelopMedMatService.insert(baseStyle);
        return "";
    }

    @GetMapping("/industryMedMat/delete")
    public String delete(Integer id,String code){
        this.industrialDevelopMedMatService.deleteByPrimaryKey(id,code);
        return "";
    }

    @PostMapping("/industryMedMat/update")
    public String update(IndustrialDevelopMedMat baseStyle){
        this.industrialDevelopMedMatService.updateByPrimaryKeySelective(baseStyle);
        return "";
    }
}
