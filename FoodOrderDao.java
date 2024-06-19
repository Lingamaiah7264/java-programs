package com.jsp.hotelmanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.hotelmanagement.FoodOrder;
@Repository
public class FoodOrderDao {
	@Autowired
	EntityManagerFactory emf;

	@Autowired
	EntityManager em;

	@Autowired
	EntityTransaction et;

	
	@RequestMapping("")
	public void saveFoodOrder(FoodOrder foodOrder) {
		et.begin();
		em.persist(foodOrder);
		et.commit();
	}

	public FoodOrder findById(int id) {
		return em.find(FoodOrder.class, id);
	}

	public void updateFoodOrder(FoodOrder foodOrder) {
		et.begin();
		em.merge(foodOrder);
		et.commit();
	}

	public void deleteByid(int id) {
		et.begin();
		em.remove(em.find(FoodOrder.class, id));
		et.commit();
	}
}

