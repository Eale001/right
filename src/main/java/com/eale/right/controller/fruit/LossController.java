package com.eale.right.controller.fruit;

import com.eale.right.bean.FruitVarieties;
import com.eale.right.bean.Loss;
import com.eale.right.service.FruitVarietiesService;
import com.eale.right.service.LossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class LossController {

    @Autowired
    private LossService lossService;

    @Autowired
    private FruitVarietiesService fruitVarietiesService;

    @RequestMapping("lossManager")
    public String lossManage(Model model) {

        List<Loss> losses = lossService.findAll();

        model.addAttribute("losses",losses);

        return "fruit/LossManager";
    }

    @RequestMapping(value = "findlossById" ,method = RequestMethod.GET)
    public String lossEditGet(@RequestParam(value = "lossId",required=false) Long lossId, Model model){
        if(lossId!=null){

            Loss loss = lossService.findById(lossId);
            FruitVarieties varieties=fruitVarietiesService.findById(loss.getVarieties().getVarietiesId());

            model.addAttribute("loss",loss);
            model.addAttribute("varieties",varieties);
        }

        List<FruitVarieties>  varietiesList=fruitVarietiesService.findAll();
        model.addAttribute("varietiesList",varietiesList);
        return "fruit/LossEdit";
    }

    @RequestMapping(value = "saveloss" ,method = RequestMethod.POST)
    public String lossEditPost(Loss loss, Model model){
        System.out.println(loss);

        Loss losses = lossService.save(loss);

        if(losses!=null){
            model.addAttribute("success",1);
            return "lossManager";
        }

        model.addAttribute("errormess","数据插入失败");
        return "fruit/LossEdit";
    }

    @RequestMapping("removeloss")
    public String removeloss(@RequestParam("lossId") Long lossId,Model model){
        lossService.delete(lossId);
        model.addAttribute("success",1);
        return "/lossManager";
    }

}
