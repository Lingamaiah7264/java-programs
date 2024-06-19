package com.jsp.hotelmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.hotelmanagement.Product;
@Repository
public class ProductDao {
	@Autowired
	EntityManagerFactory emf;

	@Autowired
	EntityManager em;

	@Autowired
	EntityTransaction et;

	@RequestMapping("")
	public void saveProduct(Product product) {
		et.begin();
		em.persist(product);
		et.commit();
	}
	public Product findById(int id) {
		return em.find(Product.class, id);
	}

	public void updateProduct(Product product) {
		et.begin();
		em.merge(product);
		et.commit();
	}

	public void deleteByid(int id) {
		et.begin();
		em.remove(em.find(Product.class, id));
		et.commit();
	}

	public List<Product> findAllProducts(){
		Query query=em.createQuery("select p from Product p");
		List<Product> list=query.getResultList();
		return list;
	}
}
