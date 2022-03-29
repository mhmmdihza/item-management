package com.item.management.client;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.item.management.client.entity.Stock;


@Service
public interface StockRepo extends JpaRepository<Stock, String> {

	List<Stock> findByitemid(String itemid);
}