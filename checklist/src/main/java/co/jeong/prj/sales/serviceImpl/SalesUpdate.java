package co.jeong.prj.sales.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesUpdate implements Command {
	private SalesService dao = new SalesServiceImpl();

	@Override
	public void execute() {
		SalesVO sales = new SalesVO();
		System.out.println("=============================");
		sales.setSalesnum(GB.salesnum);
		System.out.println("변경할 납품회사명을 입력하세요.");
		sales.setSalescompany(scn.nextLine());
		System.out.println("변경할 제품이름을 입력하세요.");
		sales.setSalproductname(scn.nextLine());
		System.out.println("변경할 제품가격을 입력하세요.");
		sales.setSalprice(scn.nextInt());
		System.out.println("변경할 제품출고수량을 입력하세요.");
		sales.setSalcount(scn.nextInt());
		System.out.println("변경할 재고수량을 입력하세요.");
		sales.setSalstock(sales.getSalcount() + scn.nextInt());
		System.out.println("변경할 바코드를 입력하세요.");
		sales.setBacord(scn.nextInt());

		int n = dao.salesSelectUpdate(sales);
		if (n != 0) {
			System.out.println("정상적으로 변경되었습니다.");
		} else {
			System.out.println("변경에 실패하였습니다.");
		}
	}

}
