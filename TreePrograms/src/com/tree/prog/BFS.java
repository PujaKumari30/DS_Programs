package com.tree.prog;

public class BFS
{
	Node root;
	public BFS(){
		root  = null;
	}
	
	int height(Node root)
	{
		if(root == null)
			return 0;
		int lheight = height(root.left);
		int rheight = height(root.right);
		if(lheight > rheight)
			return lheight +1;
		else return rheight +1;
	}
	
	void printLevelOrder()
	{
		int h = height(root);
		for(int i =1;i<=h;i++)
		{
			printGivenLevel(root,i);
		}
	}
	
	void printGivenLevel(Node root,int level)
	{
		if(root == null)
			return;
		if(level == 1)
		{
			System.out.print(root.data + " ");
		}
		
		else if(level > 1)
		{
		
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}
	}
	
	/* Using Queue */
	static void levelOrder(Node node) 
 	{
        	Queue<Node> queue = new LinkedList<Node>();
        	queue.add(node);
        	while(!queue.isEmpty())
        	{
            		Node temp = queue.poll();
           		System.out.print(temp.data+" ");
            		if(temp.left!=null)
            		queue.add(temp.left);
            		if(temp.right!=null)
            		queue.add(temp.right);
        	}
    	}
	
	public static void main(String args[])
	{
		BFS bfs = new BFS();
		bfs.root = new Node(1);
		bfs.root.left = new Node(2);
		bfs.root.right = new Node(3);
		bfs.root.left.right = new Node(4);
		bfs.root.left.right.left = new Node(5);
		bfs.root.right.right = new Node(6);
		bfs.root.right.right.left = new Node(7);
		
		System.out.print("Level order Traversl of given Binary Tree is : ");
		
		bfs.printLevelOrder();
		
	}
}

