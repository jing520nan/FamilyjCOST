class FamilyAccount 
{
	public static void main(String[] args) 
	{
		boolean isFlag=true;
		String details = "��֧\t�˻����\t��֧���\t˵    ��\n";
		int balance = 0;
		
		while(isFlag){
			System.out.println("-------------------��ͥ��֧�������----------------------");
			System.out.println("-------------------1��֧��ϸ");
			System.out.println("-------------------2�Ǽ�����");
			System.out.println("-------------------3�Ǽ�֧��");
			System.out.println("-------------------4��    ��\n");
			System.out.println("-------------------��ѡ��1-4��");
			char selection =Utility.readMenuSelection();
			switch(selection){
			case '1':
				System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
				System.out.println("details");
				System.out.println("-------------------------------------------------");
			case '2':
			//	System.out.println("2.�Ǽ�����");
				System.out.println("���������");
				int money = Utility.readNumber;
				System.out.println("��������˵����");
				String info = Utility.readString;
				//�������飬��ԭ�еĻ����ϼ���mingxi
				balace += money;
				details +=("����\t"+balance+"\t"+money+"\t"+info+"\t");
				
			case '3':
				System.out.println("3.�Ǽ�֧��");
			case '4':
				System.out.println("4.�Ƿ�ѡ���˳���Y/N��");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag =false;
					break;
					}
				}
		}
	}
}
