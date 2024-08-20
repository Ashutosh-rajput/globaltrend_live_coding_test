import java.util.Stack;

class UniexPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");

        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
            if (str[i].equals("..")) {
//                System.out.println("test1");

//                System.out.println(stack.pop());
//                System.out.println(stack.pop());
                stack.pop();
            } else if (!str[i].equals(".")) {
                stack.push(str[i]);
            }
        }

        path = "";
        while (!stack.isEmpty()) {
            System.out.println(path +"-   1");

            String temp=stack.pop();;
            path = "/" + temp + path;
            System.out.println(temp+"-  temp 2");
        }

        return path;
    }

    public static void main(String[] args) {
        UniexPath solution = new UniexPath();

        String path1 ="/home/user/Documents/../Pictures";
//        String path2 = "/../";
//        String path3 = "/home//foo/";
        String path4 = "/a/./b/../../c/";

        System.out.println("Simplified Path 1: " + solution.simplifyPath(path1)); // Test case
//        System.out.println("Simplified Path 2: " + solution.simplifyPath(path2)); // Test case
//        System.out.println("Simplified Path 3: " + solution.simplifyPath(path3)); // Test case
//        System.out.println("Simplified Path 4: " + solution.simplifyPath(path4)); // Test case
    }
}
