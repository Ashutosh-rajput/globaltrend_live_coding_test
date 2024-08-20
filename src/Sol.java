import java.util.LinkedList;

class Sol {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> result = new LinkedList<>();

        // Traversing and merging intervals
        int[] arr = new int[2];
        for (int i = 0; i < intervals.length; i++) {
            arr[0] = intervals[i][0];
            if (newInterval[0] < intervals[i][1]) {
                for (; i < intervals.length; i++) {
                    if (newInterval[1] < intervals[i][0]) {
                        System.out.println("test1");
                        arr[1] = newInterval[1];
                        newInterval[0] = Integer.MAX_VALUE;
                        newInterval[1] = Integer.MAX_VALUE;
                        break;
                    } else if (newInterval[1] < intervals[i][1]) {
                        System.out.println("test2");
                        arr[1] = intervals[i][1];
                        newInterval[0] = Integer.MAX_VALUE;
                        newInterval[1] = Integer.MAX_VALUE;
                        break;
                    }
                }
                result.add(arr);
            } else {
                System.out.println("test3");
                arr[1] = intervals[i][1];
                result.add(arr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Sol solution = new Sol();

        // Test case 1
//        int[][] intervals1 = {{1, 3}, {6, 9}};
//        int[] newInterval1 = {2, 5};
//        int[][] result1 = solution.insert(intervals1, newInterval1);
//
//        System.out.println("Merged Intervals for Test Case 1:");
//        for (int[] interval : result1) {
//            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
//        }

        // Test case 2
        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        int[][] result2 = solution.insert(intervals2, newInterval2);

        System.out.println("Merged Intervals for Test Case 2:");
        for (int[] interval : result2) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
