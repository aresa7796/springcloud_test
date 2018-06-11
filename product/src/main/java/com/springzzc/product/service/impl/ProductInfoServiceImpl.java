package com.springzzc.product.service.impl;

import com.springzzc.product.model.dto.ProductInfo;
import com.springzzc.product.model.mapper.ProductInfoMapper;
import com.springzzc.product.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    public ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> findAllUpList() {
        return productInfoMapper.selectByStatus((byte) 0);
    }
}
