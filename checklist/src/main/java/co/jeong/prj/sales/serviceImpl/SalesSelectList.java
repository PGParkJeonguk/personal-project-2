package co.jeong.prj.sales.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.jeong.prj.common.Command;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesSelectList implements Command {

	@Override
	public void execute() {
		SalesService dao = new SalesServiceImpl();
		List<SalesVO> sales = new ArrayList<SalesVO>();
		sales = dao.salesSelectList();
		System.out.println("=========================");
		if(sales != null) {
			for(SalesVO vo : sales) {
				System.out.print(vo.getSalesnum()+ " ");
				System.out.print(vo.getSalescompany()+ " ");
				System.out.print(vo.getSalkind()+ " ");
				System.out.print(vo.getSalproductname()+ " ");
				System.out.print(vo.getSalprice()+ " ");
				System.out.print(vo.getSalcount()+ " ");
				System.out.println(vo.getSalstock());
			}
		}else {
			System.out.println("등록된 납품물품이 없습니다.");
		}
	}
}