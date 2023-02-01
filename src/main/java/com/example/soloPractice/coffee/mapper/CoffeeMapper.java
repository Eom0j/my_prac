package com.example.soloPractice.coffee.mapper;

import com.example.soloPractice.coffee.dto.CoffeePatchDto;
import com.example.soloPractice.coffee.dto.CoffeePostDto;
import com.example.soloPractice.coffee.dto.CoffeeResponseDto;
import com.example.soloPractice.coffee.entity.Coffee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee);
}
