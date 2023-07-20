package com.wallet.wallet.repositorie;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wallet.wallet.entities.FII;



public interface FIIRepositorie extends CrudRepository <FII, Long>{

    @Query("SELECT a FROM Acao a WHERE a.ticket = ?1")
     FII findByTicket(String ticket);
    
}
