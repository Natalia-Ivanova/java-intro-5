package lesson02;

class eachNth{

    String s;
    int x=0;

    String eachNth(String everyNth, int n){
        s = everyNth[x];
        int len=everyNth.length();
        do{
            s += everyNth[x + n];
            n--;
        } while (len>0);
        return s;
        System.out.println(s);
    }

    public static void main (String[] args){
        eachNth s1 =new eachNth("Miracle", 2);
        eachNth s2 =new eachNth("abcdefg", 2);
        eachNth s3 =new eachNth("abcdefg", 3);

    }


}