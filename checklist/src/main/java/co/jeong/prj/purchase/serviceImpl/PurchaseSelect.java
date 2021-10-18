package co.jeong.prj.purchase.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseSelect implements Command{
	private PurchaseService dao = new PurchaseServiceImpl();

	@Override
	public void execute() {
		PurchaseVO purchase = new PurchaseVO();
		System.out.println("=========================");
		System.out.println("조회할 납입상품을 입력하세요.");
		purchase.setProductname(scn.nextLine());
		System.out.println("=========================");
		System.out.println("납입받은 회사명을 입력하세요.");
		purchase.setPurchasecompany(scn.nextLine());
		purchase = dao.purchaseSelect(purchase);
		
		if(purchase != null) {
			System.out.println("납입회사 : " + purchase.getPurchasecompany());
			System.out.println("종류 : " + purchase.getPurkind());
			System.out.println("상품이름 : " + purchase.getProductname());
			System.out.println("납입가격 : " + purchase.getPurprice());
			System.out.println("들어온 양 : " + purchase.getPurcount());
			System.out.println("재고량 : " + purchase.getPurstock());
		}else {
			System.out.println("잘못 입력하셨거나 없는 제품입니다.");
		}
	}
	
}
