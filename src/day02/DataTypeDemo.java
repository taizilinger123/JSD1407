package day02;
//��ʾ��������
public class DataTypeDemo {
	public static void main(String[] args){
		/*
		//int:���ͣ�4���ֽ�
		int a = 88; //88Ϊֱ������javaĬ��int��
		//100��д�������Ǵ�ģ�Ĭ��Ϊint��������
		//int b = 10000000000;
		int b = 5/3;
		System.out.println(b);//1��С����������ȥ
		
		//�������Ҫ����
		int m = 2147483647;//mΪint�����ֵ
		m = m+1; //���ֵ����֮�ϼ�1----���
		System.out.println(m);//int����Сֵ
		*/
		
		/*
		//long:�����ͣ�ռ8���ֽ�
		long a = 88L; //88LΪlong��ֱ����
		//long b = 10000000000;//����ԭ��ͬ��
		long b = 10000000000L;
		
		//����ʱ�������������Ϊ��������
		long c = 1000*1000*1000*1000*2L;
		System.out.println(c);//���
		long d = 2L*1000*1000*1000*1000;
		System.out.println(d);//�����
		
		//��ȡ��1970.1.1��ʱ�����ڵĺ�����
		//����:����һ�������ˣ������ȼ�ס
		long time = System.currentTimeMillis();
		System.out.println(time);
		*/
		
		/*
		//double:������/С���ͣ�ռ8���ֽ�
		double a = 55.6;//55.6С��ֱ������Ĭ��double��
		//float b = 55.6;//�������Ͳ�ƥ��
		float b = 55.6F;
		
		//double��float�����������
		//floatռ4���ֽ�
		//��������ʹ��BigDecimal
		double c=3.0,d=2.9;
		System.out.println(c-d);//�������
		//����ʱ�����������Ϊ��������
		int e = 5/2;
		double f = 5/2;
		double g = 5.0/2;
		System.out.println(e); //2
		System.out.println(f); //2.0
		System.out.println(g); //2.5
		
		double h=0; //ռ8���ֽ�
		*/
		
		/*
		//char:�ַ��ͣ�ռ2���ֽ�
		//     ֻ�ܴ洢һ���ַ�
		char c1='A'; //'A'Ϊ�ַ���ֱ����
		char c2=65;  //65Ϊ'A'����Ӧ����(����)
		System.out.println(c1);
		System.out.println(c2);
		
		//char cc='AB';//�������ҽ���һ��
		//char c3='';//������󣬱������ַ�
		//char c4=''';//����'Ϊ�����ַ�
		char c5='\'';//��ȷ��ת���ַ�
		System.out.println(c5);
		
		//�ַ�ʵ���ϴ洢�ľ���һ������(��)
		//'0'��48��'a'��97��'A'��65
		int m = 2 + 2;
		int n = '2' + '2'; //50+50
		System.out.println(m); //4
		System.out.println(n); //100
		*/
		
		/*
		//boolean:�����ͣ��洢true��false
		//        ռ1���ֽ�
		boolean a = true;
		boolean b = false;
		//boolean c = 2;//�������Ͳ�ƥ��
		*/
		
		/*
		 * 1.����double�ͱ������洢8.88
		 *   ����float�ͱ������洢8.88
		 * 2.���5/2�Լ�5.0/2�Ľ������һ��
		 * 3.��������double�ͱ�����
		 *   �ֱ�洢3��2.9
		 *   �������Ľ��
		 * 4.����char�ͱ�����ʹ�����ַ�ʽ�洢Сa
		 *   ��ʽһ:�ַ�ֱ����
		 *   ��ʽ��:��(97)
		 * 5.����2+2�Լ�'2'+'2'�Ľ������һ��
		 * 6.��������boolean�ͱ�����
		 *   �ֱ�洢true��false
		 *   
		 */
		
		/*
		 * ��������ת�������ַ�ʽ:
		 * 1)�Զ�����ת��:С����
		 * 2)ǿ������ת��:��С
		 */
		
		int a = 55;
		long b = a;//�Զ�����ת��--С����
		int c = (int)b; //ǿ������ת��--��С
		//int c = b;//���󣬴�С����ǿ��ת
		
		long d = 10000000000L;
		int e = (int)d;
		System.out.println(e);//ǿתʱ���
		
		double dou = 3.88888888888888;
		float g = (float)dou;
		System.out.println(g);//ǿתʱ���ȶ�ʧ
		
		byte b1 = 127;
		//byte b1 = 128;//���󣬳���byte�ķ�Χ
		
		//java���������:
		//1.����ֱ��������ֱ�Ӹ���byte,char,short
		//2.byte,char,short��������ʱ��һ��תΪint
		short s1=5;
		short s2=6;//����1
		short s3=(short)(s1+s2);//����2
		//short s3=s1+s2;//����s1+s2Ϊint��

		/*
		 * 1.����int�ͱ���a���洢55
		 *   ����long�ͱ���b���洢a---ʲô����?
		 *   ����int�ͱ���c���洢b----ʲô����?
		 * 2.����long��d���洢100����
		 *   ����int��e���洢d--------ʲô����?
		 * 3.����double��dou,�洢5.55
		 *   ����int��f���洢doub-----ʲô����?
		 * 4.���´�����ʾ:
		 *     byte b1=55,b2=66;
		 *     byte b3=b1+b2;--------?????
		 */
		
		
		/*
		 * 1.�������ͱ���a���洢55
		 * 2.�������ͱ���b���洢8/3�Ľ��
		 *   ���b��ֵ
		 * 3.�������ͱ���c���洢2147483647(���ֵ)
		 *   ���¸�c��ֵΪ�䱾���1---�鿴���
		 * 4.����long�ͱ���d����ֵΪlong��ֱ����
		 * 5.����long�ͱ���e��
		 *   �洢4��1000��˵Ľ��--Ҫ��֤�����
		 * 6.����long�ͱ���f��
		 *   �洢��1970.1.1��ʱ�����ڵĺ�����
		 */
		
	}
}





