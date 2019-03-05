package com.mwl.mshop.provider.cmc.model.bean;

import lombok.Data;

@Data
public class CmcCommodityCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.id
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.parent_id
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.name
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.level
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.commodity_count
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private Integer commodityCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.commodity_unit
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private String commodityUnit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.nav_status
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private Integer navStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.show_status
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.sort
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.icon
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.keywords
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cmc_commodity_category.description
     *
     * @mbg.generated Tue Mar 05 13:17:59 CST 2019
     */
    private String description;

}