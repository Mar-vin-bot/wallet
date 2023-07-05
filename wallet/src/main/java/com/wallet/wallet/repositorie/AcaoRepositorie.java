package com.wallet.wallet.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wallet.wallet.entities.Acao;

@Repository
public interface AcaoRepositorie extends JpaRepository <Acao, Integer> {

     @Query("SELECT a FROM Acao a WHERE a.ticket = ?1")
     Acao findByTicket(String ticket);
    
}
