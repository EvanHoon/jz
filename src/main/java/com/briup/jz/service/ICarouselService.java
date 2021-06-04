package com.briup.jz.service;

import com.briup.jz.bean.Carousel;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface ICarouselService {
    void saveOrUpdate(Carousel carousel) throws CustomerException;

    List<Carousel> findAll();

    Carousel findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
