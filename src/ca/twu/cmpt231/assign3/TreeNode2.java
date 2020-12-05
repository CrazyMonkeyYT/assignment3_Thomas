package ca.twu.cmpt231.assign3;

/**
 * This class provides the implementation of a tree node
 * 
 * The codes is copied from:
 * http://www.java2s.com/ref/java/java-algorithms-binary-search-tree-animation.html
 *
 * @param <E>
 */

class TreeNode2<E> implements AVLTreeNode<E> {
	public E element;
	public TreeNode2<E> left;
	public TreeNode2<E> right;

	public TreeNode2(E e) {
		element = e;
	}

	/**
	 * set element
	 * 
	 * @param e
	 */
	public void setElement(E e) {
		this.element = e;
	}

	/**
	 * return element
	 * 
	 * @return
	 */
	public E getElement() {
		return element;
	}

	/**
	 * set left child node
	 */
	public void setLeft(AVLTreeNode<E> node) {
		left = (TreeNode2<E>) node;

	}

	/**
	 * set right child node
	 */
	public void setRight(AVLTreeNode<E> node) {
		right = (TreeNode2<E>) node;
	}

	/**
	 * return left child node
	 */
	public AVLTreeNode getLeft() {
		return left;
	}

	/**
	 * return right child node
	 */
	public AVLTreeNode getRight() {
		return right;
	}
}
