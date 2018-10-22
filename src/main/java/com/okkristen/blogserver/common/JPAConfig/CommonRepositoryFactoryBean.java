package com.okkristen.blogserver.common.JPAConfig;

import com.okkristen.blogserver.common.dao.impl.CommonRepositoryImpl;
import com.okkristen.blogserver.common.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class CommonRepositoryFactoryBean<R extends JpaRepository<T, Serializable>, T> extends JpaRepositoryFactoryBean<R, T, Serializable> {

    public CommonRepositoryFactoryBean(Class<? extends R> repositoryInterface) {
        super(repositoryInterface);
    }

    @Override
    protected RepositoryFactorySupport createRepositoryFactory(final EntityManager entityManager) {
        return new JpaRepositoryFactory(entityManager) {

            protected SimpleJpaRepository<T, Serializable> getTargetRepository(
                    RepositoryInformation information, EntityManager entityManager) {
                Class<T> domainClass = (Class<T>) information.getDomainType();
                if(BaseEntity.class.isAssignableFrom(domainClass)) {
                    return new CommonRepositoryImpl(domainClass, entityManager);
                } else {
                    return new SimpleJpaRepository(domainClass, entityManager);
                }
            }
            @Override
            protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
                return metadata.getDomainType().isAssignableFrom(BaseEntity.class) ? CommonRepositoryImpl.class : SimpleJpaRepository.class;
            }
        };
    }
}