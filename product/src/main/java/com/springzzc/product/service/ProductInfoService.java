package com.springzzc.product.service;

import com.springzzc.product.model.dto.ProductInfo;

import java.util.List;

public interface ProductInfoService {
    List<ProductInfo> findAllUpList();
}
