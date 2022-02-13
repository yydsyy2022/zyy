package com.lanqiao.zyy.controller;


import com.github.pagehelper.Page;
import com.lanqiao.zyy.domain.IndustrialDevelopTecSerOrg;
import com.lanqiao.zyy.service.IndustrialDevelopTecSerOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"tecSerOrgList"})
public class IndustrialDevelopTecSerOrgController {

    @Autowired
    IndustrialDevelopTecSerOrgService industrialDevelopTecSerOrgService;

    @GetMapping("/industryTecSerOrg")
    public String selectAll(IndustrialDevelopTecSerOrg tecSerOrg, Integer pageNum, Model model, HttpSession session){
        if (pageNum != null) {
            pageNum=1;
            session.setAttribute("tecSerOgr",tecSerOrg);
        }else {
            tecSerOrg= (IndustrialDevelopTecSerOrg) session.getAttribute("tecSerOgr");
        }
        Page<IndustrialDevelopTecSerOrg> tecSerOrgList=this.industrialDevelopTecSerOrgService.selectBySelective(tecSerOrg,pageNum,5);
        model.addAttribute("tecSerOrgList",tecSerOrgList);
        return "";
    }

    //用于修改时根据id查找返回数据
    @GetMapping("/industryTecSerOrg/query")
    public String selectByPrimaryKey(Long id){
        IndustrialDevelopTecSerOrg tecSerOrg = this.industrialDevelopTecSerOrgService.selectByPrimaryKey(id);
        return "/update";
    }

    @GetMapping("/industryTecSerOrg/insert")
    public String insert(IndustrialDevelopTecSerOrg tecSerOrg){
        this.industrialDevelopTecSerOrgService.insert(tecSerOrg);
        return "";
    }

    @GetMapping("/industryTecSerOrg/delete")
    public String delete(Long id){
        this.industrialDevelopTecSerOrgService.deleteByPrimaryKey(id);
        return "";
    }

    @PostMapping("/industryTecSerOrg/update")
    public String update(IndustrialDevelopTecSerOrg tecSerOrg){
        this.industrialDevelopTecSerOrgService.updateByPrimaryKeySelective(tecSerOrg);
        return "";
    }
}
