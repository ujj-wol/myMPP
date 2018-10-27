package lesson11.labs.prob7.mystream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
	private List<T> elements;
	public static <T> MyStream<T> of(List<T> aList) {
		return new MyStream<>(aList);
	}
	private MyStream(List<T> aList) {
		elements = new ArrayList<>(aList);
	}
	
	public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
		List<S> l1 = s1.asList();
		List<S> l2 = s2.asList();
		
		for (S s : l2) {
			l1.add(s);
		}
		return of(l1);
	}
	
	public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
		List<MyStream<R>> sl = new ArrayList<>();
		
		for (T t : elements) {
			sl.add(mapper.apply(t));
		}
		
		List<R> list = new ArrayList<>();
		for (MyStream<R> myStream : sl) {
			list.addAll(myStream.asList());
		}
		return of(list);
	}
	
	public List<T> asList() {
		return elements;
	}
	
	public <R> MyStream<R> map(Function<T,R> mapper) {
		List<R> rl = new ArrayList<>();
		for (T t : elements) {
			rl.add(mapper.apply(t));
		}
		return of(rl);
	}
	
	public MyStream<T> filter(Predicate<T> predicate) {
		List<T> list = asList();
		List<T> filtered = new ArrayList<>();
		for (T t : list) {
			if(predicate.test(t)) {
				filtered.add(t);
			}
		}
		return of(filtered);
	}
}
