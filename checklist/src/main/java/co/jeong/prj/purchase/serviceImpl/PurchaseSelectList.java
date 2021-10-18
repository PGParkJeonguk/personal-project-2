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
		if(purchase != null) {
			for(PurchaseVO vo : purchase) {
				System.out.println(vo.getPurchasecompany());
				System.out.println(vo.getPurkind());
				System.out.println(vo.getProductname());
				System.out.println(vo.getPurprice());
				System.out.println(vo.getPurcount());
				System.out.println(vo.getPurstock());
			}
		}else{
			System.out.println("등록된 납입물품이 없습니다.");
		}
		System.out.println("===========================");
		
	}

}
