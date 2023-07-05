package com.wallet.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.wallet.entities.Acao;
import com.wallet.wallet.repositorie.AcaoRepositorie;


@Service
public class AcaoService {

    @Autowired
    private AcaoRepositorie repo;

    public Acao findByTicket(String ticket){
        return repo.findByTicket(ticket);
    }
    
}
