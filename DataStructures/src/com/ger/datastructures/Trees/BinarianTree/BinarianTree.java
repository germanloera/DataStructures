package com.ger.datastructures.Trees.BinarianTree;

import com.ger.datastructures.Main;

public class BinarianTree {
    private BinarianTreeNode root;



    public void insert(int value){
        if(root == null){
            root =  new BinarianTreeNode(value);
            return;
        }



        insertNewNode(value, root);

        Main.p("");
    }

    private void insertNewNode(int value, BinarianTreeNode _root){

        if(_root.getValue() == value){
            return;
        }else if(value < _root.getValue() ){


            if(_root.getLeft() == null){
                _root.setLeft(new BinarianTreeNode(value));

            }else {
                insertNewNode(value, _root.getLeft());
            }


        }else{
            if(_root.getRight() == null){
                _root.setRight(new BinarianTreeNode(value));

            }else {
                insertNewNode(value, _root.getRight());
            }
        }


    }


    public BinarianTreeNode getRoot() {
        return root;
    }


    public void inOrder(BinarianTreeNode _root){
        if(_root == null){
            return;
        }

        inOrder(_root.getLeft());
        Main.p(_root.getValue());
        inOrder(_root.getRight());
    }

    public void postOrder(BinarianTreeNode _root){
        if(_root == null){
            return;
        }

        postOrder(_root.getLeft());
        postOrder(_root.getRight());
        Main.p(_root.getValue());

    }

    public void preOrder(BinarianTreeNode _root){
        if(_root == null){
            return;
        }
        Main.p(_root.getValue());
        preOrder(_root.getLeft());
        preOrder(_root.getRight());


    }



    public BinarianTreeNode find(int value, BinarianTreeNode _root){

        if(_root == null){
            Main.p("Object Not Found");
            return null;
        }

        if(_root.getValue() == value){
            Main.p("Object Found");
            return _root;
        }

        if(value <  _root.getValue()   ){
           return find(value, _root.getLeft());
        }else{
           return find(value, _root.getRight());
        }


    }


    public void printLeaves(BinarianTreeNode _root){
        if(_root == null){
            return;
        }

        printLeaves(_root.getLeft());
        printLeaves(_root.getRight());
        if(_root.getLeft() == null && _root.getRight() == null){
            Main.p(_root.getValue());
        }

    }






}
