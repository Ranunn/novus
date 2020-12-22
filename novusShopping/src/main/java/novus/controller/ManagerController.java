package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
	
	// 관리자 로그인
	@RequestMapping("Mgr/manager/mgrLogin.nv")
	public void mgrLogin() {
		System.out.println("Mgr/manager/mgrLogin.nv 요청됨");
	}
	
	// 관리자 회원가입
	@RequestMapping("Mgr/manager/mgrSign.nv")
	public void mgrSign() {
		System.out.println("Mgr/manager/mgrSign.nv 요청됨");
	}
	
	// 관리자 아이디 찾기
	@RequestMapping("Mgr/manager/mgrIdSearch.nv")
	public void mgrIdSearch() {
		System.out.println("Mgr/manager/mgrIdSearch.nv 요청됨");
	}
	
	// 관리자 비밀번호 찾기
	@RequestMapping("Mgr/manager/mgrPassSearch.nv")
	public void mgrPassSearch() {
		System.out.println("Mgr/manager/mgrPassSearch.nv 요청됨");
	}
	
	/////////////////////////////////////////////////////////
	// 관리자 상품 관리
	@RequestMapping("Mgr/ItemMgr/itemMgr.nv")
	public void itemMgr() {
		System.out.println("Mgr/ItemMgr/itemMgr.nv 요청됨");
	}
	
	// 관리자 상품 추가
	@RequestMapping("Mgr/ItemMgr/itemMgrInsert.nv")
	public void itemMgrInsert() {
		System.out.println("Mgr/ItemMgr/itemMgrInsert.nv 요청됨");
	}
	
	// 관리자 상품 삭제
	@RequestMapping("Mgr/ItemMgr/itemMgrDelete.nv")
	public void itemMgrDelete() {
		System.out.println("Mgr/ItemMgr/itemMgrDelete.nv 요청됨");
	}
	
	// 관리자 상품 수정
	@RequestMapping("Mgr/ItemMgr/itemMgrModify.nv")
	public void itemMgrModify() {
		System.out.println("Mgr/ItemMgr/itemMgrModify.nv 요청됨");
	}
	
	// 관리자 상품 검색
	@RequestMapping("Mgr/ItemMgr/itemMgrSearch.nv")
	public void itemMgrSearch() {
		System.out.println("Mgr/ItemMgr/itemMgrSearch.nv 요청됨");
	}
	
	///////////////////////////////////////////////////////////
	// 관리자 주문 관리
	@RequestMapping("Mgr/OrderMgr/orderMgr.nv")
	public void orderMgr() {
		System.out.println("Mgr/OrderMgr/orderMgr.nv 요청됨");
	}
	
	// 관리자 배송 관리
	@RequestMapping("Mgr/OrderMgr/deliveryMgr.nv")
	public void deliveryMgr() {
		System.out.println("Mgr/OrderMgr/deliveryMgr.nv 요청됨");
	}
	
	///////////////////////////////////////////////////////////
	// 관리자 리뷰게시판 관리
	@RequestMapping("Mgr/mgrReviewAndQna/mgrReview.nv")
	public void mgrReview() {
		System.out.println("Mgr/mgrReviewAndQna/mgrReview.nv 요청됨");
	}
	
	// 관리자 리뷰 상세 확인
	@RequestMapping("Mgr/mgrReviewAndQna/mgrReviewDetail.nv")
	public void mgrReviewDetail() {
		System.out.println("Mgr/mgrReviewAndQna/mgrReviewDetail.nv 요청됨");
	}
	
	// 관리자 1:1게시판 관리
	@RequestMapping("Mgr/mgrReviewAndQna/mgrQna.nv")
	public void mgrQna() {
		System.out.println("Mgr/mgrReviewAndQna/mgrQna.nv 요청됨");
	}
	
	// 관리자 1:1 상세 확인
	@RequestMapping("Mgr/mgrReviewAndQna/mgrQnaDetail.nv")
	public void mgrQnaDetail() {
		System.out.println("Mgr/mgrReviewAndQna/mgrQnaDetail.nv 요청됨");
	}
	
	///////////////////////////////////////////////////////////
	// 관리자 인기 상품 조회
	@RequestMapping("Mgr/SearchFavorite/favItemSearch.nv")
	public void favItemSearch() {
		System.out.println("Mgr/SearchFavorite/favItemSearch.nv 요청됨");
	}
	
	// 관리자 조회수 조회
	@RequestMapping("Mgr/SearchFavorite/readCntTable.nv")
	public void readCntTable() {
		System.out.println("Mgr/SearchFavorite/readCntTable.nv 요청됨");
	}
	
	// 관리자 구매수 조회
	@RequestMapping("Mgr/SearchFavorite/buyCntTable.nv")
	public void buyCntTable() {
		System.out.println("Mgr/SearchFavorite/buyCntTable.nv 요청됨");
	}
	
	// 관리자 리뷰수 조회
	@RequestMapping("Mgr/SearchFavorite/reviewCntTable.nv")
	public void reviewCntTable() {
		System.out.println("Mgr/SearchFavorite/reviewCntTable.nv 요청됨");
	}
	
	// 관리자 반품수 조회
	@RequestMapping("Mgr/SearchFavorite/refundCntTable.nv")
	public void refundCntTable() {
		System.out.println("Mgr/SearchFavorite/refundCntTable.nv 요청됨");
	}
	
	// 관리자 교환수 조회
	@RequestMapping("Mgr/SearchFavorite/exchangeCntTable.nv")
	public void exchangeCntTable() {
		System.out.println("Mgr/SearchFavorite/exchangeCntTable.nv 요청됨");
	}

	
	///////////////////////////////////////////////////////////
	// 관리자 일매출 조회
	@RequestMapping("Mgr/Statistics/daySell.nv")
	public void daySell() {
		System.out.println("Mgr/Statistics/daySell.nv 요청됨");
	}
	
	// 관리자 월매출 조회
	@RequestMapping("Mgr/Statistics/monthSell.nv")
	public void monthSell() {
		System.out.println("Mgr/Statistics/monthSell.nv 요청됨");
	}
	
	// 관리자 연매출 조회
	@RequestMapping("Mgr/Statistics/yearSell.nv")
	public void yearSell() {
		System.out.println("Mgr/Statistics/yearSell.nv 요청됨");
	}
	
	// 관리자 카테고리별매출 조회
	@RequestMapping("Mgr/Statistics/categorySell.nv")
	public void categorySell() {
		System.out.println("Mgr/Statistics/categorySell.nv 요청됨");
	}
	
	// 관리자 품목별매출 조회
	@RequestMapping("Mgr/Statistics/itemtypeSell.nv")
	public void itemtypeSell() {
		System.out.println("Mgr/Statistics/itemtypeSell.nv 요청됨");
	}
	
	// 관리자 브랜드별매출 조회
	@RequestMapping("Mgr/Statistics/brandSell.nv")
	public void brandSell() {
		System.out.println("Mgr/Statistics/brandSell.nv 요청됨");
	}
	
	///////////////////////////////////////////////////////////
	// 관리자 배너 관리
	@RequestMapping("Mgr/Event/bannerMgr.nv")
	public void bannerMgr() {
		System.out.println("Mgr/Event/bannerMgr.nv 요청됨");
	}
	
	// 관리자 팝업 관리
	@RequestMapping("Mgr/Event/popupMgr.nv")
	public void popupMgr() {
		System.out.println("Mgr/Event/popupMgr.nv 요청됨");
	}
	
	///////////////////////////////////////////////////////////
	// 관리자 재직자 조회
	@RequestMapping("Mgr/Person/empTable.nv")
	public void empTable() {
		System.out.println("Mgr/Person/empTable.nv 요청됨");
	}
	
	// 관리자 직원정보 수정 팝업
	@RequestMapping("Mgr/Person/empModify.nv")
	public void empModify() {
		System.out.println("Mgr/Person/empModify.nv 요청됨");
	}
	
	// 관리자 퇴사자 조회
	@RequestMapping("Mgr/Person/exEmpTable.nv")
	public void exEmpTable() {
		System.out.println("Mgr/Person/exEmpTable.nv 요청됨");
	}
	
	// 관리자 퇴사자 정보 수정 팝업
	@RequestMapping("Mgr/Person/exEmpModify.nv")
	public void exEmpModify() {
		System.out.println("Mgr/Person/exEmpModify.nv 요청됨");
	}
	
	// 관리자 회원관리
	@RequestMapping("Mgr/Person/memTable.nv")
	public void memTable() {
		System.out.println("Mgr/Person/memTable.nv 요청됨");
	}

}
