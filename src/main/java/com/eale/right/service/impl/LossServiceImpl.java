package com.eale.right.service.impl;

import com.eale.right.bean.Loss;
import com.eale.right.dao.LossDao;
import com.eale.right.service.LossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LossServiceImpl implements LossService {

    @Autowired
    private LossDao lossDao;

    @Override
    public List<Loss> findAll() {
        return lossDao.findAll();
    }

    @Override
    public Loss findById(Long lossId) {
        return lossDao.findById(lossId).get();
    }

    @Override
    public Loss save(Loss loss) {
        lossDao.save(loss);
        return lossDao.findById(loss.getLossId()).get();
    }

    @Override
    public void delete(Long lossId) {
        lossDao.deleteById(lossId);
    }
}
