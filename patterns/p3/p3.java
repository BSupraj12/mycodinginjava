class p3{
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<=n-1;i++){
            for(int j=n-i-2;j>=0;j--){
                System.out.print(" ");
            }
            for(int z=0;z<=i;z++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}