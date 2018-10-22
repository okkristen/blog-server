package com.okkristen.blogserver.common.service.impl;

import com.okkristen.blogserver.common.dao.CommonRepository;
import com.okkristen.blogserver.common.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

public class CommonServiceImpl<E,D> implements CommonService<E,D> {

//    @Autowired
//    CommonRepository<E,String> commonRepository;
//
//    public void setRepository(CommonRepository<E,String> commonRepository) {
//        this.commonRepository = commonRepository;
//    }

    @Override
    public boolean existsById(String id) {
        return false;
    }

    @Override
    public E findById(String id) {
        return null;
    }

    @Override
    public D findDTOById(String id) {
        return null;
    }

    @Override
    public <T> T findDTOById(String id, Class<T> dtoClass) {
        return null;
    }

    @Override
    public List<D> findByDTO(D dto) {
        return null;
    }

    @Override
    public List<D> findByDTO(D dto, boolean accurateQuery) {
        return null;
    }

    @Override
    public <T> List<T> findByDTO(T dto, Class<T> dtoClass) {
        return null;
    }

    @Override
    public <T> List<T> findByDTO(T dto, Class<T> dtoClass, boolean accurateQuery) {
        return null;
    }

    @Override
    public List<D> findByDTO(D dto, Sort sort) {
        return null;
    }


    @Override
    public List<D> findByDTO(D dto, Sort sort, boolean accurateQuery) {
        return null;
    }

    @Override
    public <T> List<T> findByDTO(T dto, Sort sort, Class<T> dtoClass) {
        return null;
    }

    @Override
    public <T> List<T> findByDTO(T dto, Sort sort, Class<T> dtoClass, boolean accurateQuery) {
        return null;
    }

    @Override
    public Page<D> findByDTO(D dto, Pageable pageable) {
        return null;
    }

    @Override
    public Page<D> findByDTO(D dto, Pageable pageable, boolean accurateQuery) {
        return null;
    }

    @Override
    public <T> Page<T> findByDTO(T dto, Pageable pageable, Class<T> dtoClass) {
        return null;
    }

    @Override
    public <T> Page<T> findByDTO(T dto, Pageable pageable, Class<T> dtoClass, boolean accurateQuery) {
        return null;
    }

    @Override
    public E save(E entity) {
        return null;
    }

    @Override
    public D saveByDTO(D dto) {
        return null;
    }

    @Override
    public <T> T saveByDTO(T dto, Class<T> dtoClass) {
        return null;
    }

    @Override
    public List<E> save(List<E> list) {
        return null;
    }

    @Override
    public List<D> saveByDTO(List<D> list) {
        return null;
    }

    @Override
    public <T> List<T> saveByDTO(List<T> list, Class<T> dtoClass) {
        return null;
    }

    @Override
    public Integer update(E entity) {
        return null;
    }

    @Override
    public Integer update(List<E> list) {
        return null;
    }

    @Override
    public Integer updateByDTO(D dto) {
        return null;
    }

    @Override
    public <T> Integer updateByDTO(T dto, Class<T> dtoClass) {
        return null;
    }

    @Override
    public Integer updateByDTO(List<D> list) {
        return null;
    }

    @Override
    public <T> Integer updateByDTO(List<T> list, Class<T> dtoClass) {
        return null;
    }

    @Override
    public Integer delete(D dto) {
        return null;
    }

    @Override
    public Integer delete(List<D> list) {
        return null;
    }

    @Override
    public Integer delete(String id) {
        return null;
    }

    @Override
    public Integer deleteByIdArray(String[] ids) {
        return null;
    }

    @Override
    public Integer deleteByIdList(List<String> list) {
        return null;
    }

    @Override
    public E getEntity(D dto) {
        return null;
    }

    @Override
    public <T> E getEntityBySourceDTO(T dto) {
        return null;
    }

    @Override
    public List<E> getEntityList(List<D> dtoList) {
        return null;
    }

    @Override
    public <T> List<E> getEntityListBySourceDTO(List<T> dtoList) {
        return null;
    }

    @Override
    public D getDTO(E entity) {
        return null;
    }

    @Override
    public <T> T getDTO(E entity, Class<T> dtoClass) {
        return null;
    }

    @Override
    public List<D> getDTOList(List<E> entityList) {
        return null;
    }

    @Override
    public <T> List<T> getDTOList(List<E> entityList, Class<T> dtoClass) {
        return null;
    }

    @Override
    public Page<D> getDTOPage(Page<E> page, Pageable pageable) {
        return null;
    }

    @Override
    public <T> Page<T> getDTOPage(Page<E> page, Pageable pageable, Class<T> dtoClass) {
        return null;
    }
}
