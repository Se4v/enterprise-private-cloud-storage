package org.example.storagebackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.storagebackend.model.entity.OrgNode;

@Mapper
public interface OrgNodeMapper extends BaseMapper<OrgNode> {
}
