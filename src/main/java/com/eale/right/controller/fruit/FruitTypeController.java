package com.eale.right.controller.fruit;

import com.eale.right.bean.FruitType;
import com.eale.right.service.FruitTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class FruitTypeController {

    @Autowired
    private FruitTypeService fruitTypeService;

    @RequestMapping("typeManager")
    public String typeManage(Model model) {

//        List<FruitType> types = (List<FruitType>) pdao.findAll();
        List<FruitType> types = fruitTypeService.findAll();

        model.addAttribute("types",types);

        return "fruit/TypeManage";
    }

    @RequestMapping(value = "findById" ,method = RequestMethod.GET)
    public String typeEditGet(@RequestParam(value = "typeId",required=false) Long typeId, Model model){
        if(typeId!=null){

            FruitType type = fruitTypeService.findById(typeId);
            model.addAttribute("types",type);
        }
        return "fruit/TypeEdit";
    }

    @RequestMapping(value = "saveType" ,method = RequestMethod.POST)
    public String typeEditPost(FruitType type,Model model){
        System.out.println(type);

        FruitType fruitType = fruitTypeService.save(type);

        if(fruitType!=null){
            model.addAttribute("success",1);
            return "typeManager";
        }

        model.addAttribute("errormess","数据插入失败");
        return "fruit/TypeEdit";
    }


    @RequestMapping("removeType")
    public String removetype(@RequestParam("typeId") Long typeId,Model model){
        fruitTypeService.delete(typeId);
        model.addAttribute("success",1);
        return "/typeManager";
    }




}
