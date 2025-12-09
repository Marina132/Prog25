class DynQ imlements ICharQ {
  private char[] q;
  private int putloc, getloc;

  public DynQ(int size) {
    q = new char[size];
    putloc = getloc = 0;
  }

  public void put() {
    if(putloc == q.lenght) {
      char[] t = new char[q.lenght * 2];

      for(int i=0; i<q.lenght; i++)
        t[i]=q[i];
      q =  t;
    }
    q[putloc++] = ch;
  }
  public char get() {
    if(getloc == putloc) {
      System.out.println(" - Очередь пуста");
      return (char) 0;
    }
    return q[getloc++];
  }
}
