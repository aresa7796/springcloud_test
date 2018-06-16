package com.springzzc.product.service;

import com.springzzc.product.model.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceTest {
    @Autowired
    public ProductInfoService productInfoService;
    @Test
    public void findAllUpList() throws Exception {
        List<ProductInfo> list = productInfoService.findAllUpList();
        Assert.assertTrue(list.size() > 0);
    }

}