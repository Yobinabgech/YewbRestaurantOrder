package com.abri.tech.orderservice.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsResponse {

    @ApiModelProperty(notes = "Customer who placed the order")
    private String customerName;
    @ApiModelProperty(notes = "Order placed")
    private String menuName;
}
