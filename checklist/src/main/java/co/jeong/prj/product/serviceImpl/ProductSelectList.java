package co.jeong.prj.product.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.jeong.prj.common.Command;
import co.jeong.prj.product.ProductService;
import co.jeong.prj.product.ProductVO;

public class ProductSelectList implements Command {

	@Override
	public void execute() {
		ProductService dao = new ProductServiceImpl();
		List<ProductVO> product = new ArrayList<ProductVO>();
		product = dao.ProductSelectList();
		
		System.out.println("===========================");
		
		if(product != null) {
			for(ProductVO products : product) {
				System.out.print(products.getProductnum());
				System.out.print(products.getProductkind());
				System.out.println(products.getProductname());
				System.out.println(products.getProductprices());
				System.out.println(products.getProductclass());
				System.out.println(products.getProductstock());
				System.out.println(products.getProductcompany());
			}
			
		}
	}

}
