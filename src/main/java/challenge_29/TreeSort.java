package challenge_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Tree sort is a sorting algorithm that is based on Binary Search Tree data structure. It first creates a binary search
tree from the elements of the input list or array and then performs an in-order traversal on the created binary
search tree to get the elements in sorted order.

Advantages of TreeSort:
TreeSort is an in-place sorting algorithm, which means it doesn't require additional memory
proportional to the input size. It's stable, meaning it preserves the order of equal elements.

Disadvantages of TreeSort:
TreeSort's performance can degrade to O(n^2) if the input list is already sorted or nearly sorted,
as it can lead to a highly unbalanced tree.
It's generally less efficient than some other sorting algorithms like QuickSort or MergeSort in practice.


 */
public class TreeSort {
    private TreeNode root;

    public void treeSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        root = null;


        for (int value : arr) {
            insert(value);
        }


        List<Integer> sortedList = inOrderTraversal(root);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedList.get(i);
        }
    }

    private void insert(int data) {
        root = insert(root, data);
    }

    private TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    private List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.data);
            current = current.right;
        }

        return result;
    }

}
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
