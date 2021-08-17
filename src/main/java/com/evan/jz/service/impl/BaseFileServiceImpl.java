package com.evan.jz.service.impl;

import com.evan.jz.bean.BaseFile;
import com.evan.jz.bean.BaseFileExample;
import com.evan.jz.dao.BaseFileMapper;
import com.evan.jz.service.IBaseFileService;
import com.evan.jz.utils.CustomerException;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:52
 */

@Service
public class BaseFileServiceImpl implements IBaseFileService {

    @Autowired
    private BaseFileMapper baseFileMapper;

    @Override
    public void save(String fileType, MultipartFile source) {

        String oldFileName = source.getOriginalFilename();
        String uniqueFilename = UUID.randomUUID().toString();
        String ext = FilenameUtils.getExtension(oldFileName);// jpg png jpeg

        List<String> nameList = Arrays.asList("jpg", "png", "jpeg", "PNG", "JPG");
        if (!nameList.contains(ext)) {
            throw new CustomerException("您的文件格式不符合规定 (.jpg .png .jpeg)");
        }
        String uniqueFilename2 = uniqueFilename + "." + ext;  // uuid.后缀

        //保存文件
        try {
            source.transferTo(new File("/root/" + uniqueFilename2));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BaseFile baseFile = new BaseFile();
        baseFile.setId(uniqueFilename);
        baseFile.setFileName(oldFileName);
        baseFile.setExtName("." + ext);
        baseFile.setFileSize(source.getSize());
        baseFile.setGroupName("groupName");
        baseFile.setUploadTime(new Date().getTime());
        baseFileMapper.insert(baseFile);
    }

    @Override
    public BaseFile findById(String id) {
        return baseFileMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BaseFile> findAll() {
        return baseFileMapper.selectByExample(new BaseFileExample());
    }

    @Override
    public void deleteById(String id) {
        if (baseFileMapper.selectByPrimaryKey(id) == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        baseFileMapper.deleteByPrimaryKey(id);
    }

}
