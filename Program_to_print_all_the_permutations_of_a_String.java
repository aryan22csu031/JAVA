package StringsInJava;
class perm{
    public static void main(String[] args) {
        String a = "abc";
        permutations("","abc");
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String FirstPos = p.substring(0,i);
            String SecondPos = p.substring(i);
            permutations(FirstPos + ch+ SecondPos,up.substring(1));
        }
    }
}
