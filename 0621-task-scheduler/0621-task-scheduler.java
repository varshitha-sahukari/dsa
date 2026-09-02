class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int f:freq){
            if(f>0){
                pq.add(f);
            }
        }
        int time =0;
        
        while(!pq.isEmpty()){
            ArrayList<Integer> remaining = new ArrayList<>();
            int cycle = n+1;
            while(!pq.isEmpty() && cycle>0){
                int current = pq.poll();
                current--;
                time++;
                cycle--;
                if(current>0){
                    remaining.add(current);
                }

            }
            for(int f : remaining){
                pq.add(f);
            }
            if(!pq.isEmpty()){
                time += cycle;
            }
        }
        return time;
    }
}