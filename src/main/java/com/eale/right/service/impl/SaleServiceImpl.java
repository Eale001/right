package com.eale.right.service.impl;

import com.eale.right.bean.Sale;
import com.eale.right.dao.SaleDao;
import com.eale.right.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleDao saleDao;

    @Override
    public List<Sale> findAll() {
        return saleDao.findAll();
    }

    @Override
    public Sale findById(Long saleId) {
        return saleDao.findById(saleId).get();
    }

    @Override
    public Sale save(Sale sale) {
        saleDao.save(sale);
        return saleDao.findById(sale.getSaleId()).get();
    }

    @Override
    public void delete(Long saleId) {
        saleDao.deleteById(saleId);
    }
}
