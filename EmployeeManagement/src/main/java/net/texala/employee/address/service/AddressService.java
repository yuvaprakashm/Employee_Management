package net.texala.employee.address.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.texala.employee.address.model.Address;
import net.texala.employee.address.vo.AddressVo;

 

public interface AddressService {
	List<AddressVo> findAll();

	AddressVo save(AddressVo address);
	
	String deleteById(int addressId);
	
	AddressVo update(AddressVo addressVo,int addressId);
	
	AddressVo updatePatch(AddressVo addressVo,int addressId);
	
	AddressVo activateRecord(Integer addressId);
	
	AddressVo deactivateRecord(Integer addressId);
	
	Page<AddressVo> search(AddressVo addressVo, int pageNo, int pageSize, String sortBy);

	 

	 

	Page<AddressVo> searchRecords(int pageNo, int pageSize, String sortBy, String filterBy, String searchText);

	 
}