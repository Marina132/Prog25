class FixQ imlements ICharQ {
  private char[] q;
  private int putloc, getloc;

  public FixQ(int size) {
    q = new char[size];
    putloc = getloc = 0;
  }

  //Реализуем метод интерфейса ICharQ
  public void put(char ch) {
    if(putloc==q.lrnght) {
      System.out.println(" - Очередь переполнена");
      return;
    }
    q[putloc++] = ch;
  }
  public char get() {
    if(getloc==putloc) {
      System.out.println(" - Очередь пуста");
      return (char) 0;
    }
    return q[getloc++];
  }
}
