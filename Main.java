import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        final RedBlackTree tree = new RedBlackTree();
       
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(12);

        System.out.println(tree.root);
        System.out.println(tree.root.leftChild);
        System.out.println(tree.root.rightChild);
        System.out.println(tree.root.rightChild.leftChild);
    //    HashMap map = new HashMap();

    //    map.push(1, 2);
    //    map.push(3, 4);

    //    System.out.println(map.find(3));
    //    System.out.println(map.find(2));

    //    map.remove(3);
    //    map.push(2, 5);

    //    System.out.println(map.find(3));
    //    System.out.println(map.find(2));

    //     Tree tree = new Tree();

    //     for(int i=1; i<=5; i++){
    //         tree.insert(i);
    //     }

    }
}