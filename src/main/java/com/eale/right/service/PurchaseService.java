package com.eale.right.service;

import com.eale.right.bean.Purchase;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface PurchaseService {

    /**
     * 查询所有
     * @return
     */
    List<Purchase> findAll();

    /**
     * 根据Id查询
     * @param purchaseId
     * @return
     */
    Purchase findById(Long purchaseId);

    /**
     * 保存
     * @param purchase
     * @return
     */
    Purchase save(Purchase purchase);

    /**
     * 删除
     * @param purchaseId
     */
    void delete(Long purchaseId);
}
