package com.dw.member.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.member.model.Member;
import com.dw.member.repository.MemberRepo;
import com.fasterxml.jackson.core.sym.Name;

//Rest == data 전달용!
@RestController
public class MemberController {

	@Autowired
	MemberRepo repo;

	@PostMapping("/api/v1/login")
	public boolean callLogin(@RequestBody Member member, HttpServletRequest request) {

		Member m = repo.findByIdAndUserPassword(member.getUserId(), member.getPassword());
		if (m != null){
			HttpSession session = request.getSession();//세션 호출(불러오기)
			session.addAttribute( "userId", m.getUserId());//세션에 사용자 아이디 저장
			System.out.println("이름은 : "+m.getName());
		}
		
		return true;
	}
	
	//전체 조회
	@GetMapping("/member")
	public List<Member> callAllMembers(){
		//findAll == select * from <테이블 이름>
		return repo.findAll();
	}
	
	//추가
	@PostMapping("/member")
	public Member callSaveMember(@RequestBody Member member) {
		//save == insert 
		member = repo.save(member);
		return member;
	}
	
	//삭제
	@DeleteMapping("/member/{id}")
	public boolean callDeleteMember(@PathVariable long id) {
		//deleteById == delete
		//By == where
		try {
			repo.deleteById(id); //리턴타입이 void
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	//상세 조회
	@GetMapping("/member/{id}")
	public Member callMemberById(@PathVariable long id) {
		//findById == select * from emp where empno = 333;
		return repo.findById(id).get();
	}
	
	//수정
	@PatchMapping("/member")
	public Member updateMember(@RequestBody Member member) {
		//save == update or insert
		//동일한 PK 값이 있으면 update!
		//동일한 PK 값이 없으면 insert!
		member = repo.save(member);
		return member;
	}
	
	
	
}
