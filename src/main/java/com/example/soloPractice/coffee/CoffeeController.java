package com.example.soloPractice.coffee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/coffees", produces = MediaType.APPLICATION_JSON_VALUE)
public class CoffeeController {
    @PostMapping
    public String postCoffee(@RequestParam("engName") String engName,
                             @RequestParam("korName") String korName,
                             @RequestParam("price") int price) {
        System.out.println("# engName" + engName);
        System.out.println("# korName" + korName);
        System.out.println("# price" + price);

        return null;
    }

    @GetMapping("/{coffee-id}")
    public String getCoffee(@PathVariable("coffee-id") long coffeeId) {
        System.out.println("# coffeeId" + coffeeId);

        return null;
    }

    @GetMapping
    public String getCoffees() {
        System.out.println("# get Coffees");

        return null;
    }
}

//[기본] 응답 데이터에 ResponseEntity 적용 부터 시작하기
