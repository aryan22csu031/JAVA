package Strings;
class strPal{
    public static void main(String[] args) {
        String a = "abcba";
        String b = "abya";
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i=0; i<=str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
