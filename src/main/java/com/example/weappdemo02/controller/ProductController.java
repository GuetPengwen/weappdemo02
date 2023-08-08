package com.example.weappdemo02.controller;

import com.example.weappdemo02.common.ResponseData;
import com.example.weappdemo02.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liwei
 * @Date 2023/8/3 17:46
 * @Version 1.0
 */
@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/productList")
    public ResponseData productList() {
        // 获取到所有的商品
        return ResponseData.ok(productMapper.selectByExample(null));
    }

}
