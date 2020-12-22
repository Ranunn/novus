package novus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	
	// 상품 목록
	@RequestMapping("item/ItemList/itemList.nv")
	public void itemList() {
		System.out.println("item/ItemList/itemList.nv 요청");
	}
	
	// 상품 세부 정보
	@RequestMapping("item/ItemInfo/itemDetails.nv")
	public void itemDetailst() {
		System.out.println("item/ItemInfo/itemDetails.nv 요청");
	}
	
	// 상품 리뷰
	@RequestMapping("item/ItemInfo/itemReview.nv")
	public void itemReview() {
		System.out.println("item/ItemInfo/itemReview.nv 요청");
	}
	
	// 상품 옵션
	@RequestMapping("item/ItemInfo/itemDetailOption.nv")
	public void itemDetailOption() {
		System.out.println("item/ItemInfo/itemDetailOption.nv 요청");
	}

}
