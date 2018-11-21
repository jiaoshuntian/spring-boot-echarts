package com.demo.service.Impl;

import com.demo.mapper.MemberMapper;
import com.demo.model.Member;
import com.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JiaoShuntian
 * @date 2018/11/21
 */
@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }
}
