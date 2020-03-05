package ar.com.fjs.springbatchdashboard.repository;

import java.util.List;

public interface BaseRepository<E> {
	List<E> findAll();
	
	E findById(int id);
}
