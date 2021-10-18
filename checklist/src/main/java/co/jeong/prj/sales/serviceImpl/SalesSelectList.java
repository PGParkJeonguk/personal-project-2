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
				System.out.println(vo.getSalescompany());
				System.out.println(vo.getSalkind());
				System.out.println(vo.getSalproductname());
				System.out.println(vo.getSalprice());
				System.out.println(vo.getSalcount());
				System.out.println(vo.getSalstock());
			}
		}else {
			System.out.println("등록된 납품물품이 없습니다.");
		}
	}
}