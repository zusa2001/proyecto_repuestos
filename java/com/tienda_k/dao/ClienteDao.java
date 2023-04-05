package com.tienda_k.dao;

import com.tienda_k.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository <Cliente,Long> {
    
}
