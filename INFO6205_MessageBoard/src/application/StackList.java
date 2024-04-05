package application;

interface StackList<T> {
	void push(T item);

	T pop();

	T peek();

	boolean isEmpty();

	void sort();
}
