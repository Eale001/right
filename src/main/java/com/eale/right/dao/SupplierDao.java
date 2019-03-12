package com.eale.right.dao;

import com.eale.right.bean.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDao extends JpaRepository<Supplier,Long> {
}
