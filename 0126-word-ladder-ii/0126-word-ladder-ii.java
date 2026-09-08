class Solution {
    public List<List<String>> findLadders(
            String beginWord,
            String endWord,
            List<String> wordList) {

        List<List<String>> ans = new ArrayList<>();

        Set<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord)) {
            return ans;
        }
        Map<String, List<String>> parent = new HashMap<>();

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        set.remove(beginWord);

        boolean found = false;

        while (!q.isEmpty() && !found) {

            int size = q.size();

            Set<String> levelVisited = new HashSet<>();

            for (int i = 0; i < size; i++) {

                String word = q.poll();
                char[] chars = word.toCharArray();

                for (int j = 0; j < chars.length; j++) {

                    char original = chars[j];

                    for (char c = 'a'; c <= 'z'; c++) {

                        if (c == original) {
                            continue;
                        }

                        chars[j] = c;
                        String next = new String(chars);

                        if (set.contains(next)) {

                            if (!levelVisited.contains(next)) {
                                q.offer(next);
                                levelVisited.add(next);
                            }

                            parent
                                .computeIfAbsent(next,
                                    k -> new ArrayList<>())
                                .add(word);

                            if (next.equals(endWord)) {
                                found = true;
                            }
                        }
                    }

                    chars[j] = original;
                }
            }

            set.removeAll(levelVisited);
        }

        if (!found) {
            return ans;
        }

        List<String> path = new ArrayList<>();
        path.add(endWord);

        dfs(endWord, beginWord, parent, path, ans);

        return ans;
    }

    private void dfs(
            String word,
            String beginWord,
            Map<String, List<String>> parent,
            List<String> path,
            List<List<String>> ans) {

        if (word.equals(beginWord)) {

            List<String> temp = new ArrayList<>(path);

            Collections.reverse(temp);

            ans.add(temp);

            return;
        }

        if (!parent.containsKey(word)) {
            return;
        }

        for (String prev : parent.get(word)) {

            path.add(prev);

            dfs(prev, beginWord, parent, path, ans);

            path.remove(path.size() - 1);
        }
    }
}