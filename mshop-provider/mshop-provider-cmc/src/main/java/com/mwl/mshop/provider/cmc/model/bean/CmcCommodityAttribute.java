package com.mwl.mshop.provider.cmc.model.bean;

import lombok.Data;

/**
 * @author mawenlong
 * @date 2019/03/05
 * <p>
 * 商品属性：手机：颜色、容量、系统；服装：尺码、颜色
 */
@Data
public class CmcCommodityAttribute {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 商品属性分类id
     */
    private Long commodityAttributeCategoryId;

    /**
     * 名称
     */
    private String name;

    /**
     * 属性选择类型
     */
    private Integer selectType;

    /**
     * 属性录入方式
     */
    private Integer inputType;

    /**
     * 可选值列表，以"，"分割
     */
    private String inputList;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 分类筛选样式：1->普通；1->颜色
     */
    private Integer filterType;

    /**
     * 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     */
    private Integer searchType;

    /**
     * 相同属性产品是否关联；0->不关联；1->关联
     */
    private Integer relatedStatus;

    /**
     * 是否支持手动新增；0->不支持；1->支持
     */
    private Integer handAddStatus;

    /**
     * 属性的类型；0->规格；1->参数。不同规格价格不一样，参数一般不变
     */
    private Integer type;

}