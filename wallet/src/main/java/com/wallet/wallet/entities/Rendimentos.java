package com.wallet.wallet.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_rendimentos")
public class Rendimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ticket;
    private String typeOfIncome;
    private String typeOfAtivo;
    private Double valueIncome;
    private Date dateOfPayment;


    public Rendimentos(Integer id, String ticket, String typeOfIncome, String typeOfAtivo, Double valueIncome, Date dateOfPayment) {
        this.id = id;
        this.ticket = ticket;
        this.typeOfIncome = typeOfIncome;
        this.typeOfAtivo = typeOfAtivo;
        this.valueIncome = valueIncome;
        this.dateOfPayment = dateOfPayment;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicket() {
        return this.ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getTypeOfIncome() {
        return this.typeOfIncome;
    }

    public void setTypeOfIncome(String typeOfIncome) {
        this.typeOfIncome = typeOfIncome;
    }

    public String getTypeOfAtivo() {
        return this.typeOfAtivo;
    }

    public void setTypeOfAtivo(String typeOfAtivo) {
        this.typeOfAtivo = typeOfAtivo;
    }

    public Double getValueIncome() {
        return this.valueIncome;
    }

    public void setValueIncome(Double valueIncome) {
        this.valueIncome = valueIncome;
    }

    public Date getDateOfPayment() {
        return this.dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }


    
}
