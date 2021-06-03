package com.briup.jz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.briup.jz.bean.Platform;
import com.briup.jz.bean.PlatformExample;
import com.briup.jz.dao.PlatformMapper;
import com.briup.jz.service.IPlatformService;
import com.briup.jz.utils.CustomerException;
@Service
public class PlatformServiceImpl implements IPlatformService{
	@Autowired
	private PlatformMapper platformMapper;

	@Override
	public void saveOrUpdate(Platform platform) throws CustomerException {
		if(platform.getId()==null) {
			platformMapper.insert(platform);
		}else {
			platformMapper.updateByPrimaryKey(platform);
		}
	}

	@Override
	public void deleteById(long id) throws CustomerException {
		Platform platform = platformMapper.selectByPrimaryKey(id);
		if(platform == null) {
			throw new CustomerException("要删除的分类信息不存在");
		}
		platformMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<Platform> findAll() {
		return platformMapper.selectByExample(new PlatformExample());
	}

	@Override
	public Platform findById(long id) {
		return platformMapper.selectByPrimaryKey(id);
	}
}
