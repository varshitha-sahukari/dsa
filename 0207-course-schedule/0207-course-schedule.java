class Solution {
    boolean hasCycle(int i , ArrayList<ArrayList<Integer>> adj , boolean[] visited, boolean[] pathVisited){
        visited[i] = true;
        pathVisited[i] = true;
        for(int n : adj.get(i)){
            if(!visited[n]){
                if(hasCycle(n,adj,visited,pathVisited)) return true;
            }else if(pathVisited[n]) return true;

        }
        pathVisited[i] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            adj.get(prereq).add(course);

        }

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(hasCycle(i,adj,visited,pathVisited)) return false;
            }
        }
        return true;
    }
}