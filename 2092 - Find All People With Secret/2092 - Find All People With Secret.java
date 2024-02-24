class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int[] m : meetings) {
            q.add(m);
        }
        HashSet<Integer> sec = new HashSet();
        sec.add(0);
        sec.add(firstPerson);

        while (q.size() > 0) {
            int[] poll = q.poll();
            HashSet<HashSet<Integer>> lsec = new HashSet();

            build(lsec, poll[0], poll[1]);
            while (q.size() > 0 && poll[2] == q.peek()[2]) {
                int[] npoll = q.poll();
                build(lsec, npoll[0], npoll[1]);
            }
            checkIfKnownPerson(sec, lsec);
        }
        return new ArrayList(sec);
    }

    void build(HashSet<HashSet<Integer>> h, int x, int y) {
        boolean added = false;
        for(HashSet<Integer> h1: h) {
            if (h1.contains(x) || h1.contains(y)) {
                added = true;
                h1.add(x); h1.add(y);
            }
        }
        if (!added) {
            HashSet<Integer> h1 = new HashSet();
            h1.add(x); h1.add(y);
            h.add(h1);
        }
    }

    void checkIfKnownPerson(HashSet<Integer> h, HashSet<HashSet<Integer>> h1) {
        for(HashSet<Integer> h2: h1) {
            for(Integer x: h2) {
                if (h.contains(x)) {
                    h.addAll(h2);
                    break;
                }
            }
        }
    }
}
