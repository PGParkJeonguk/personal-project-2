package co.jeong.prj.common;

import co.jeong.prj.member.service.MemberService;
import co.jeong.prj.member.service.MemberVO;
import co.jeong.prj.member.serviceImpl.MemberServiceImpl;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;
import co.jeong.prj.purchase.serviceImpl.PurchaseServiceImpl;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;
import co.jeong.prj.sales.serviceImpl.SalesServiceImpl;

public class Login {
	public void run() {

		MemberService dao = new MemberServiceImpl();
		MemberVO member;
		PurchaseService dao1 = new PurchaseServiceImpl();
		PurchaseVO purchase;
		SalesService dao2 = new SalesServiceImpl();
		SalesVO sales;

		boolean b = false;
		do {
			member = new MemberVO();
			System.out.println("======로 그 인======");
			System.out.println("아이디를 입력하세요.");
			member.setId(GB.scn.nextLine());
			System.out.println("패스워드를 입력하세요.");
			member.setPassword(GB.scn.nextLine());
			member = dao.memberSelect(member);
			System.out.println("회사이름을 입력하세요.");
			sales.setSalproductname(GB.scn.nextLine());
			sales = dao2.salesSelect(sales);
			System.out.println("매출회사이름을 입력하세요.");
			purchase.setProductname(GB.scn.nextLine());
			purchase = dao1.purchaseSelect(purchase);

			
			if (member != null) {
				GB.name= member.getName();
				GB.id = member.getId();
				GB.password = member.getPassword();
				GB.purchasenum = purchase.getPurchasenum();
				GB.salesnum = sales.getSalesnum();
				b = true;
			} else {
				System.out.println("사용자의 아이디 또는 패스워드가 틀렸습니다.");
				GB.scn.close();
			}
		} while (!b);

	}

}
