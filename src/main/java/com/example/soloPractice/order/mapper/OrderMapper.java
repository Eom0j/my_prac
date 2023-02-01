package com.example.soloPractice.order.mapper;

import com.example.soloPractice.order.dto.OrderPostDto;
import com.example.soloPractice.order.dto.OrderResponseDto;
import com.example.soloPractice.order.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order orderPostDtoToOrder (OrderPostDto orderPostDto);
    OrderResponseDto orderToResponseDto(Order order);
}
