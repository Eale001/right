package com.eale.right.service;

import com.eale.right.bean.FruitType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface FruitTypeService {

    /**
     * 查找全部类型
     * @return
     */
    List<FruitType> findAll();

    /**
     * 根据Id查询
     * @param typeId
     * @return
     */
    FruitType findById(Long typeId);

    /**
     * 保存/新增
     * @param type
     * @return
     */
    FruitType save(FruitType type);

    /**
     * 根据Id删除
     * @param typeId
     */
    void delete(Long typeId);
}
