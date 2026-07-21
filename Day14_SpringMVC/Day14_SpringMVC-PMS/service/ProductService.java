package com.coforge.pms.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.coforge.pms.model.Product;

@Service
public class ProductService {

	private Map<Integer,Product> map = new HashMap<>();
	
	public boolean createProduct(Product product) {
		
		if(map.containsKey(product.getPid())) {
			return false;
		}else {
			map.put(product.getPid(),product);
			return true;
		}
		
	}

	public boolean updateProduct(Product product) {
		
		if(map.containsKey(product.getPid())) {
			map.put(product.getPid(), product);
			return true;
		}
		return false;
	}

	public boolean deleteProduct(int pid) {
		if(map.containsKey(pid)) {
			map.remove(pid);
			return true;
		}
		return false;
	}

	public Product findProduct(int pid) {
		
		if(map.containsKey(pid)) {
			return map.get(pid);
		}else {
			return null;
		}
	
	}

	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<>();
		
		for(int i:map.keySet()) {
			products.add(map.get(i));
		}
		return products;
	}

	
}
