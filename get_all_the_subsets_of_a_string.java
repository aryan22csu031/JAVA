package StringsInJava;
class strings2{
    public static void main(String[] args) {
        String str = "abc";
        makeSubsets("",str);
    }
    static void makeSubsets(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        makeSubsets(p+ch,up.substring(1));
        makeSubsets(p,up.substring(1));
    }
}
