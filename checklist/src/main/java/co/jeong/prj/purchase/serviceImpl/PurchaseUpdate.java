package co.jeong.prj.purchase.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseUpdate implements Command {
	private PurchaseService dao = new PurchaseServiceImpl();

	@Override
	public void execute() {
		PurchaseVO purchase = new PurchaseVO();
		System.out.println("=============================");
		purchase.setPurchasenum(GB.purchasenum);
		System.out.println("변경할 납입회사명을 입력하세요.");
		purchase.setPurchasecompany(scn.nextLine());
		System.out.println("변경할 제품이름을 입력하세요.");
		purchase.setProductname(scn.nextLine());
		System.out.println("변경할 제품가격을 입력하세요.");
		purchase.setPurprice(scn.nextInt());
		System.out.println("변경할 제품입고수량을 입력하세요.");
		purchase.setPurcount(scn.nextInt());
		System.out.println("변경할 재고수량을 입력하세요.");
		purchase.setPurstock(purchase.getPurcount() + scn.nextInt());
		
		int n = dao.purchaseUpdate(purchase);
		if( n != 0) {
			System.out.println("정상적으로 변경되었습니다.");
		}else {
			System.out.println("변경에 실패하였습니다.");
		}	
	}
	
	
}
