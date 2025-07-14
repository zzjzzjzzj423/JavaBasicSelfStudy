
public class OperationBasic {

    public void getNumber(int n){
        System.out.println("百位数字:"+n/100);
        System.out.println("十位数字"+n%100/10);
        System.out.println("各位数字"+n%100%10);
    }

}
