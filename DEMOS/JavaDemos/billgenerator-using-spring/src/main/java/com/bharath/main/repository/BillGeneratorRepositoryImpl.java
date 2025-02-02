package com.bharath.main.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BillGeneratorRepositoryImpl implements BillGeneratorRepository {

	public BillGeneratorRepositoryImpl() {
		super();
	System.out.println("repo constructor called");
	}

	@Override
	public void viewMenu() {
		System.out.println("doing db transaction");
	}

}
