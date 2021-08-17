package com.evan.jz.service;

import com.evan.jz.bean.Carousel;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface ICarouselService {
    void saveOrUpdate(Carousel carousel) throws CustomerException;

    List<Carousel> findAll();

    Carousel findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
