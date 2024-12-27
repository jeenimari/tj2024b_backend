package practice.kiosk.controller;


import java.util.ArrayList;

import practice.moedel.dao.ProductDao;
import practice.moedel.dto.ProductDto;

	public class ProductController { //class start
	    private static ProductController instance = new ProductController();

	    
	    private ProductController() { }
	    
	    public static ProductController getInstance() {
	        return instance;
	    }
	    
	  
	    
	    // 상품 목록 조회
	    public ArrayList<ProductDto> getList() {
	        return ProductDao.getInstance().printAll();
	    }
	    
	    // 특정 상품 조회
	    public ProductDto getProduct(int index) {
	        ArrayList<ProductDto> products = ProductDao.getInstance().printAll();
	        if(index >= 0 && index < products.size()) {
	            return products.get(index);
	        }
	        return null;
	    }
	    
	    // 상품 수정
	    public boolean update(int index, ProductDto newProduct) {
	        // 유효성 검사
	        if(newProduct.getPName() == null || newProduct.getPName().trim().isEmpty()) {
	            return false;
	        }
	        if(newProduct.getPrice() <= 0) {
	            return false;
	        }
	        if(index < 0 || index >= ProductDao.getInstance().printAll().size()) {
	            return false;
	        }
	        
	        return ProductDao.getInstance().update(index, newProduct);
	    }
	    
	    // 상품 삭제
	    public boolean delete(int index) {
	        if(index < 0 || index >= ProductDao.getInstance().printAll().size()) {
	            return false;
	        }
	        return ProductDao.getInstance().delete(index);
	    }
	    
	    // 상품의 총 개수
	    public int getCount() {
	        return ProductDao.getInstance().printAll().size();
	    }
	    
	    // 상품명 중복 체크
	    public boolean isProductNameDuplicate(String name) {
	        ArrayList<ProductDto> products = ProductDao.getInstance().printAll();
	        for(ProductDto product : products) {
	            if(product.getPName().equalsIgnoreCase(name)) {
	                return true;
	            }
	        }
	        return false;
	    }
	}//class end
