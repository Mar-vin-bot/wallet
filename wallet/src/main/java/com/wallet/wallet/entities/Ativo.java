package com.wallet.wallet.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ativo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Ativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ticket;
    private String typeOperation;
    private Double price;
    private Integer amount;
    private Date dateOperation;

    @OneToMany
    private Rendimentos rendimentos;


    public Ativo() {
    }


    public Ativo(Integer id, String ticket, String typeOperation, Double price, Integer amount, Date dateOperation) {
        this.id = id;
        this.ticket = ticket;
        this.typeOperation = typeOperation;
        this.price = price;
        this.amount = amount;
        this.dateOperation = dateOperation;
    }



    public String getTicket() {
        return this.ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getTypeOperation() {
        return this.typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getDateOperation() {
        return this.dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    
}