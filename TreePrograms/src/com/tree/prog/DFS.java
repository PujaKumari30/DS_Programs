package com.tree.prog;

public class DFS {

	Node root;
	public DFS()
	{
		root = null;
	}
	
	void Inorder(Node root)
	{
		if(root == null)
			return;
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}
	
	void Preorder(Node root)
	{
		if(root == null)
			return;
		System.out.print(root.data + " ");
		Preorder(root.left);
		Preorder(root.right);
	}
	
	void Postorder(Node root)
	{
		if(root == null)
			return;
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	void Inorder()
	{
		Inorder(root);
	}
	
	void Preorder()
	{
		Preorder(root);
	}
	
	void Postorder()
	{
		Postorder(root);
	}
	
	
	public static void main(String args[])
	{
		DFS dfs = new DFS();
		dfs.root = new Node(1);
		dfs.root.left = new Node(2);
		dfs.root.right = new Node(3);
		dfs.root.left.right = new Node(4);
		dfs.root.left.right.left = new Node(5);
		dfs.root.right.right = new Node(6);
		dfs.root.right.right.left = new Node(7);
		
		System.out.print("Inorder Traversl of given Binary Tree is : ");
		dfs.Inorder();
		System.out.print("\nPreorder Traversl of given Binary Tree is : ");
		dfs.Preorder();
		System.out.print("\nPostorder Traversl of given Binary Tree is : ");
		dfs.Postorder();
		
	}
}

