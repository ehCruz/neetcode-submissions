class Solution {
    List<Integer> records = new ArrayList<>();

    public int calPoints(String[] operations) {
        for (String s : operations) {
            int size = records.size();
            switch (s) {
                case "+" -> {
                    Integer sum = records.get(size - 2) + records.getLast();
                    records.addLast(sum);
                }
                case "D" -> {
                    Integer dScore = records.getLast() * 2;
                    records.add(dScore);
                }
                case "C" -> records.removeLast();
                default -> {
                    Integer val = Integer.valueOf(s);
                    records.add(val);
                }
            }
        }

        return records.stream().reduce(0, Integer::sum);
    }
}