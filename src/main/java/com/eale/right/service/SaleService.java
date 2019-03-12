package com.eale.right.service;

import com.eale.right.bean.Sale;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface SaleService {

    /**
     * 查询所有
     * @return
     */
    List<Sale> findAll();

    /**
     * 根据Id查询
     * @param saleId
     * @return
     */
    Sale findById(Long saleId);

    /**
     * 保存
     * @param sale
     * @return
     */
    Sale save(Sale sale);

    /**
     * 删除
     * @param saleId
     */
    void delete(Long saleId);
}
