package com.dw.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.member.model.Member;

//JAP를 상속받는다.
//@Mapper라는 어노테이션을 사용 X
public interface MemberRepo extends JpaRepository<Member, Long>{
    //select * from dw_member where user_id = 'dw';
    Member findByuserId(String userId);

    // select * from dw_member where user_id = 'dw'; AND user_password = '123';
    Member findByIdAndUserPassword(String userId, String password);

    // select * from dw_member where name = '홍길동';
    Member fingById(String name);
}
