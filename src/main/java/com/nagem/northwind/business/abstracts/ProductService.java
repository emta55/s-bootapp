package com.nagem.northwind.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.nagem.northwind.core.utilities.results.DataResult;
import com.nagem.northwind.core.utilities.results.Result;
import com.nagem.northwind.entities.concretes.Product;
import com.nagem.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAllSorted();
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	// ürünün isminde içeriyorsa...
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	// ürün ismi bunla başlıyorsa vb.
	
	DataResult<List<Product>> getByNameAndCategory(String productName,int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
