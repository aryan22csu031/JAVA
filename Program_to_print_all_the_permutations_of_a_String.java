package StringsInJava;

import java.util.ArrayList;

class perm{
    public static void main(String[] args) {
        String a = "abc";
        permutations("",a);
        System.out.print(permutationList("",a));
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
    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String FirstPos = p.substring(0,i);
            String SecondPos = p.substring(i);
            ans.addAll(permutationList(FirstPos + ch+ SecondPos,up.substring(1)));
        }
        return ans;
    }
}
