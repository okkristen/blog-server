package com.okkristen.blogserver.common.dao.impl;

import com.okkristen.blogserver.common.dao.CommonRepository;
import com.okkristen.blogserver.common.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author fengw
 * @create 2016年11月16日
 * @param <E>
 * @param <ID>
 */
@Transactional
public  class CommonRepositoryImpl<E extends BaseEntity, ID extends Serializable>  extends SimpleJpaRepository<E, Serializable>
        implements CommonRepository<E, ID> {


    @SuppressWarnings("unused")
    private final EntityManager entityManager;

    public CommonRepositoryImpl(Class<E> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }

    public CommonRepositoryImpl(JpaEntityInformation<E, Serializable> information, EntityManager entityManager) {
        super(information, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public <S extends E> S save(S entity) {
        return super.save(entity);
    }

    /**
     * 只做逻辑删除
     */
    @Override
    public void delete(E entity) {
        entity.setDr(1);
        save(entity);
    }

    @Override
    public void deleteById(Serializable id) {
        Optional<E> optional = findById(id);
        E  entity = optional.get();
        entity.setDr(1);
        this.save(entity);
    }

}
