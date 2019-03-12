package com.eale.right.service;

import com.eale.right.bean.FruitVarieties;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface FruitVarietiesService {

    /**
     * 查询全部
     * @return
     */
    List<FruitVarieties> findAll();

    /**
     * 根据Id查询
     * @param varietiesId
     * @return
     */
    FruitVarieties findById(Long varietiesId);

    /**
     * 保存
     * @param varieties
     * @return
     */
    FruitVarieties save(FruitVarieties varieties);

    /**
     * 删除
     * @param varietiesId
     */
    void delete(Long varietiesId);
}
