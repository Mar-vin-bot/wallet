package com.wallet.wallet.entities;

import java.util.Date;

public class Acao extends Ativo {


        public Acao(Integer id, String ticket, String typeOperation, Double price, Integer amount, Date dateOperation) {
        super(id, ticket, typeOperation, price, amount, dateOperation);
        }
    
}