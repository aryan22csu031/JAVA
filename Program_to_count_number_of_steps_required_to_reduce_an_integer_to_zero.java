class red{
    public static void main(String[] args) {
        countsteps(14);
        System.out.println(steps);
    }
    static int steps = 0;
    static void countsteps(int n){
        if(n==0){
            return;
        }
        if(n%2 == 0){
            steps++;
            countsteps(n/2);
        }
        if(n%2 != 0){
            steps++;
            countsteps(n-1);
        }

    }
}
