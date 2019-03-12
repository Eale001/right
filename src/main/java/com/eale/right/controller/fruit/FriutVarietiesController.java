package com.eale.right.controller.fruit;

import com.eale.right.bean.FruitType;
import com.eale.right.bean.FruitVarieties;
import com.eale.right.service.FruitTypeService;
import com.eale.right.service.FruitVarietiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class FriutVarietiesController {

    @Autowired
    private FruitVarietiesService fruitVarietiesService;

    @Autowired
    private FruitTypeService fruitTypeService;

    @RequestMapping("varietiesManager")
    public String varietiesManage(Model model) {

        List<FruitVarieties> varieties = fruitVarietiesService.findAll();

        model.addAttribute("varieties",varieties);

        return "fruit/VarietiesManager";
    }

    @RequestMapping(value = "findvarietiesById" ,method = RequestMethod.GET)
    public String varietiesEditGet(@RequestParam(value = "varietiesId",required=false) Long varietiesId, Model model){
        if(varietiesId!=null){

            FruitVarieties varieties = fruitVarietiesService.findById(varietiesId);
            FruitType type= fruitTypeService.findById(varieties.getTypeId().getTypeId());


            model.addAttribute("type",type);
            model.addAttribute("varieties",varieties);
        }
        List<FruitType> types= fruitTypeService.findAll();
        model.addAttribute("types",types);
        return "fruit/VarietiesEdit";
    }

    @RequestMapping(value = "saveVarieties" ,method = RequestMethod.POST)
    public String varietiesEditPost(FruitVarieties varieties, Model model){
        System.out.println(varieties);

        FruitVarieties fruitVarieties = fruitVarietiesService.save(varieties);

        if(fruitVarieties!=null){
            model.addAttribute("success",1);
            return "varietiesManager";
        }

        model.addAttribute("errormess","数据插入失败");
        return "fruit/VarietiesEdit";
    }

    @RequestMapping("removeVarieties")
    public String removeVarieties(@RequestParam("varietiesId") Long varietiesId,Model model){
        fruitVarietiesService.delete(varietiesId);
        model.addAttribute("success",1);
        return "/typeManager";
    }


}
