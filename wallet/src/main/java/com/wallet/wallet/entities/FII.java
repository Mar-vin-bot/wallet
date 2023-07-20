package com.wallet.wallet.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "tb_FII")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class FII {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticker;
    private Double price;
    private Integer qtd_compra;
    private Date dt_operacao;
    private String buyOrSell;

    public FII(Long id, String ticker, Double price, Integer qtd_compra, Date dt_operacao, String buyOrSell) {
        this.id = id;
        this.ticker = ticker;
        this.price = price;
        this.qtd_compra = qtd_compra;
        this.dt_operacao = dt_operacao;
        this.buyOrSell = buyOrSell;
    }




}
