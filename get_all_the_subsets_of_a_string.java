package StringsInJava;
class strings2{
    public static void main(String[] args) {
        String str = "abc";
        makeSubsets("",str);
        System.out.print(subSetArray("","abc"));
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
    static ArrayList<String> subSetArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSetArray(p+ch,up.substring(1));
        ArrayList<String> right = subSetArray(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
