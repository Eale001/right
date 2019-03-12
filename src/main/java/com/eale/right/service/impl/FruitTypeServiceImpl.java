package com.eale.right.service.impl;

import com.eale.right.bean.FruitType;
import com.eale.right.dao.FruitTypeDao;
import com.eale.right.service.FruitTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FruitTypeServiceImpl implements FruitTypeService {

    @Autowired
    private FruitTypeDao fruitTypeDao;

    @Override
    public List<FruitType> findAll() {
        return fruitTypeDao.findAll();
    }

    @Override
    public FruitType findById(Long typeId) {
        return fruitTypeDao.findById(typeId).get();
    }

    @Override
    public FruitType save(FruitType type) {
        fruitTypeDao.save(type);
        return fruitTypeDao.findById(type.getTypeId()).get();
    }

    @Override
    public void delete(Long typeId) {
        fruitTypeDao.deleteById(typeId);
    }
}
