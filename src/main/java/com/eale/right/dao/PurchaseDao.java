package com.eale.right.dao;

import com.eale.right.bean.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseDao extends JpaRepository<Purchase,Long> {
}
