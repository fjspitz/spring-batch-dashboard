package ar.com.fjs.springbatchdashboard.service;

import java.util.List;

public interface BaseService<E> {

	List<E> findAll();
	
	E findById(int id);
}
