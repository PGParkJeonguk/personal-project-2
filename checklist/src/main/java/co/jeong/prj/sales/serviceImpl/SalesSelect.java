package co.jeong.prj.sales.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesSelect implements Command {
	private SalesService dao = new SalesServiceImpl();
	
	@Override
	public void execute() {
		SalesVO sales = new SalesVO();
		System.out.println("=========================");
		System.out.println("조회할 납품상품을 입력하세요.");
		sales.setSalproductname(scn.nextLine());
		System.out.println("=========================");
		System.out.println("납품상품이 납품된 회사명을 입력하세요.");
		sales.setSalescompany(scn.nextLine());
		sales = dao.salesSelect(sales);
		
		if(sales != null) {
			System.out.print("제품번호 : " + sales.getSalesnum() + " ");
			System.out.print("납품회사 : " + sales.getSalescompany()+ " ");
			System.out.print("종류 : " + sales.getSalkind()+ " ");
			System.out.print("상품이름 : " + sales.getSalproductname()+ " ");
			System.out.print("납품가격 : " + sales.getSalprice()+ " ");
			System.out.print("납품한 양 : " + sales.getSalcount()+ " ");
			System.out.println("재고량 : " + sales.getSalstock());
		}else {
			System.out.println("잘못 입력하셨거나 없는 제품입니다.");
		}
	}

}
