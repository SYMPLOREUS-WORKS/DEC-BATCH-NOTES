package com.bharath.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.main.repository.BillGeneratorRepository;

@Service("oldService")
public class BillGeneratorServiceImpl implements BillGeneratorService {

	private BillGeneratorRepository billGeneratorRepository;

	@Autowired
	public BillGeneratorServiceImpl(BillGeneratorRepository billGeneratorRepository) {
		super();
		System.out.println("repo constructor called ");
		this.billGeneratorRepository = billGeneratorRepository;
	}

	@Override
	public void viewMenu() {
		System.out.println("service viewMenu() ,calling repo");
		billGeneratorRepository.viewMenu();
	}

	@Override
	public void addItemMenu() {
		System.out.println("add item from old impl");
		
	}

}
