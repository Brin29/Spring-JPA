package com.breiner.spring;

//Record
// Worked for represent request body
public record OrderRecord(
        String customerName,
        String productName,
        int quantity
) {

}
