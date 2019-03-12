package com.eale.right.controller.fruit;

import com.eale.right.bean.FruitVarieties;
import com.eale.right.bean.Sale;
import com.eale.right.service.FruitVarietiesService;
import com.eale.right.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @Autowired
    private FruitVarietiesService fruitVarietiesService;

    @RequestMapping("saleManager")
    public String saleManage(Model model) {

        List<Sale> sales = saleService.findAll();

        model.addAttribute("sales",sales);

        return "fruit/SaleManager";
    }

    @RequestMapping(value = "findsaleById" ,method = RequestMethod.GET)
    public String saleEditGet(@RequestParam(value = "saleId",required=false) Long saleId, Model model){
        if(saleId!=null){

            Sale sale = saleService.findById(saleId);
            model.addAttribute("sale",sale);
        }
        List<FruitVarieties> varieties = fruitVarietiesService.findAll();
        model.addAttribute("varieties",varieties);
        return "fruit/SaleEdit";
    }

    @RequestMapping(value = "saveSale" ,method = RequestMethod.POST)
    public String purchaseEditPost(Sale sale, Model model){
        System.out.println(sale);

        Sale sale1 = saleService.save(sale);


        if(sale1!=null){
            model.addAttribute("success",1);
            return "saleManager";
        }

        model.addAttribute("errormess","数据插入失败");
        return "fruit/SaleEdit";
    }

    @RequestMapping("removeSale")
    public String removepurchase(@RequestParam("saleId") Long saleId, Model model){
        saleService.delete(saleId);
        model.addAttribute("success",1);
        return "/saleManager";
    }


}
