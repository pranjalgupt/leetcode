class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            adj.add(new ArrayList<>());
        }
        for (var edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] discovered = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while (stack.size() > 0) {
            int u = stack.peek();
            if (u == destination) 
                return true;
            for (int v : adj.get(u)) {
                if (!discovered[v]) {    
                    stack.push(v);
                    discovered[v] = true;
                    break;
                }
            }
            if (u == stack.peek()) {
                stack.pop();
            }
        }
        return false;
    }
}