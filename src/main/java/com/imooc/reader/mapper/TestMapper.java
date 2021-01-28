package com.imooc.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.reader.entity.Test;

// BaseMapper<Test> 其中Test指的是entity中的Test实体
public interface TestMapper extends BaseMapper<Test> {
    public void insertSample();

}
