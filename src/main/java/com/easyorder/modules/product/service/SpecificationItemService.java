/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.easyorder.modules.product.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.easyorder.modules.product.dao.SpecificationItemDao;
import com.easyorder.modules.product.entity.SpecificationItem;
import com.jeeplus.common.persistence.Page;
import com.jeeplus.common.service.CrudService;

/**
 * 商品规格Service
 * @author qiudequan
 * @version 2017-06-09
 */
@Service
@Transactional(readOnly = true)
public class SpecificationItemService extends CrudService<SpecificationItemDao, SpecificationItem> {

	public SpecificationItem get(String id) {
		return super.get(id);
	}
	
	public List<SpecificationItem> findList(SpecificationItem specificationItem) {
		return super.findList(specificationItem);
	}
	
	public Page<SpecificationItem> findPage(Page<SpecificationItem> page, SpecificationItem specificationItem) {
		return super.findPage(page, specificationItem);
	}
	
	@Transactional(readOnly = false)
	public void save(SpecificationItem specificationItem) {
		super.save(specificationItem);
	}
	
	@Transactional(readOnly = false)
	public void delete(SpecificationItem specificationItem) {
		super.delete(specificationItem);
	}
	
	public List<SpecificationItem> getByIds(String[] ids) {
		return dao.findByIds(ids);
	}
	
	
}