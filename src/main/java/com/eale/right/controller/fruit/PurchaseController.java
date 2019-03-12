package com.eale.right.controller.fruit;

import com.eale.right.bean.FruitVarieties;
import com.eale.right.bean.Purchase;
import com.eale.right.service.FruitVarietiesService;
import com.eale.right.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private FruitVarietiesService fruitVarietiesService;

    @RequestMapping("purchaseManager")
    public String purchaseManage(Model model) {

        List<Purchase> purchases = purchaseService.findAll();

        model.addAttribute("purchases",purchases);

        return "fruit/PurchaseManager";
    }

    @RequestMapping(value = "findpurchaseById" ,method = RequestMethod.GET)
    public String purchaseEditGet(@RequestParam(value = "purchaseId",required=false) Long purchaseId, Model model){
        if(purchaseId!=null){

            Purchase purchase = purchaseService.findById(purchaseId);
            model.addAttribute("purchase",purchase);
        }

        List<FruitVarieties> varieties= fruitVarietiesService.findAll();

        model.addAttribute("varieties",varieties);
        return "fruit/PurchaseEdit";
    }

    @RequestMapping(value = "savepurchase" ,method = RequestMethod.POST)
    public String purchaseEditPost(Purchase purchase, Model model){
        System.out.println(purchase);

        Purchase purchase1 = purchaseService.save(purchase);

        if(purchase1!=null){
            model.addAttribute("success",1);
            return "purchaseManager";
        }

        model.addAttribute("errormess","数据插入失败");
        return "fruit/PurchaseEdit";
    }

    @RequestMapping("removepurchase")
    public String removepurchase(@RequestParam("purchaseId") Long purchaseId, Model model){
        purchaseService.delete(purchaseId);
        model.addAttribute("success",1);
        return "/purchaseManager";
    }
}
