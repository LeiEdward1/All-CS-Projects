class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9\\s]", "");;
        int p1 = 0;
        int p2 = a.length()-1;
        while(p1<p2){
            if(a.charAt(p1)!=a.charAt(p2)){
                return false;
            }
            else return true;
        }
        return false;
    }
    public static void main(String[]args){
        String a = "A man, a plan, a canal: Panama";
        boolean b = false;
        isPalindrome(a);
        System.out.println(b.isPalindrome(a));
    }
}