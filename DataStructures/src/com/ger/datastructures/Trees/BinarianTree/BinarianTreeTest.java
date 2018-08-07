package com.ger.datastructures.Trees.BinarianTree;

import com.ger.datastructures.Main;

public class BinarianTreeTest {


    public static void main(String[] args) {
        BinarianTree tree = new BinarianTree();

        createTree:
        {
            int[] treeValues = {12, 45, 87, 92, 20, 78, 10, 2, 4, 9, 78, 24, 63, 47};

            for (int i = 0; i < treeValues.length; i++) {
                tree.insert(treeValues[i]);
            }
        }


//        Main.p("In Order");
//        tree.inOrder(tree.getRoot());
//        Main.p("");
//        Main.p("Pre Order");
//        tree.preOrder(tree.getRoot());
//        Main.p("");
//        Main.p("Post Order");
//        tree.postOrder(tree.getRoot());


//       BinarianTreeNode found = tree.find(10, tree.getRoot());
//        Main.p(found);

//tree.printLeaves(tree.getRoot());



    }

}
