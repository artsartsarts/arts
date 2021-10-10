class Logger {

   private List<Set<String>> ar;
  private int pre;
    /** Initialize your data structure here. */
    public Logger() {
        ar = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      ar.add(new HashSet<>());
    }
    pre = -1;
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
           evict(timestamp);
    if (!(pre == -1 || pre + 10 <= timestamp)) {
      for (int i = timestamp + 1; i <= (pre + 10); i++) {
        if (ar.get(i % 10).contains(message)) {
          return false;
        }
      }
    }
    ar.get(timestamp % 10).add(message);
    pre = timestamp;
    return true;
    }
    
    private void evict(int timestamp) {
       if (pre == -1) {
      return;
    }
    if (pre + 10 <= timestamp) {
      for (int i = 0; i < 10; i++) {
        ar.set(i, new HashSet<>());
      }
      return;
    }
    for (int i = pre + 1; i <= timestamp; i++) {
      ar.set(i % 10, new HashSet<>());
    }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
