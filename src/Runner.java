public class Runner {

    //warm Up 1-- has teen
    public boolean hasTeen(int a, int b, int c) {
        if((a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19)){
            return true;

        }else{
            return false;
        }
    }

    //Warmup 2 -- CountXX
    int countXX(String str) {
        int num = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i,i+1).equals("x") && str.substring(i+1,i+2).equals("x")){
                num +=1;
            }
        }
        return num;
    }

    //String 1 -- nTwice
    public String nTwice(String str, int n) {
        String answer="";
        answer+=str.substring(0,n);
        answer+=str.substring(str.length() - n);

        return answer;
    }

    //Array 1 -- sameFirstLast
    public boolean sameFirstLast(int[] nums) {
        boolean x = false;

        if (nums.length >=1 &&nums[0] == nums[nums.length - 1]){
            x = true;

        }return x;
    }

    //Logic 1 -- more20
    public boolean more20(int n) {
        boolean x = false;
        if((n-1)%20 == 0 || (n-2)%20 == 0){
            x = true;
        }return x;

    }


    //Logic 2 -- luckySum
    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13){
            sum = 0;
            return sum;
        }
        if(b == 13){
            sum = a;
            return sum;

        }
        if(c==13){
            sum = a + b;
            return sum;

        }
        if(a!=13 && b!=13 && c!=13){
            sum = a + b + c;
        }
        return sum;
    }
    //String 2 -- countCode

    public int countCode(String str) {
        int x = 0;
        for (int i = 0; i < str.length() - 3; i++){
            if(str.substring(i,i+1).equals("c") && str.substring(i+1,i+2).equals("o")
                    && str.substring(i+3,i+4).equals("e")){
                x++;
            }
        }
        return x;
    }

    //Array 2 -- lucky13

    public boolean lucky13(int[] nums) {
        int x = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i]==1 || nums[i] ==3){
                return false;
            }
        }
        return true;
    }

    //AP1 --scores100

    public boolean scores100(int[] scores) {
        for(int i=0;i<scores.length-1;i++){
            if(scores[i]==100 && scores[i+1]==100){
                return true;
            }
        }return false;
    }


    //String 3 --- sumDigits

    public int sumDigits(String str) {
        int sum = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sum+= Integer.parseInt(str.substring(i,i+1));
            }

        }return sum;
    }

//Array 3 -- CountClumps
public int countClumps(int[] nums) {
    int num = 0;
    for(int i = 0; i<nums.length-1;i++){
        if(nums[i]==nums[i+1]&&(i==0 || nums[i] != nums[i-1])){
            num ++;
        }
    }return num;
}



}
