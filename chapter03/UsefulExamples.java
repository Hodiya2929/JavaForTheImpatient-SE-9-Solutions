package chapter03;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import static java.util.function.Consumer.*;

public class UsefulExamples {


	public static void main(String[] args) {

		var list = new ArrayList<Point>(10);

		var rand = new Random();

		//Fulfilling an array with 10 random points
		for (int i = 0; i < 10; i++) { 
			list.add(new Point(rand.nextInt(100), rand.nextInt(100)));

			System.out.println(list.get(i));
		}

		//Testing the consumer<T> interface with anonymous class
		list.forEach(new Consumer<Point>() {

			@Override
			public void accept(Point t) {

				t.x=0;
				t.y=0;
			}
		});

		for (Point point : list) 
			System.out.println(point);

		System.out.println("--------------------------------");


		//Testing the consumer<T> interface with Lambda expression
		list.forEach((p)->{p.x=rand.nextInt(1000); p.y= rand.nextInt(1000); System.out.println(p);});

		System.out.println("--------------------------------");

		//Testing the consumer<T> interface with method reference
		list.forEach( System.out::println );

		Consumer<Point> consumer = ((Point p)->{p.x=-1;});
		consumer.andThen(consumer);

		testingConsumer(list, consumer);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		for (Point point : list) 
			System.out.println(point);

		testingConsumer(list, (p)->{p.x=0;});


	}
	public static <T> void testingConsumer(List<T> list,Consumer<T> consumer) {

		for (int i = 0; i < list.size(); i++) {

			if(i%2==0)
				consumer.accept(list.get(i));


		}


	}
}
