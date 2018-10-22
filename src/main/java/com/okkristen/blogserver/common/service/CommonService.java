package com.okkristen.blogserver.common.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.util.List;

public interface CommonService<E,D> {

    /**
     * 根据ID判断该数据是否存在
     * @param id
     * @return
     */
    boolean existsById(String id);

    /**
     * 根据ID查找对象
     *
     * @param id
     * @return
     * @author OKkristen
     * @create 2016年11月17日
     */
    E findById(String id);

    /**
     * 根据ID查找DTO对象
     *
     * @param id
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    D findDTOById(String id);

    /**
     * 根据ID查找指定类型DTO对象
     *
     * @param id
     * @return
     */
    <T> T findDTOById(String id, Class<T> dtoClass);

    /**
     * 根据DTO中有值的自动查询，并将结果转换为DTO
     * 模糊查询
     *
     * @param dto
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    List<D> findByDTO(D dto);

    /**
     * 根据DTO中有值的自动查询，并将结果转换为DTO
     *
     * @param dto
     * @param accurateQuery 是否精确查找
     * @return
     * @author OKkristen
     * @create 2017年1月18日
     */
    List<D> findByDTO(D dto, boolean accurateQuery);

    /**
     * 根据DTO中有值的自动查询，并将结果转换为指定类型DTO
     *
     * @param dto
     * @param dtoClass
     * @return
     */
    <T> List<T> findByDTO(T dto, Class<T> dtoClass);

    /**
     * 根据DTO中有值的自动查询，并将结果转换为指定类型DTO
     *
     * @param dto
     * @param dtoClass
     * @param accurateQuery 是否精确查找
     * @return
     */
    <T> List<T> findByDTO(T dto, Class<T> dtoClass, boolean accurateQuery);

    /**
     * 根据DTO中有值的字段进行查询并排序
     *
     * @param dto
     * @param sort
     * @return List<D>
     * @author OKkristen
     * @create 2017年2月7日
     */
    List<D> findByDTO(D dto, Sort sort);

    /**
     * 根据DTO中有值的字段进行查询并排序
     *
     * @param dto
     * @param sort
     * @param accurateQuery 是否精确查找
     * @return List<D>
     * @author OKkristen
     * @create 2017年2月7日
     */
    List<D> findByDTO(D dto, Sort sort, boolean accurateQuery);

    /**
     * 根据DTO中有值的字段查询并排序，并将结果转换为指定类型DTO
     *
     * @param dto
     * @param sort
     * @param dtoClass
     * @return List<T>
     * @author OKkristen
     * @create 2017年2月7日
     */
    <T> List<T> findByDTO(T dto, Sort sort, Class<T> dtoClass);

    /**
     * 根据DTO中有值的字段查询并排序，并将结果转换为指定类型DTO
     *
     * @param dto
     * @param sort
     * @param dtoClass
     * @param accurateQuery 是否精确查找
     * @return
     * @author OKkristen
     * @create 2017年2月7日
     */
    <T> List<T> findByDTO(T dto, Sort sort, Class<T> dtoClass, boolean accurateQuery);

    /**
     * 根据DTO中有值的字段查询，并将结果转换为DTO
     *
     * @param dto
     * @param pageable
     * @return Page<D>
     * @author OKkristen
     * @create 2016年12月30日
     */
    Page<D> findByDTO(D dto, Pageable pageable);

    /**
     * 根据DTO中有值的字段查询，并将结果转换为DTO
     *
     * @param dto
     * @param pageable
     * @param accurateQuery 是否精确查找
     * @return Page<D>
     * @author OKkristen
     * @create 2016年12月30日
     */
    Page<D> findByDTO(D dto, Pageable pageable, boolean accurateQuery);

    /**
     * 根据DTO中有值的字段查询，并将结果转换为指定类型DTO
     *
     * @param dto
     * @param pageable
     * @param dtoClass
     * @return Page<T>
     */
    <T> Page<T> findByDTO(T dto, Pageable pageable, Class<T> dtoClass);

    /**
     * 根据DTO中有值的字段查询，并将结果转换为指定类型DTO
     *
     * @param dto
     * @param pageable
     * @param dtoClass
     * @param accurateQuery 是否精确查找
     * @return
     */
    <T> Page<T> findByDTO(T dto, Pageable pageable, Class<T> dtoClass, boolean accurateQuery);

    /**
     * 保存实体类至数据库
     *
     * @param entity
     * @return
     * @author OKkristen
     * @create 2016年11月17日
     */
    @Transactional
    E save(E entity);

