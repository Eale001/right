package com.eale.right.service.impl;

import com.eale.right.bean.Purchase;
import com.eale.right.dao.PurchaseDao;
import com.eale.right.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseDao purchaseDao;

    @Override
    public List<Purchase> findAll() {
        return purchaseDao.findAll();
    }

    @Override
    public Purchase findById(Long purchaseId) {
        return purchaseDao.findById(purchaseId).get();
    }

    @Override
    public Purchase save(Purchase purchase) {
        purchaseDao.save(purchase);
        return purchaseDao.findById(purchase.getPurchaseId()).get();
    }

    @Override
    public void delete(Long purchaseId) {
        purchaseDao.deleteById(purchaseId);
    }
}
