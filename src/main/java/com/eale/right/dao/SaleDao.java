package com.eale.right.dao;

import com.eale.right.bean.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleDao extends JpaRepository<Sale,Long> {
}
