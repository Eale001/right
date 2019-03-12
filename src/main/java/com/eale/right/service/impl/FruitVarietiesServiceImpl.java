package com.eale.right.service.impl;

import com.eale.right.bean.FruitVarieties;
import com.eale.right.dao.FruitVarietiesDao;
import com.eale.right.service.FruitVarietiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FruitVarietiesServiceImpl implements FruitVarietiesService {

    @Autowired
    private FruitVarietiesDao fruitVarietiesDao;

    @Override
    public List<FruitVarieties> findAll() {
        return fruitVarietiesDao.findAll();
    }

    @Override
    public FruitVarieties findById(Long varietiesId) {
        return fruitVarietiesDao.findById(varietiesId).get();
    }

    @Override
    public FruitVarieties save(FruitVarieties varieties) {
        fruitVarietiesDao.save(varieties);
        return fruitVarietiesDao.findById(varieties.getVarietiesId()).get();
    }

    @Override
    public void delete(Long varietiesId) {
        fruitVarietiesDao.deleteById(varietiesId);
    }
}
