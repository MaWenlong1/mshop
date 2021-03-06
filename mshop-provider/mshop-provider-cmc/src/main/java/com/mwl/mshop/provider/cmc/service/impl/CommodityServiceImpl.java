package com.mwl.mshop.provider.cmc.service.impl;

import com.github.pagehelper.PageHelper;
import com.mwl.mshop.provider.cmc.mapper.CmcBrandMapper;
import com.mwl.mshop.provider.cmc.mapper.CmcCommodityMapper;
import com.mwl.mshop.provider.cmc.model.bean.CmcBrand;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodity;
import com.mwl.mshop.provider.cmc.model.bean.CmcCommodityExample;
import com.mwl.mshop.provider.cmc.model.vo.CommodityVO;
import com.mwl.mshop.provider.cmc.model.vo.PageResult;
import com.mwl.mshop.provider.cmc.service.CommodityService;
import com.mwl.mshop.provider.cmc.utils.PageUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mawenlong
 * @date 2019-03-10 15:06
 */
@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CmcCommodityMapper commodityMapper;
    @Autowired
    private CmcBrandMapper brandMapper;

    @Override
    public PageResult list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<CmcCommodity> res = commodityMapper.selectByExample(new CmcCommodityExample());
        PageResult pageResult = PageUtils.convertPageData(res);
        List<CommodityVO> result = new ArrayList<>();
        for (CmcCommodity cmcCommodity : res) {
            CommodityVO tmp = new CommodityVO();
            BeanUtils.copyProperties(cmcCommodity, tmp);
            CmcBrand brand = brandMapper.selectByPrimaryKey(tmp.getBrandId());
            if (brand != null) {
                tmp.setBrandName(brand.getName());
            } else {
                tmp.setBrandName("无");
            }
            result.add(tmp);
        }
        pageResult.setList(result);
        return pageResult;
    }

    @Override
    public boolean create(CommodityVO commodityVO) {
        CmcCommodity commodity = new CmcCommodity();
        BeanUtils.copyProperties(commodityVO, commodity);
        return commodityMapper.insert(commodity) == 1;
    }

    @Override
    public boolean update(Long id, CommodityVO commodityVO) {
        CmcCommodity commodity = new CmcCommodity();
        BeanUtils.copyProperties(commodityVO, commodity);
        commodity.setId(id);
        return commodityMapper.updateByPrimaryKeySelective(commodity) == 1;
    }
}
