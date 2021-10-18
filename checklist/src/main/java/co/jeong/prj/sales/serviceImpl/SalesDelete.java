package co.jeong.prj.sales.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesDelete implements Command  {
	private SalesService dao = new SalesServiceImpl();

	@Override
	public void execute() {
		SalesVO sales = new SalesVO();
		System.out.println("=========================");
		System.out.println("삭제할 출고제품이름을 입력하세요.");
		String str = scn.nextLine();
		if(str.equals(sales.getSalproductname())) {
			sales.setSalesnum(GB.salesnum);;
		}
		
		int n = dao.salesSelectDelete(sales);
		
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("출고제품 삭제에 실패하였습니다.");
		}		
	}

}
