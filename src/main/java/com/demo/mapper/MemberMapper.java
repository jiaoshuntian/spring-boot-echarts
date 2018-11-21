package com.demo.mapper;

import com.demo.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author JiaoShuntian
 * @date 2018/11/21
 */
@Mapper
public interface MemberMapper {
    List<Member> findAll();
}
