package com.briup.jz.service;

import java.util.List;

import com.briup.jz.bean.Carousel;
import com.briup.jz.utils.CustomerException;

public interface CarouselService {
void saveOrUpdate(Carousel carousel) throws CustomerException;
	
	List<Carousel> findAll();
	
	Carousel findById(long id);
	
	void deleteById(long id) throws CustomerException;
}
