package Task1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
	public class MyArrayList<E> {
		public static final int DEFAULT_CAPACITY = 10;
		private E[] elements;
		private int size;

		public MyArrayList() {
			this.elements = (E[]) new Object[DEFAULT_CAPACITY];
		}

		public MyArrayList(int capacity) {
			this.elements = (E[]) new Object[capacity];
		}

		public void growSize() {
			int newSize = elements.length * 2;
			elements = Arrays.copyOf(elements, newSize);
		}

		public int size() {
			return elements.length;
		}

		public boolean isEmpty() {
			return elements.length == 0;
		}

		public E get(int i) throws IndexOutOfBoundsException {
			if (i < 0 || i >= elements.length) {
				throw new IndexOutOfBoundsException("Index " + i + " is out of bounds!");
			}
			return elements[i];
		}

		public E set(int i, E e) throws IndexOutOfBoundsException {
			if (i < 0 || i >= elements.length) {
				throw new IndexOutOfBoundsException("Index " + i + " is out of bounds!");
			}
			E replacedElement = elements[i];
			elements[i] = e;
			return replacedElement;
		}

		public boolean add(E e) {
			if (size == elements.length) {
				growSize();
			}
			elements[size++] = e;
			return true;
		}

		public void add(int i, E e) throws IndexOutOfBoundsException {
			ArrayList<E> list = new ArrayList<E>();
			list.add(i, e);
		}

		public E remove(int i) throws IndexOutOfBoundsException {
			if (i < 0 || i >= elements.length) {
				throw new IndexOutOfBoundsException("Index " + i + " is out of bounds!");
			}
			E removedElement = elements[i];
			for (int j = i; j < size - 1; j++) {
				elements[j] = elements[j + 1];
			}
			size--;
			return removedElement;
		}

		public void clear() {

			for (int i = 0; i < elements.length; i++) {
				elements[i] = null;
			}
			size = 0;
		}

		public int lastIndexOf(Object o) {
			if (o == null) {
				for (int i = size - 1; i >= 0; i--)
					if (elements[i] == null)
						return i;
			} else {
				for (int i = size - 1; i >= 0; i--)
					if (o.equals(elements[i]))
						return i;
			}
			return -1;
		}

		public E[] toArray() {
			E[] array = (E[]) new Object[size];
			for (int i = 0; i < size; i++)
				array[i] = elements[i];
			return array;
		}

		public MyArrayList<E> clone() {
			MyArrayList<E> clonedList = new MyArrayList<E>(this.size);
			for (int i = 0; i < this.size; i++) {
				clonedList.elements[i] = this.elements[i];
			}
			clonedList.size = this.size;
			return clonedList;
		}

		public boolean contains(E o) {
			for (int i = 0; i < size; i++) {
				if (elements[i] == null) {
					if (o == null)
						return true;
				} else {
					if (elements[i].equals(o))
						return true;
				}
			}
			return false;
		}

		public int indexOf(E o) {
			if (o == null) {
				for (int i = 0; i < size; i++)
					if (elements[i] == null)
						return i;
			} else {
				for (int i = 0; i < size; i++)
					if (o.equals(elements[i]))
						return i;
			}
			return -1;
		}

		public boolean remove(E e) {
			int index = indexOf(e);
			if (index == -1) {
				return false;
			} else {
				remove(index);
				return true;
			}
		}

		public void sort(Comparator<E> c) {
			Arrays.sort(elements,0,size,c);
		}
	}
}
