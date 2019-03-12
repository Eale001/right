package com.eale.right.service;

import com.eale.right.bean.Supplier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface SupplierService {

    /**
     * 查询所有
     * @return
     */
    List<Supplier> findAll();

    /**
     * 根据Id查询
     * @param supplierId
     * @return
     */
    Supplier findById(Long supplierId);

    /**
     * 保存
     * @param supplier
     * @return
     */
    Supplier save(Supplier supplier);

    /**
     * 删除
     * @param supplierId
     */
    void delete(Long supplierId);
}
