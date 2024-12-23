package com.example.demo.domain.member.repository;

import com.example.demo.domain.member.entity.MemberEntity;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.demo.domain.member.entity.QMemberEntity.memberEntity;

@RequiredArgsConstructor
public class QMemberRepositoryImpl implements QMemberRepository{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Page<MemberEntity> pagingMember(Pageable pageable) {
        List<MemberEntity> fetch = jpaQueryFactory
                .selectFrom(memberEntity)
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetch();

        JPQLQuery<MemberEntity> count = jpaQueryFactory.select(memberEntity).from(memberEntity);
        return PageableExecutionUtils.getPage(fetch,pageable,count::fetchCount);
    }
}
