package StringsInJava;
class Strings1{
    public static void main(String[] args) {
        String a = "Aryan";
        System.out.print(removeChar(a,'a'));
    }
    static String str1 = "";
    static String removeChar(String str, char rem){
        String newStr = str.toLowerCase();
        for(int i=0; i<newStr.length();i++){
            char pointer = newStr.charAt(i);
            if(pointer == rem){
                continue;
            }else{
                str1 = str1+pointer;
            }
        }
        return str1;
    }
}
