package com.ustglobal.stock.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stock.dto.Order;
import com.ustglobal.stock.dto.Product;
@Repository
public class ProductDAOImpl implements ProductDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Product product) {
	
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}//end of try-catch
		
	}//end of addProduct

	@Override
	public boolean updateProduct(Product product) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();

		try {
			transaction.begin();
			Product p = manager.find(Product.class, product.getId());
			p.setCategory(product.getCategory());
			p.setName(product.getName());
			p.setPrice(product.getPrice());
			p.setQuantity(product.getQuantity());
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}//end of try-catch
		
	}//end of updateProduct

	
	@Override
	public List<Product> getProductByCategory(String category) {
		
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where category=:category";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}//end of getProductByCatagory

	@Override
	public List<Product> getProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where company=:company";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("company", company);
		return typedQuery.getResultList();
	}

	@Override
	public List<Product> getAllProduct() {
		
		EntityManager manager=factory.createEntityManager();
		String jpql="from Product";
		TypedQuery<Product> typedQuery=manager.createQuery(jpql, Product.class);
		return typedQuery.getResultList();
	
	}//end of getAllProduct

	@Override
	public Product getProductByName(String name) {
			EntityManager manager=factory.createEntityManager();
			String jpql="from Product where name=:name";
			TypedQuery<Product> typedQuery=manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("name", name);
			Product product = typedQuery.getSingleResult();
			return product;
			
		}//end of getProductByName
	
	@Override
	public boolean generateBill(List<Product> beans, double total_price, double total_with_gst) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			for (Product productBean : beans) {
				Product bean= manager.find(Product.class, productBean.getId());
				int quantity = bean.getQuantity();
				bean.setQuantity(quantity-1);
				System.out.println(quantity);
			}
			Order Bean = new Order();
			Bean.setProductBeans(beans);
			
			manager.persist(Bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	}//end of ProductDAOImpl


