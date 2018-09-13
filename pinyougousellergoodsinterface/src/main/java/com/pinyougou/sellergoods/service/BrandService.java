package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

public interface BrandService {

    public List<TbBrand> findAll();

        /*
        * 品牌分页
        * pageNum:当前页码
        * pageSize：每页记录数
        * **/
    public PageResult findPage(int pageNum, int pageSize);



    /**
     * 增加
     * */
    public void add(TbBrand brand);


    /*
    * 查看
    * */
    public TbBrand findOne(Long id);

    /*
    * 修改
    * */
    public void update(TbBrand brand);

    /*
    * 删除
    * */
    public void delete(Long [] ids);

    /*
    * 模糊查询
    * */
    public PageResult findPage(TbBrand brand,int pageNum, int pageSize);
}
