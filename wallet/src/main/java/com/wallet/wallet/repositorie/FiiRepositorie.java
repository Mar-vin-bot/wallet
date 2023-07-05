package com.wallet.wallet.repositorie;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wallet.wallet.entities.Fii;

@Repository
public interface FiiRepositorie extends CrudRepository <Fii, Integer>{

    @Query("SELECT a FROM Acao a WHERE a.ticket = ?1")
     Fii findByTicket(String ticket);
    
}
