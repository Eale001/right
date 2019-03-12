package com.eale.right.controller.fruit;

import com.eale.right.bean.Supplier;
import com.eale.right.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @RequestMapping("supplierManager")
    public String supplierManage(Model model) {

        List<Supplier> suppliers = supplierService.findAll();

        model.addAttribute("suppliers",suppliers);

        return "fruit/SupplierManager";
    }

    @RequestMapping(value = "findSupplierById" ,method = RequestMethod.GET)
    public String supplierEditGet(@RequestParam(value = "supplierId",required=false) Long supplierId, Model model){
        if(supplierId!=null){

            Supplier supplier = supplierService.findById(supplierId);
            model.addAttribute("supplier",supplier);
        }
        return "fruit/SupplierEdit";
    }

    @RequestMapping(value = "saveSupplier" ,method = RequestMethod.POST)
    public String supplierEditPost(Supplier supplier, Model model){
        System.out.println(supplier);

        Supplier supplier1 = supplierService.save(supplier);

        if(supplier1!=null){
            model.addAttribute("success",1);
            return "supplierManager";
        }

        model.addAttribute("errormess","数据插入失败");
        return "fruit/SupplierEdit";
    }

    @RequestMapping("removeSupplier")
    public String removeSupplier(@RequestParam("supplierId") Long supplierId, Model model){
        supplierService.delete(supplierId);
        model.addAttribute("success",1);
        return "/purchaseManager";
    }
}
