//Управляющие операторы
class Pr006 {
	public static void main(String args[]) 
	  throws java.io.IOException {
	    //Клавиатурный ввод символа  
	    char ch, temp;
	    System.out.print("Введите символ с клавиатуры     ");
	    ch = (char) System.in.read();
	    System.out.println("Введен символ  " + ch);
	    temp = (char) System.in.read();

	    //Угадывание значения символьной переменной
	    /*char answer = 'D';
	    System.out.println("Введите символ . . .");
	    ch = (char) System.in.read();

	    //Демонстрация работы оператора if()
	    if(ch == answer)
		    System.out.println("Символы совпали");
	    else {
		    System.out.println("Символы не совпали " + ch);
		    if (ch < answer)
			    System.out.println("Нужный символ ближе к концу алфавита");
		    else
			    System.out.println("Нужный символ ближе к началу алфавита");
	    }*/
	   //Вложеный оператор if()
	   int i = 10, j= 15, k = 15, a = 0, b = 77, c = 0, d = 88;
	   if(i != 10) {
	   	if(j < 20) a = b;
		if(k > 100) c = d;
		else {
			c = 25;
		       	a = c;
	   
		}
	   }		
	   else a = d;
	   
	   System.out.println("i = " + i + " j = " + j + " k = " + k);
	   System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);

	   //Многоступенчатая конструкция if-else-if
	   System.out.println();
	   for (i=0; i<6;i++) {
	   	if(i==1) System.out.println("i = 1");
		else if (i==2) System.out.println("i = 2");
		else if (i==3) System.out.println("i = 3");
		else if (i==4) System.out.println("i = 4");
		//Все оставшиеся варианты выведут значения, указанные ниже
		else System.out.println("Значение i не равно ни одному значению от 1 до 4");
	   }
	   //оператор switch
	   System.out.println("\nДемонстрация работы оператора switch()");
	   for(i=0;i<10;i++)
		   switch(i) {
			   case 0:
				System.out.println("i = 0");
				break;
			   case 1:
			        System.out.println("i = 1");
				break;
			   case 2:
				System.out.println("i = 2");
				break;
	 		   case 3:
				System.out.println("i = 3");
			   case 4:
				System.out.println("i = 4");
			   default:
				System.out.println("i >= 5");
		   }
	  
	   //Вложенные операторы switch
	   System.out.println();
	   ch = 'R';
	   char ch1 = 'A';
	   switch(ch) {
	   	case 'A':
			System.out.println("Значение A внешнего оператора switch");
			switch (ch1) {
				case 'A':
					System.out.println("Значение А внутреннегооператора switch");
					break;
		       	}
			break;
		case 'R':
			System.out.println("Значение R внешнего оператора switch");
			switch (ch1) {
				case 'A':
					System.out.println("Значение А внутреннегооператора switch");
					break;
			}
			break;
		default:
			System.out.println("Значение по умолчанию для внешнего swich()");
	} 

	//Оператор цикла for
	System.out.println();
	double num, sroot, rerr;

	for(num = 1.0; num < 100.0; num++) {
		sroot = Math.sqrt(num);
		System.out.println("Квадратный корень из " + num + " равен " + sroot);

		//вычисление ошибки округления
		rerr = num - (sroot * sroot);
		System.out.println("Ошибка округления: " + rerr);
		System.out.println();
	}

	System.out.println();
	int x;
	for (x = 100; x > -100; x -=5);
		System.out.println(x);

	System.out.println("\nПример цикла, тело котороо не выполнится ни разу");
	for (x = 100; x > 100; x -=5);
		System.out.println(x);
	System.out.println("\nПосле цикла for");

	System.out.println();

	for (i=0, j=10; i<j; i++, j--);
		System.out.println("i = " + i + " j = " + j);

	//чтение символов с клавиатуры внутри цикла for
	System.out.println("\nВведите \'S\' для остановки цикла чтения с клавиатуры");
	for (i =0; (char) System.in.read() != 'S'; i++) {
		System.out.println("Итерацияя № " + i);
		System.out.println("Введите символ: ");
		temp = (char) System.in.read();
	}

	System.out.println();

	//Пропуск отдельных частей в определении цикла for
	System.out.println();
 	for(i=0;i<10;) {
		System.out.println("Итерацияя № " + i);
		i++;
	}
	//Бесконечный цикл
	System.out.println();
	for(;;) {
		System.out.println("Итерация №" + i);
		System.out.println("Для остановки цикла введите \'q\'");
		temp = (char) System.in.read();
		if (temp == 'q')
			break;
	}

	//циклы без тела
	System.out.println();
	int sum = 0;
	for(i = 1; i <= 5; sum +=i++);
	System.out.println("Значение sum: " + sum);

	//Объявление параметра цикла внутри цикла
	for(int ii = 1; ii <=10; sum += ii++);
	System.out.println("Значение sum: " + sum);
	//System.out.println("Значение ii: " + ii);
	
	//Цикл while()
	System.out.println();
	char ch3 = 'a';
	while (ch3 <= 'z') {
		System.out.print(ch3 + " ");
		ch3++;
	}
	System.out.println();

	System.out.println();
	int e, result;

	//Вычислеие целых степеней числа 2 при помощи for() и while()
		
	for(int ii = 0; ii < 10; ii++)  {
		result = 1;
		e = ii;
		while(e > 0) {
			result *= 2;
			e--;
		}
		System.out.println("2 в степени " + ii + " равно " + result);
	}

		  temp = (char) System.in.read();
		while (temp != '\n') {
			temp = (char) System.in.read();
		}

		//Цикл do - while()
		System.out.println();

		do {
			System.out.println("Введите символ: ");
			ch3 = (char) System.in.read();
		} while(ch3 != 'q');

		while (temp != '\n') {
			temp = (char) System.in.read();
		}

		System.out.println();

		//Угадывание символа при помощи do - while()
		char answer = 'R';
		char ch4;
		do {
			System.out.println("Требуется угадать нужный символ ");
			System.out.println("Введите символ с клавиатуры: ");

			ch4 = (char) System.in.read();
			System.out.println(ch4);

			if(ch4 == answer) System.out.println("Угадано");
			else {

				System.out.println("Неуданая ппытка, символ находится");
				if(ch4 < answer)
					System.out.println("Ближе к концу алфавита");
				else
					System.out.println("Ближе к началу алфавита");
				System.out.println("Введите символ повторно:\n");
			}

			temp = ' ';
				while(temp != '\n') {
					temp = (char) System.in.read();
				}
		}while(answer != ch4);
		  
	}
}
