package com.abri.tech.orderservice.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class RestaurantResponse {
    @ApiModelProperty(notes = "Message related to order status")
    private String message;
    @ApiModelProperty(notes = "All the orders placed by the customer")
    private List<OrderDetailsResponse> orderDetailsResponse;
}
