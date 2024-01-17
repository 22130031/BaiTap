package Lab11;


import java.util.Collection;
import java.util.List;

public class BNode<E extends Comparable<E>> {
	E data;
	BNode<E> myleft;
	BNode<E> myright;

	public BNode(E data) {
		this.data = data;

	}

	public BNode(E data, BNode<E> left, BNode<E> right) {
		this.data = data;
		this.myleft = left;
		this.myright = right;
	}
	public class BST<E extends Comparable<E>> {
		private BNode<E> root;

		public BST() {
			this.root = null;
		}

		// Add element e into BSTs
		public void add(BNode<E> current, E e) {
			if(root == null)
				this.root = new BNode<E>(e);
				else
					this.root.add(e);
		}

		// Add a collection of elements col into BST
		public void add(Collection<E> col) {
			for (E e : col) {
				add(root, e);
			}
		}

		// compute the depth of a node in BST
		public int depth(BNode<E> current, E node, int depth) {
			if (current == null) {
				return -1;
			}
			if (current.data.equals(node)) {
				return depth;
			}
			int leftDepth = depth(current.myleft, node, depth + 1);
			if (leftDepth != -1) {
				return leftDepth;
			}
			return depth(current.myright, node, leftDepth);
		}

		// compute the height of BST
		public int height(BNode<E> node) {
			int leftHeight = height(node.myleft);
			int rightHeight = height(node.myright);
			return Math.max(leftHeight, rightHeight) + 1;
		}

		// Compute total nodes in BST
		public int size(BNode<E> node) {
			int leftSize = size(node.myleft);
			int rightSize = size(node.myright);
			return leftSize + rightSize + 1;
		}

		// Check whether element e is in BST
		public boolean contains(BNode<E> current, E e) {
			if (current == null) {
				return false;
			}
			if (e.compareTo(current.data) == 0) {
				return true;
			}
			return e.compareTo(current.data)<0 ? contains(current.myleft, e): contains(current.myright, e);
		}

		// Find the minimum element in BST
		public E findMin(BNode<E> node) {
			if(node.myleft == null) {
				return node.data;
			}
			else
			return findMin(node.myleft);
		}

		// Find the maximum element in BST
		public E findMax(BNode<E> node) {
			if(node.myright == null) {
				return node.data;
			}
			else
			return findMax(node.myright);
		}

		// Remove element e from BST
		public boolean remove(E e) {
			// TODO
			return false;
		}

		// get the descendants of a node
		public List<E> descendants(E data) {
			// TODO
			return null;
		}

		// get the ancestors of a node
		public List<E> ancestors(E data) {
			// TODO
			return null;
		}// display BST using inorder approach

		public void inorder() {
			// TODO
		}

		// display BST using preorder approach
		public void preorder() {
			// TODO
		}

		// display BST using postorder approach
		public void postorder() {
			// TODO
		}
		public static void main(String[] args) {
			
		}
	}
	public static void main(String[] args) {
	
	}

	public void add(E e) {
		// TODO Auto-generated method stub
		
	}
}


