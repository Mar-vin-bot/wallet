package com.wallet.wallet.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class FII_DTO {

    private Long id;
    private String ticker;
    private Double pm;
    private Integer quantity;
    private Double totalIncome;
    
}






