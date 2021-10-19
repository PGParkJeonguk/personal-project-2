package co.jeong.prj.purchase.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.jeong.prj.common.Command;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseSelectList implements Command {

	@Override
	public void execute() {
		PurchaseService dao = new PurchaseServiceImpl();
		List<PurchaseVO> purchase = new ArrayList<PurchaseVO>();
		purchase = dao.PurchaseSelectList();
		System.out.println("===========================");
		System.out.println("번호  납입회사  종류   이름   납입가격    수량    현재재고");
		if(purchase != null) {
			for(PurchaseVO vo : purchase) {
				System.out.print(vo.getPurchasenum() + " ");
				System.out.print(vo.getPurchasecompany()+ " ");
				System.out.print(vo.getPurkind()+ " ");
				System.out.print(vo.getPurproductname()+ " ");
				System.out.print(vo.getPurprice()+ " ");
				System.out.print(vo.getPurcount()+ " ");
				System.out.println(vo.getPurcount() + vo.getPurstock());
			}
		}else{
			System.out.println("등록된 납입물품이 없습니다.");
		}
		System.out.println("===========================");
		
	}

}
