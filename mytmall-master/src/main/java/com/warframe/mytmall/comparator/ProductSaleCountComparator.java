package com.warframe.mytmall.comparator;

import com.warframe.mytmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/10/10 16:06
 */
public class ProductSaleCountComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getSaleCount() - p1.getSaleCount();
    }
}
