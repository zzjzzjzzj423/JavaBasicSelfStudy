import java.util.ArrayList;

public class OperationBasic {

    public void getNumber(int n){
        System.out.println("百位数字:"+n/100);
        System.out.println("十位数字"+n%100/10);
        System.out.println("各位数字"+n%100%10);
    }

    public boolean compareTwoNumbers(int a,int b){
        return a==b;
    }

    public boolean judgePail(int a){
        ArrayList<Integer> list = new ArrayList<>();
        while(a!=0){
            int bottomNumber=a%10;
            list.add(bottomNumber);
            a=a/10;
        }
        int size=list.size();
        int i=0;
        while(i<size/2){
            if(list.get(i)==list.get(size-1-i)){
                i++;
            }else {
                return false;
            }
        }
        return true;
    }

    public boolean advancedJudgePail(int a){
        int b=0;
        int recordA=a;
        while(recordA!=0){
            b++;
            recordA=recordA/10;
        }
        int c=0;
        int divideNumber=1;
        for(int i=b;i>0;i--){
            int multipleNumber=1;
            for(int j=0;j<i-1;j++){
                multipleNumber=multipleNumber*10;
            }
            c=c+a/divideNumber%10*multipleNumber;
            divideNumber=divideNumber*10;
        }
        return c==a;
    }

    public boolean simpleJudgePail(int a){
        int b=0;
        int recordA=a;
        while(a!=0){
            int bottomNumber=a%10;
            a=a/10;
            b=b*10+bottomNumber;
        }
        System.out.println("b:"+b);
        return b==recordA;

    }

    public int[] divide(int a,int b){
        int[] result=new int[2];
        if(a==b){
            result[0]=1;
            result[1]=0;
        }
        int bigger=a>b?a:b;
        int smaller=a<b?a:b;
        int record=bigger;
        int divider=0;
        while(record>0){
            record=record-smaller;
            if(record>=0){
                divider++;
            }else{
                result[1]=record+smaller;
            }
        }
        result[0]=divider;
        return result;
    }

}
