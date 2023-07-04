package com.wallet.wallet.repositorie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wallet.wallet.entities.Acao;

@Repository
public interface AcaoRepositorie extends CrudRepository <Acao, Integer> {
    
}
