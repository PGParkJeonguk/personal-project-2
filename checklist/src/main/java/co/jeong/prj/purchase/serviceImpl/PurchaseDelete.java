package co.jeong.prj.purchase.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseDelete implements Command {
	private PurchaseService dao = new PurchaseServiceImpl();

	@Override
	public void execute() {
		PurchaseVO purchase = new PurchaseVO();
		System.out.println("=========================");
		System.out.println("삭제할 입고제품이름을 입력하세요.");
		String str = scn.nextLine();
		if(str.equals(purchase.getProductname())) {
			purchase.setPurchasenum(GB.purchasenum);
		}
		
		int n = dao.purchaseDelete(purchase);
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("입고제품 삭제에 실패하였습니다.");
		}		
		
	}

}
