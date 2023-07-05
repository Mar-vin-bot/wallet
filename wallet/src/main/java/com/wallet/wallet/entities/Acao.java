package com.wallet.wallet.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_acao")
public class Acao extends Ativo {


        public Acao(Integer id, String ticket, String typeOperation, Double price, Integer amount, Date dateOperation) {
        super(id, ticket, typeOperation, price, amount, dateOperation);
        }
    
}
