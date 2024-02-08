package com.academy.service;

public class PriceService {
  private DiscountService discountService;

  public PriceService(DiscountService discountService) {
    this.discountService = discountService;
  }

  public double price(int productId) {
    //get product from db
    //get price from db
    //get discount from server

    double discount;

    try {
      discount = discountService.discount(productId);
    } catch (RuntimeException e) {
      discount = new Double(0);
    }

    return 100 - discount;
  }
}
