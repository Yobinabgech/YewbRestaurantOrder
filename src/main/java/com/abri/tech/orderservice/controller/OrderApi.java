package com.abri.tech.orderservice.controller;

import com.abri.tech.orderservice.dto.RestaurantOrder;
import com.abri.tech.orderservice.response.OrderResponse;
import com.abri.tech.orderservice.response.RestaurantResponse;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/restaurant/v2")
@Tag(name="Restaurant order application")
@Api(tags = "Restaurant order application")
public interface OrderApi {
    @ApiOperation(value = "Create a new order for a customer")
    @ApiResponses(value = {@ApiResponse(code= 500, message = "Internal Server Error"),
            @ApiResponse(code= 200, message = "OK", response = String.class)})
    @PostMapping("/createOrder")
    ResponseEntity<OrderResponse> createNewOrder(@RequestBody RestaurantOrder restaurantOrder);

    @ApiOperation(value = "Get all orders placed in the restaurant")
    @ApiResponses(value = {@ApiResponse(code= 500, message = "Internal Server Error"),
            @ApiResponse(code= 200, message = "OK")})
    @GetMapping("/getAllOrder")
    ResponseEntity<RestaurantResponse> getAllOrder();

    @ApiOperation(value = "Get latest order placed by customer")
    @ApiResponses(value = {@ApiResponse(code= 500, message = "Internal Server Error"),
            @ApiResponse(code= 200, message = "OK")})
    @GetMapping("/getOrder")
    ResponseEntity<RestaurantResponse> getOrder(
            @ApiParam(value = "Customer name who placed the order", type = "String", required = true)
            @RequestParam(value= "customerName") String customerName);
}
