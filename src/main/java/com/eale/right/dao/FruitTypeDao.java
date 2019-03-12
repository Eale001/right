package com.eale.right.dao;

import com.eale.right.bean.FruitType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitTypeDao extends JpaRepository<FruitType,Long> {
}
