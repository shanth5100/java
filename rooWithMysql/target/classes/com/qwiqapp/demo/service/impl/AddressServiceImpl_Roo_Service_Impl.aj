// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.qwiqapp.demo.service.impl;

import com.qwiqapp.demo.model.Address;
import com.qwiqapp.demo.repository.AddressRepository;
import com.qwiqapp.demo.service.impl.AddressServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect AddressServiceImpl_Roo_Service_Impl {
    
    declare @type: AddressServiceImpl: @Service;
    
    declare @type: AddressServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private AddressRepository AddressServiceImpl.addressRepository;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param addressRepository
     */
    @Autowired
    public AddressServiceImpl.new(AddressRepository addressRepository) {
        setAddressRepository(addressRepository);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return AddressRepository
     */
    public AddressRepository AddressServiceImpl.getAddressRepository() {
        return addressRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param addressRepository
     */
    public void AddressServiceImpl.setAddressRepository(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param address
     * @return Map
     */
    public Map<String, List<MessageI18n>> AddressServiceImpl.validate(Address address) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param address
     */
    @Transactional
    public void AddressServiceImpl.delete(Address address) {
        getAddressRepository().delete(address);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<Address> AddressServiceImpl.save(Iterable<Address> entities) {
        return getAddressRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void AddressServiceImpl.delete(Iterable<Long> ids) {
        List<Address> toDelete = getAddressRepository().findAll(ids);
        getAddressRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return Address
     */
    @Transactional
    public Address AddressServiceImpl.save(Address entity) {
        return getAddressRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Address
     */
    public Address AddressServiceImpl.findOne(Long id) {
        return getAddressRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Address
     */
    public Address AddressServiceImpl.findOneForUpdate(Long id) {
        return getAddressRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<Address> AddressServiceImpl.findAll(Iterable<Long> ids) {
        return getAddressRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<Address> AddressServiceImpl.findAll() {
        return getAddressRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long AddressServiceImpl.count() {
        return getAddressRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Address> AddressServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getAddressRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Address> AddressServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getAddressRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Address> AddressServiceImpl.getEntityType() {
        return Address.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> AddressServiceImpl.getIdType() {
        return Long.class;
    }
    
}
