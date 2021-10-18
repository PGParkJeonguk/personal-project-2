package co.jeong.prj.purchase.service;

import java.util.List;

public interface PurchaseMapper {
	List<PurchaseVO> PurchaseSelectList();
	PurchaseVO PurchaseSelect(PurchaseVO vo);
	int purchaseInsert(PurchaseVO vo);
	int purchaseUpdate(PurchaseVO vo);
	int purchaseDelete(PurchaseVO vo);
	
}
