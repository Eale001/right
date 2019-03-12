package com.eale.right.service;

import com.eale.right.bean.Loss;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface LossService {

    /**
     * 查找所有
     * @return
     */
    List<Loss> findAll();

    /**
     * 根据Id查询
     * @param lossId
     * @return
     */
    Loss findById(Long lossId);

    /**
     * 保存
     * @param loss
     * @return
     */
    Loss save(Loss loss);

    /**
     * 根据ID删除
     * @param lossId
     */
    void delete(Long lossId);
}
