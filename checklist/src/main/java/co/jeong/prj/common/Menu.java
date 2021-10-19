package co.jeong.prj.common;

import java.util.HashMap;
import java.util.Map;

import co.jeong.prj.member.serviceImpl.MemberDelete;
import co.jeong.prj.member.serviceImpl.MemberInsert;
import co.jeong.prj.member.serviceImpl.MemberSelect;
import co.jeong.prj.member.serviceImpl.MemberSelectList;
import co.jeong.prj.member.serviceImpl.MemberUpdate;
import co.jeong.prj.purchase.serviceImpl.PurchaseDelete;
import co.jeong.prj.purchase.serviceImpl.PurchaseInsert;
import co.jeong.prj.purchase.serviceImpl.PurchaseSelect;
import co.jeong.prj.purchase.serviceImpl.PurchaseSelectList;
import co.jeong.prj.purchase.serviceImpl.PurchaseUpdate;
import co.jeong.prj.sales.serviceImpl.SalesDelete;
import co.jeong.prj.sales.serviceImpl.SalesInsert;
import co.jeong.prj.sales.serviceImpl.SalesSelect;
import co.jeong.prj.sales.serviceImpl.SalesSelectList;
import co.jeong.prj.sales.serviceImpl.SalesUpdate;



public class Menu {
	private Map<String, Command> map = new HashMap<String, Command>();

	public void Map() {
		map.put("MeberSelectList", new MemberSelectList());
		map.put("MemberSelect", new MemberSelect());
		map.put("MemberInsert", new MemberInsert());
		map.put("MemberUpdate", new MemberUpdate());
		map.put("MemberDelete", new MemberDelete());
		map.put("purchaseSelectList", new PurchaseSelectList());
		map.put("purchaseSelect", new PurchaseSelect());
		map.put("purchaseInsert", new PurchaseInsert());
		map.put("purchaseUpdate", new PurchaseUpdate());
		map.put("purchaseDelete", new PurchaseDelete());
		map.put("SalesSelectList", new SalesSelectList());
		map.put("SalesSelect", new SalesSelect());
		map.put("SalesInsert", new SalesInsert());
		map.put("SalesUpdate", new SalesUpdate());
		map.put("SalesDelete", new SalesDelete());
		
	}

	private void menu() {
		while (true) {
			mainMenu();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				memberMangement();
				break;
			case 2:
				purchaseMangement();
				break;
			case 3:
				salesMangement();
				break;
			case 4:	
				System.out.println("프로그램 완전히 종료합니다.");
				GB.scn.close();
				return;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		}
	}

	private void purchaseMangement() {
		boolean b = false;
		do {
			purchaseTitle();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("purchaseSelectList");
				break;
			case 2:
				executRun("purchaseSelect");
				break;
			case 3:
				executRun("purchaseInsert");
				break;
			case 4:
				executRun("purchaseUpdate");
				break;
			case 5:
				executRun("purchaseDelete");
				break;
			case 6:
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);
	}

	private void memberMangement() {
		boolean b = false;
		do {
			memberTitle();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("MeberSelectList");
				break;
			case 2:
				executRun("MemberSelect");
				break;
			case 3:
				executRun("MemberInsert");
				break;
			case 4:
				executRun("MemberUpdate");
				break;
			case 5:
				executRun("MemberDelete");
			case 6:
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);

	}
	
	private void salesMangement() {
		boolean b = false;
		do {
			salesTitle();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("SalesSelectList");
				break;
			case 2:
				executRun("SalesSelect");
				break;
			case 3:
				executRun("SalesInsert");
				break;
			case 4:
				executRun("SalesUpdate");
				break;
			case 5:
				executRun("SalesDelete");
			case 6:
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);

	}

	private void mainMenu() {
		System.out.println("지금 접속한 아이디는 " + GB.id + " 입니다.");
		System.out.println("지금 접속한 아이디의 이름은 " + GB.name + " 입니다.");
		System.out.println("지금 접속한 회사명은 " + GB.username + " 입니다.");
		
		System.out.println("==================");
		System.out.println("=== 1. 멤버 관리 ===");
		System.out.println("=== 2. 매입 관리 ===");
		System.out.println("=== 3. 매출 관리 ===");
		System.out.println("====4. 종    료 ====");
		System.out.println("==================");
		System.out.println("작업번호를 넣어주세요");
	}

	private void purchaseTitle() {
		System.out.println("====================");
		System.out.println("=== 1. 매입물품 목록 ===");
		System.out.println("=== 2. 매입물품 조회 ===");
		System.out.println("=== 3. 매입물품 등록 ===");
		System.out.println("=== 4. 매입물품 수정 ===");
		System.out.println("=== 5. 매입물품 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("====================");
		System.out.println("작업번호를 넣어주세요");

	}

	private void memberTitle() {
		System.out.println("=====================");
		System.out.println("=== 1. 회원목록 조회 ===");
		System.out.println("=== 2. 회원정보 조회 ===");
		System.out.println("=== 3. 회원정보 등록 ===");
		System.out.println("=== 4. 회원정보 수정 ===");
		System.out.println("=== 5. 회원정보 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("=====================");
		System.out.println("작업번호를 넣어주세요");
	}
	
	private void salesTitle() {
		System.out.println("=====================");
		System.out.println("=== 1. 매출목록 조회 ===");
		System.out.println("=== 2. 매출정보 조회 ===");
		System.out.println("=== 3. 매출정보 등록 ===");
		System.out.println("=== 4. 매출정보 수정 ===");
		System.out.println("=== 5. 매출정보 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("=====================");
		System.out.println("작업번호를 넣어주세요");
	}

	private void executRun(String str) {
		Command command = map.get(str);
		command.execute();
	}

	public void run() {
		Map();
		menu();
	}
}
