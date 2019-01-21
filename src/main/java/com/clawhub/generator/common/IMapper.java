package com.clawhub.generator.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Mybatis通用Mapper接口
 *
 * @param <T> the type parameter
 */
public interface IMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

