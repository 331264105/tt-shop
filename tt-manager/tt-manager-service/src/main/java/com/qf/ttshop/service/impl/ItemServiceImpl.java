package com.qf.ttshop.service.impl;

import com.qf.ttshop.dao.TbItemMapper;
import com.qf.ttshop.pojo.po.TbItem;
import com.qf.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getById(Long id) {

        return tbItemMapper.selectByPrimaryKey(id);
    }
}
