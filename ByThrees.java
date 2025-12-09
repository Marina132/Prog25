class By Threes interface Series {
   int start;
  int val;

  ByThrees() {
    start = 0;
    val = 0;
  }
  public int get Next() {
    val += 3;
    return val;
  }
  public void reset() {
    val = start;
  }
  public void setStart(int x) {
    start = x;
    val = x;
  }
}
