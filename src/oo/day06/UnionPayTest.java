package oo.day06;
//银行卡系统
public class UnionPayTest {
	public static void main(String[] args) {
		ABCATM atm = new ABCATM();//atm机对象
		UnionPay card = new ABCImpl();//银联卡-农行卡
		atm.insertCard(card);//插卡
	}
}
class ABCATM{//农行的ATM机
    private UnionPay card;//银联卡
    public void insertCard(UnionPay card){//插卡
       this.card = card;
    }
}

interface UnionPay{//银联接口
	public double getBalance();//查询余额
	public boolean drawMoney(double number);//取钱
	public boolean checkPwd(String input);//检查密码是否正确
}
interface ICBC extends UnionPay{
	public void payOnline(double number);//在线支付
}
interface ABC extends  UnionPay{
	public boolean payTelBill(String phoneNum,double sum);//支付电话费
}
class ICBCImpl implements ICBC{//工行卡
	public double getBalance(){return 0.0;}
	public boolean drawMoney(double number){return true;}
	public boolean checkPwd(String input){return true;}
	public void payOnline(double number){}
}
class ABCImpl implements ABC{//农行卡
	public double getBalance(){return 0.0;}
	public boolean drawMoney(double number){return true;}
	public boolean checkPwd(String input){return true;}
	public boolean payTelBill(String phoneNum,double sum){return true;}
}