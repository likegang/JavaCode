package cn.com.webxml;

public class Main {
    public static void main(String[] args){
        //����һ��MobileCodeWS����
        MobileCodeWS factory = new MobileCodeWS();
        //���ݹ�������һ��MobileCodeWSSoap����
        MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
        //����WebService�ṩ��getMobileCodeInfo������ѯ�ֻ�����Ĺ�����
        String searchResult = mobileCodeWSSoap.getMobileCodeInfo("13399154103" , null);
        System.out.println(searchResult);

    }
}
