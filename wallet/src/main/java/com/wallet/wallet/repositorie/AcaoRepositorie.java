package com.wallet.wallet.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.wallet.wallet.entities.Acao;


public interface AcaoRepositorie extends JpaRepository <Acao, Long> {

     @Query("SELECT a FROM Acao a WHERE a.ticket = ?1")
     Acao findByTicket(String ticket);
    
}
