class ch {
    static String srchStr(String str, char i){
        if(str.length()==0){
            return "string is empty";
        }
        for(int x=0; x<str.length(); x++){
            char c = str.charAt(x);
            if(c==i){
                return "yes it is present";
            }
        }
        return "no, its not present";
    }
    public static void main(String args[]){
        String s = "Elephant";
        String a = "";
        System.out.println(srchStr(s,'t'));
        System.out.println(srchStr(s,'m'));
        System.out.println(srchStr(a,'t'));
    }
}
