package TreesTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllTreeTesting {

	@Test
	public void testCeilInBinarySearchTree() {
		assertNull(CeilInBinarySearchTree.getCeil(null, 9));
		Node root1 = TreeTestUtils.createTree(new Integer[]{100, 10, 200});
		assertEquals(100, CeilInBinarySearchTree.getCeil(root1, 100).data);
		Node root2 = TreeTestUtils.createTree(new Integer[]{100, 10, 200});
		assertEquals(10, CeilInBinarySearchTree.getCeil(root2, 10).data);
		Node root3 = TreeTestUtils.createTree(new Integer[]{100, 10, 200, 5, 50, 150, 300});
		assertEquals(100, CeilInBinarySearchTree.getCeil(root3, 75).data);
		Node root4 = TreeTestUtils.createTree(new Integer[]{100, 10, 200, 5, 50, 150, 300});
		assertEquals(50, CeilInBinarySearchTree.getCeil(root4, 40).data);
		Node root5 = TreeTestUtils.createTree(new Integer[]{100, 10, 200, 5, 50, 150, 300});
		assertEquals(5, CeilInBinarySearchTree.getCeil(root5, 1).data);
		Node root6 = TreeTestUtils.createTree(new Integer[]{100, 10, 200, 5, 50, 150, 300});
		assertNull(CeilInBinarySearchTree.getCeil(root6, 400));
	}

	KDTree.Point pointOf(int x, int y) {
		return new KDTree.Point(new int[] { x, y });
	}

	@Test
	void findMin() {
		int[][] coordinates = {
				{ 30, 40 },
				{ 5, 25 },
				{ 70, 70 },
				{ 10, 12 },
				{ 50, 30 },
				{ 35, 45 },
		};
		KDTree kdTree = new KDTree(coordinates);
		assertEquals(5, kdTree.findMin(0).getCoordinate(0));
		assertEquals(12, kdTree.findMin(1).getCoordinate(1));
	}

	@Test
	void delete() {
		int[][] coordinates = {
				{ 30, 40 },
				{ 5, 25 },
				{ 70, 70 },
				{ 10, 12 },
				{ 50, 30 },
				{ 35, 45 },
		};
		KDTree kdTree = new KDTree(coordinates);
		kdTree.delete(pointOf(30, 40));
		assertEquals(35, kdTree.getRoot().getPoint().getCoordinate(0));
		assertEquals(45, kdTree.getRoot().getPoint().getCoordinate(1));
	}

	@Test
	void findNearest() {
		int[][] coordinates = {
				{ 2, 3 },
				{ 5, 4 },
				{ 9, 6 },
				{ 4, 7 },
				{ 8, 1 },
				{ 7, 2 },
		};
		KDTree kdTree = new KDTree(coordinates);
		assertEquals(pointOf(7, 2), kdTree.findNearest(pointOf(7, 2)));
		assertEquals(pointOf(8, 1), kdTree.findNearest(pointOf(8, 1)));
		assertEquals(pointOf(2, 3), kdTree.findNearest(pointOf(1, 1)));
		assertEquals(pointOf(5, 4), kdTree.findNearest(pointOf(5, 5)));
	}

	@Test
	void build() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		SegmentTree lazySegmentTree = new SegmentTree(arr);
		assertEquals(55, lazySegmentTree.getRoot().getValue());
		assertEquals(15, lazySegmentTree.getRoot().getLeft().getValue());
		assertEquals(40, lazySegmentTree.getRoot().getRight().getValue());
	}

	@Test
	void update() {
		int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		SegmentTree lazySegmentTree = new SegmentTree(arr);
		assertEquals(10, lazySegmentTree.getRoot().getValue());

		lazySegmentTree.updateRange(0, 2, 1);
		assertEquals(12, lazySegmentTree.getRoot().getValue());

		lazySegmentTree.updateRange(1, 3, 1);
		assertEquals(14, lazySegmentTree.getRoot().getValue());

		lazySegmentTree.updateRange(6, 8, 1);
		assertEquals(16, lazySegmentTree.getRoot().getValue());

		lazySegmentTree.updateRange(3, 9, 1);
		assertEquals(22, lazySegmentTree.getRoot().getValue());
	}

	@Test
	void get() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		SegmentTree lazySegmentTree = new SegmentTree(arr);
		assertEquals(55, lazySegmentTree.getRange(0, 10));
		assertEquals(3, lazySegmentTree.getRange(0, 2));
		assertEquals(19, lazySegmentTree.getRange(8, 10));
		assertEquals(44, lazySegmentTree.getRange(1, 9));
	}

	@Test
	void updateAndGet() {
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		SegmentTree lazySegmentTree = new SegmentTree(arr);

		for (int i = 0; i < 10; i++) for (int j = i + 1; j < 10; j++) {
			lazySegmentTree.updateRange(i, j, 1);
			assertEquals(j - i, lazySegmentTree.getRange(i, j));
			lazySegmentTree.updateRange(i, j, -1);
			assertEquals(0, lazySegmentTree.getRange(i, j));
		}
	}
	
	@Test
    public void testSymmetric() {
        assertTrue(CheckTreeIsSymmetric.isSymmetric(null));
        Node root1 = TreeTestUtils.createTree(new Integer[]{100});
        assertTrue(CheckTreeIsSymmetric.isSymmetric(root1));
        Node root2 = TreeTestUtils.createTree(new Integer[]{1,2,2,3,4,4,3});
        assertTrue(CheckTreeIsSymmetric.isSymmetric(root2));
        Node root3 = TreeTestUtils.createTree(new Integer[]{1,2,2,3,5,4,3});
        assertFalse(CheckTreeIsSymmetric.isSymmetric(root3));
    }
}
