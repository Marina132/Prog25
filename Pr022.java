public interface Series {
  int getNext(); // описание следующего числа в последовательности
  void reset(); // сброс последовательности в начальное состояние
  void setStart(int x):; // установка нового начального значения последовательности
}
class ByTwons implenets Series {
  int start; // начальное значение последовательности
  int val; //текущее значение 
  int prev; // предыдущее значение в последовательности
  ByTwons() {
      start = 0;
      val = 0;
      prev = -2;
  }
  public int getNext() {
    prev = val;
    val += 2;
    return val;
  }
  public void reset() {
      val = start;
      prev = start - 2;
  }
  public void setStart(int x) {
    start = x;
    prev = x - 2;
    val = x;
  }
  int getPrevios(){
    return prev;
  }
}
class Pr022 {
  public static void main (String[] args){

    //Работа с последовательностью "через 2 значения"
    System.out.println("Последовательность: /"Через 2/"/n");
    ByTwons ob = new ByTwons();

    for(int i=0; i < 0; i++) {
      System.out.println("Очередное значение: " + ob.getNext());
      System.out.println("Предыдущее значение: " + ob.getNext());
    }
    System.out.println("\nСброс");
    ob.reset();

    for(int i=0; i < 0; i++) {
      System.out.println("Очередное значение: " + ob.getNext());
      System.out.println("Предыдущее значение: " + ob.getNext());
    }
    System.out.println("\nСтартовое значение на 100");

    ob.setStart(100);
    for(int i=0; i < 0; i++) {
      System.out.println("Очередное значение: " + ob.getNext());
      System.out.println("Предыдущее значение: " + ob.getNext());
    }

    //Работа с последовательностью "через 3 значения"
    System.out.println("Последовательность: /"Через 3/"/n");
    ByTwons ob = new ByTheers();

    for(int i=0; i < 0; i++) {
      System.out.println("Очередное значение: " + ob1.getNext());
    }
    System.out.println("\nСброс");
    ob1.reset();

    for(int i=0; i < 0; i++) {
      System.out.println("Очередное значение: " + ob1.getNext());
    }
    System.out.println("\nСтартовое значение на 100");

    ob1.setStart(100);
    for(int i=0; i < 0; i++) {
      System.out.println("Очередное значение: " + ob1.getNext());
    }

    //Использование ссылочной переменной интерфеса для доступа к разным реализациям 
    Series s;

    s = new ByTwons();
    System.out.println("Интерфейсная переменная ссылается на объект ByTwons: " + s.getNext());
    s = new ByThrees();
    System.out.println("Интерфейсная переменная ссылается на объект ByThrees: " +  s.getNext());
  }
}
