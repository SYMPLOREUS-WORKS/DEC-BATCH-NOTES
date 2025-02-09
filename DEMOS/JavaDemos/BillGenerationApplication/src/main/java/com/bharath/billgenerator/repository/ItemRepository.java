package com.bharath.billgenerator.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bharath.billgenerator.entity.Item;

import jakarta.transaction.Transactional;

//public interface ItemRepository extends CrudRepository<Item, Long> {
public interface ItemRepository extends JpaRepository<Item, Long> {

//	@Query(value = "select * from item_details where name=:name",nativeQuery = true)
	@Query(value = "select * from item_details where name=:name", nativeQuery = true)
	Optional<Item> findByItemNAme(@Param(value = "name") String name);

	List<Item> findByPriceLessThan(Double price);

//	@Query(value="update item_details set category = ?1 where name= ?2", nativeQuery = true)
	@Query(value = "update Item set category = ?1 where itemName= ?2", nativeQuery = false)
	@Modifying

	@Transactional
	void updateCategoryByName(String categoryName, String itemName);
	// @Query(value = "update item_details set price=:price where name=:name",
	// nativeQuery = true)

	@Query(value = "update Item set price=:price where itemName=:name", nativeQuery = false)
	@Modifying
	@Transactional
	void updatePriceOfItem(@Param(value = "name") String name1, @Param(value = "price") Double price1);

	// Named query
	List<Item> findItemsBasedOnCategory(String category);

	// sorting
	List<Item> findByPriceOrderByPrice(Double price);
}
