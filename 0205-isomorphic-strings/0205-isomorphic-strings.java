class Solution {
    HashMap <Character,Character> ss = new HashMap <>();
    HashMap <Character,Character> tt = new HashMap <>();    
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();
        boolean isIsomorphic = true;

        for(int i = 0;i<n;i++){
            Character char1 = s.charAt(i);
            Character char2 = t.charAt(i);
            if(!ss.containsKey(char1) && !tt.containsKey(char2)){
                ss.put(char1,char2);
                tt.put(char2,char1);
                isIsomorphic = true;
            }else if(ss.containsKey(char1) && ss.get(char1) != char2){
                isIsomorphic = false;
                break;
            }else if(tt.containsKey(char2) && tt.get(char2)!= char1){
                isIsomorphic = false;
                break;
            }
        }
        return isIsomorphic;       
    }
}