package com.bharath.task.repository;

import java.util.List;

import com.bharath.task.entity.Menu;

public interface BillGeneratorRepository {

	public List<Menu> findAllMenuItems();
}
