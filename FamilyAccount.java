class FamilyAccount 
{
	public static void main(String[] args) 
	{
		boolean isFlag=true;
		String details = "收支\t账户金额\t收支金额\t说    明\n";
		int balance = 0;
		
		while(isFlag){
			System.out.println("-------------------家庭收支记账软件----------------------");
			System.out.println("-------------------1收支明细");
			System.out.println("-------------------2登记收入");
			System.out.println("-------------------3登记支出");
			System.out.println("-------------------4退    出\n");
			System.out.println("-------------------请选择（1-4）");
			char selection =Utility.readMenuSelection();
			switch(selection){
			case '1':
				System.out.println("-----------------当前收支明细记录-----------------");
				System.out.println("details");
				System.out.println("-------------------------------------------------");
			case '2':
			//	System.out.println("2.登记收入");
				System.out.println("本次收入金额：");
				int money = Utility.readNumber;
				System.out.println("本次收入说明：");
				String info = Utility.readString;
				//处理详情，在原有的基础上加上mingxi
				balace += money;
				details +=("收入\t"+balance+"\t"+money+"\t"+info+"\t");
				
			case '3':
				System.out.println("3.登记支出");
			case '4':
				System.out.println("4.是否选择退出（Y/N）");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag =false;
					break;
					}
				}
		}
	}
}
