class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans = 0;

        int i = 0;

        while(i < s.length()){

            int cur = map.get(s.charAt(i));

            if(i < s.length()-1){

                int nxt = map.get(s.charAt(i+1));

                if(cur < nxt)
                    ans -= cur;
                else
                    ans += cur;
            }
            else{
                ans += cur;
            }

            i++;
        }

        return ans;
    }
}