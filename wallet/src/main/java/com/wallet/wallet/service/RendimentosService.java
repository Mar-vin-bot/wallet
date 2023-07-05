package com.wallet.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.wallet.entities.Rendimentos;
import com.wallet.wallet.repositorie.RendimentosRepositorie;

@Service
public class RendimentosService {

    @Autowired
    private RendimentosRepositorie repo;
    
    public List<Rendimentos> findAllByRendimentos(String ticket){
        return repo.findByTicket(ticket);


    }


    

    
}
