package com.wallet.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.wallet.entities.Fii;
import com.wallet.wallet.repositorie.FiiRepositorie;

@Service
public class FiiService {

    @Autowired
    private FiiRepositorie repo;

    @Autowired
    private Fii fii;

    public Fii findByTicket(String ticket) {
        return repo.findByTicket(ticket);
    }

}
