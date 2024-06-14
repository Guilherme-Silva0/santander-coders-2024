package dataStructure;

public class BST {
  public Node root;

  public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
      this.value = value;
    }
  }

  public void insert(int value) {
    if (root == null) {
      root = new Node(value);
      return;
    }
    insert(root, value);

  }

  private void insert(final Node node, int value) {
    if (node == null || node.value == value) {
      return;
    }

    if (value > node.value) {
      if (node.right == null) {
        node.right = new Node(value);
      } else {
        insert(node.right, value);
      }
    }

    if (value < node.value) {
      if (node.left == null) {
        node.left = new Node(value);
      } else {
        insert(node.left, value);
      }
    }
  }

  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(final Node node) {
    if (node == null)
      return;

    inOrder(node.left);
    System.out.println(node.value);
    inOrder(node.right);
  }

  public boolean contains(int value) {
    return contains(root, value);
  }

  private boolean contains(Node node, int value) {
    if (node == null) {
      return false;
    }

    if (node.value == value) {
      return true;
    }

    if (value > node.value) {
      return contains(node.right, value);
    } else {
      return contains(root.left, value);
    }
  }

  public int minValue(Node currentNode) {
    while (currentNode.left != null) {
      currentNode = currentNode.left;
    }
    return currentNode.value;
  }

  public void deleteNode(int value) {
    root = deleteNode(root, value);
  }

  private Node deleteNode(Node node, int value) {
    if (node == null) {
      return null;
    }

    if (value < node.value) {
      node.left = deleteNode(node.left, value);
    } else if (value > node.value) {
      node.right = deleteNode(node.right, value);
    } else {
      // Caso 1: Nenhum filho
      if (node.left == null && node.right == null) {
        return null;
      }
      // Caso 2: Um filho
      else if (node.left == null) {
        return node.right;
      } else if (node.right == null) {
        return node.left;
      }
      // Caso 3: Dois filhos
      else {
        int minValue = minValue(node.right);
        node.value = minValue;
        node.right = deleteNode(node.right, minValue);
      }
    }
    return node;
  }

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();

    BST tree = new BST();
    tree.insert(37);
    tree.insert(66);
    tree.insert(42);
    tree.insert(11);
    tree.insert(72);
    tree.insert(8);
    tree.insert(17);

    tree.deleteNode(66);

    tree.inOrder();
  }
}
