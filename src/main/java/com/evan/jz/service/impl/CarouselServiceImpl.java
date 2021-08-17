package com.evan.jz.service.impl;

import com.evan.jz.bean.Carousel;
import com.evan.jz.bean.CarouselExample;
import com.evan.jz.dao.CarouselMapper;
import com.evan.jz.service.ICarouselService;
import com.evan.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImpl implements ICarouselService {
    @Autowired
    private CarouselMapper carouselMapper;

    @Override
    public void saveOrUpdate(Carousel carousel) throws CustomerException {
        if (carousel.getId() == null) {
            carouselMapper.insert(carousel);
        } else {
            carouselMapper.updateByPrimaryKey(carousel);
        }
    }

    @Override
    public void deleteById(Long id) throws CustomerException {
        Carousel carousel = carouselMapper.selectByPrimaryKey(id);
        if (carousel == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        carouselMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<Carousel> findAll() {
        return carouselMapper.selectByExample(new CarouselExample());
    }

    @Override
    public Carousel findById(Long id) {
        return carouselMapper.selectByPrimaryKey(id);
    }
}
