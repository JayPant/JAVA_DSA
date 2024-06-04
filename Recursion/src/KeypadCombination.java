public class KeypadCombination {

    static void keycomb(String str, String[] kp, String res)
    {
        if(str.isEmpty())
        {
            System.out.println(res+" ");
            return;
        }

        int currnum = str.charAt(0)- '0';
        String currChoice = kp[currnum];


        for(int i=0; i< currChoice.length(); i++)
        {
            keycomb(str.substring(1),kp, res+currChoice.charAt(i));
        }

    }

    public static void main(String[] args) {
        String s= "23";
        String[] kp = {" ", " ","abc","def","ghi","jkl","mno" , "pqrs", "tuv" ,"wxyz"};
        keycomb(s,kp," ");
    }
}