    /**
     * 根据DTO保存至数据库
     *
     * @param dto
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    @Transactional
    D saveByDTO(D dto);

    /**
     * 根据指定DTO保存至数据库
     *
     * @param dto
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    <T> T saveByDTO(T dto, Class<T> dtoClass);

    /**
     * 批量保存实体类至数据库
     *
     * @param list
     * @return
     * @author OKkristen
     * @create 2016年11月17日
     */
    @Transactional
    List<E> save(List<E> list);

    /**
     * 批量保存DTO至数据库
     *
     * @param list
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    @Transactional
    List<D> saveByDTO(List<D> list);

    /**
     * 批量保存指定DTO至数据库
     *
     * @param list
     * @param dtoClass
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    <T> List<T> saveByDTO(List<T> list, Class<T> dtoClass);

    /**
     * 更新实体至数据库
     * @param entity
     * @return
     */
    Integer update(E entity);
    /**
     * 批量更新实体至数据库
     * @param list
     * @return
     */
    Integer update(List<E> list);
    /**
     * 由DTO更新实体至数据库
     *
     * @param dto
     * @return
     * @author OKkristen
     * @create 2016年12月28日
     */
    @Transactional
    Integer updateByDTO(D dto);

    /**
     * 由指定DTO更新实体至数据库
     *
     * @param dto
     * @param dtoClass
     * @return
     * @author OKkristen
     * @create 2016年12月28日
     */
    <T> Integer updateByDTO(T dto, Class<T> dtoClass);

    /**
     * 由DTO List批量更新实体至数据库
     *
     * @param list
     * @return
     * @author OKkristen
     * @create 2016年12月28日
     */
    @Transactional
    Integer updateByDTO(List<D> list);

    /**
     * 由指定DTO List批量更新实体至数据库
     *
     * @param list
     * @param dtoClass
     * @return
     * @author OKkristen
     * @create 2016年12月28日
     */
    <T> Integer updateByDTO(List<T> list, Class<T> dtoClass);

    /**
     * 根据实体删除相应数据
     *
     * @return
     * @author OKkristen
     * @create 2016年11月17日
     */
    @Transactional
    Integer delete(D dto);

    /**
     * 根据实体批量删除相应数据
     *
     * @param list
     * @return
     * @author OKkristen
     * @create 2016年11月17日
     */
    @Transactional
    Integer delete(List<D> list);

    /**
     * 根据数据ID删除相应数据
     *
     * @param id
     * @return
     * @author OKkristen
     * @create 2016年11月17日
     */
    @Transactional
    Integer delete(String id);

    /**
     * 根据数据ID批量删除相应数据
     *
     * @param ids
     * @return
     * @author OKkristen
     * @create 2016年11月17日
     */
    @Transactional
    Integer deleteByIdArray(String[] ids);

    /**
     * 根据数据ID批量删除相应数据
     *
     * @param list
     * @return
     * @author OKkristen
     * @create 2016年11月17日
     */
    @Transactional
    Integer deleteByIdList(List<String> list);

    /**
     * DTO转Entity
     *
     * @param dto
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    E getEntity(D dto);

    /**
     * 指定类型DTO转Entity
     *
     * @param dto
     * @return
     */
    <T> E getEntityBySourceDTO(T dto);

    /**
     * DTO list转Entity list
     *
     * @param dtoList
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    List<E> getEntityList(List<D> dtoList);

    /**
     * 指定类型DTO list转Entity list
     *
     * @param dtoList
     * @return
     */
    <T> List<E> getEntityListBySourceDTO(List<T> dtoList);

    /**
     * Entity转DTO
     *
     * @param entity
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    D getDTO(E entity);

    /**
     * Entity转指定类型DTO
     *
     * @param entity
     * @param dtoClass
     * @return
     */
    <T> T getDTO(E entity, Class<T> dtoClass);

    /**
     * Entity List 转 DTO list
     *
     * @param entityList
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    List<D> getDTOList(List<E> entityList);

    /**
     * Entity List 转指定类型 DTO List
     *
     * @param entityList
     * @param dtoClass
     * @return
     */
    <T> List<T> getDTOList(List<E> entityList, Class<T> dtoClass);

    /**
     * Entity Page转DTO Page
     *
     * @param page
     * @return
     * @author OKkristen
     * @create 2016年12月30日
     */
    Page<D> getDTOPage(Page<E> page, Pageable pageable);

    /**
     * 获取指定DTO类型的Page
     *
     * @param page
     * @param pageable
     * @param dtoClass
     * @return
     */
    <T> Page<T> getDTOPage(Page<E> page, Pageable pageable, Class<T> dtoClass);


}
