package com.midas.hackerrank;

public class Palindrome {
    public static void main(String[] args) {

//        quyjjdcgsvvsgcdjjyq
//        hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh
//        fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf
//        bsyhvwfuesumsehmytqioswvpcbxyolapfywdxeacyuruybhbwxjmrrmjxwbhbyuruycaexdwyfpaloyxbcpwsoiqtymhesmuseufwvhysb
//        fvyqxqxynewuebtcuqdwyetyqqisappmunmnldmkttkmdlnmnumppasiqyteywdquctbeuwenyxqxqyvf
//        mmbiefhflbeckaecprwfgmqlydfroxrblulpasumubqhhbvlqpixvvxipqlvbhqbumusaplulbrxorfdylqmgfwrpceakceblfhfeibmm
//        tpqknkmbgasitnwqrqasvolmevkasccsakvemlosaqrqwntisagbmknkqpt
//        lhrxvssvxrhl
//        prcoitfiptvcxrvoalqmfpnqyhrubxspplrftomfehbbhefmotfrlppsxburhyqnpfmqlaorxcvtpiftiocrp
//        kjowoemiduaaxasnqghxbxkiccikxbxhgqnsaxaaudimeowojk


        String s = "quyjjdcgsvvsgcdjjyq";


        int left = 0;
        int right = s.length()-1;
        int indexVal = -1;


        while(right>left){

            right--;
            left++;

            if(s.charAt(right)!=s.charAt(left)){


                if (isPalindrome(left,right - 1,s)) {

                    indexVal = right;
                    break;
                }else if (isPalindrome(left+1,right,s)) {

                    indexVal = left;
                    break;
                }

            }


        }

        System.out.println(indexVal);

    }

    static boolean isPalindrome(int left , int right, String s){
        while (right>left){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }


        return true;
    }

}
