package com.eale.right.service.impl;

import com.eale.right.bean.Supplier;
import com.eale.right.dao.SupplierDao;
import com.eale.right.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDao supplierDao;

    @Override
    public List<Supplier> findAll() {
        return supplierDao.findAll();
    }

    @Override
    public Supplier findById(Long supplierId) {
        return supplierDao.findById(supplierId).get();
    }

    @Override
    public Supplier save(Supplier supplier) {
        supplierDao.save(supplier);
        return supplierDao.findById(supplier.getSupplierId()).get();
    }

    @Override
    public void delete(Long supplierId) {
        supplierDao.deleteById(supplierId);
    }
}
