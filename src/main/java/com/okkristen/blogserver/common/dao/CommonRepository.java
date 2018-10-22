package com.okkristen.blogserver.common.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * 暂时暂时
 */
@NoRepositoryBean
public interface CommonRepository<E, ID extends Serializable> extends
        CrudRepository<E, Serializable>, JpaRepository<E, Serializable> , JpaSpecificationExecutor<E>{

}

