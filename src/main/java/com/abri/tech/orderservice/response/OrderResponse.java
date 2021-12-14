package com.abri.tech.orderservice.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class OrderResponse {
    @NonNull
    @ApiModelProperty(notes = "The order id for the customer's order")
    private Long orderId;
    @NonNull
    @ApiModelProperty(notes = "The order details")
    private String orderDetails;
}
