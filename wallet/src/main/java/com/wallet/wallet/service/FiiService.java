package com.wallet.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.wallet.entities.FII;
import com.wallet.wallet.repositorie.FIIRepositorie;

@Service
public class FiiService {

    @Autowired
    private FIIRepositorie repo;

    public FII findByTicket(String ticket) {
        return repo.findByTicket(ticket);
    }

}
