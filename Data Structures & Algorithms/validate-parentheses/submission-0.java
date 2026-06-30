class Solution {
    Map<Character, Character> pairs = Map.of(
        ')', '(',
        '}', '{',
        ']', '['
    );

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (!pairs.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
