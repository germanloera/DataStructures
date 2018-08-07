package com.ger.datastructures.Trees.BinarianTree;

public class BinarianTreeNode {
    private BinarianTreeNode left;
    private BinarianTreeNode right;
    private int value;

    public BinarianTreeNode(int value) {
        this.value = value;
    }

    public BinarianTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinarianTreeNode left) {
        this.left = left;
    }

    public BinarianTreeNode getRight() {
        return right;
    }

    public void setRight(BinarianTreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "Node Value: " + value;
    }
}
