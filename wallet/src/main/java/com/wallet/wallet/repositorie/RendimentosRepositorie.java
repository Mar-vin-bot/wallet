package com.wallet.wallet.repositorie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wallet.wallet.entities.Rendimentos;

@Repository
public interface RendimentosRepositorie extends JpaRepository <Rendimentos, Integer> {


    @Query("SELECT a FROM Acao a WHERE a.ticket = ?1")
     List<Rendimentos> findByTicket(String ticket);
    
}
