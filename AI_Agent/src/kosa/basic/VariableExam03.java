package kosa.basic;

public class VariableExam03 {
	public static void main(String[] args) {
		//����(����) ���� Ư¡ 2����
		//1. �ݵ�� �ʱ�ȭ �� ����ؾ��Ѵ�.
		//2. ����� ������ ���ǵ� ���� �ȿ����� ��밡���ϴ�.
		int num;
		
		if(1==1) {
			num=100;
		}
		
		System.out.println(num);
		
		//����ȯ(�Ϲ���, ����)
		//int<==>char *�ƽ�Ű�ڵ尪���� ���� ��ȯ
		//char ch='A';
		//String str="A";
		
		char ch='A';
		System.out.println((int)ch);
		
		for(int i=65;i<91;i++) { // i++=>i=i+1
			System.out.print((char)i+" "); //" " : ����
			
		}
		
		System.out.println();
		
		//int(�⺻��)<==>String(Object)
		String num3="100"; //String�� ���ڿ��̱� ������ �ֵ���ǥ�ؾ���
		int num4 = Integer.parseInt(num3);//num3�� ���ڷ� ���
		int result = num4+100;
		System.out.println(result);
	    //NumberFormatException ������ �����ȿ� ���ڰ� �ƴ� ���ڰ� �� ����
		
		int num5=10;
		String num6=String.valueOf(num5);
		String num7=num5+"";
		System.out.println(num7);
		
		String str =7+"7"+7;
		System.out.println(str);
		//������ string�̶� �����ϸ� string�� ��. � �Ͱ� string�� �����ϸ� string�� ��.
				
		boolean bool = false;
		
		//%=>������ ������
		System.out.println((10%3));
		
		for(int i=1;i<100;i++) {
			if(!(i%2==0)|(i%3==0)){
				System.out.print(i+",");
				//2�� ����� 3�� ����� �ƴ� �͵鸸 ����϶�.
			}
		}
				System.out.println(); //�ٹٲ�
		        //���մ��� ������
				int n=0;
				n++;//������ //n+=1; //n=n+1;
				System.out.println(n);
				
				int x=10;
				int y=0;
				y=++x;//y=x++=>�����ϰ� ����, y=++x=>���ϰ� y�� ����
				System.out.println("x:"+x);
				System.out.println("y:"+y);
				
				//3.14+1=4.14
				double d =3.14+1;
				System.out.println(d);
				if(d==4.14) {
					System.out.println("�´�");
				}else {
					System.out.println("Ʋ����");
				}
				
				//���� ������
				int b=40;
				int c=20;
				
				int max=(b>c)?b:c; //(b>c�� ���̸� b, �����̸� c)
				System.out.println(max);
		
		}
		
	}

