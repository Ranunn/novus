package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	// 회원 로그인
	@RequestMapping("mem/member/memLogin.nv")
	public void memLogin() {
		System.out.println("mem/member/memLogin.nv 요청");
	}
	
	// 회원가입
	@RequestMapping("mem/member/memSignup.nv")
	public void memSignup() {
		System.out.println("mem/member/memSignup.nv 요청");
	}
	
	// 아이디 찾기
	@RequestMapping("mem/member/memIdsearch.nv")
	public void memIdsearch() {
		System.out.println("mem/member/memIdsearch.nv 요청");
	}
	
	// 비밀번호 찾기
	@RequestMapping("mem/member/memPassSearch.nv")
	public void memPassSearch() {
		System.out.println("mem/member/memPassSearch.nv 요청");
	}
	
	// 마이페이지
	@RequestMapping("mem/myPage/myPage.nv")
	public void myPage() {
		System.out.println("mem/myPage/myPage.nv 요청");
	}
	
	
	///////////////////////////////////////////////////////
	// 고객센터 메인
	@RequestMapping("mem/CsCenter/csMain.nv")
	public void csMain() {
		System.out.println("mem/CsCenter/csMain.nv 요청");
	}
	
	// FAQ
	@RequestMapping("mem/CsCenter/csFaq.nv")
	public void csFaq() {
		System.out.println("mem/CsCenter/csFaq.nv 요청");
	}
	
	// 1:1 문의하기
	@RequestMapping("mem/CsCenter/csQna.nv")
	public void csQna() {
		System.out.println("mem/CsCenter/csQna.nv 요청");
	}
	
	// 내 문의목록
	@RequestMapping("mem/CsCenter/csQnaList.nv")
	public void csQnaList() {
		System.out.println("mem/CsCenter/csQnaList.nv 요청");
	}
	
	// 공지사항
	@RequestMapping("mem/CsCenter/csPosting.nv")
	public void csPosting() {
		System.out.println("mem/CsCenter/csPosting.nv 요청");
	}

}
