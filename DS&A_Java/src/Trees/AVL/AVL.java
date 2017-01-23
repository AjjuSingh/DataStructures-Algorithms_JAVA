package Trees.AVL;

import Trees.BST.BSTNode;

public class AVL {

	AVLNode root;
	
	public void insertRec(int data)
	{
		AVLNode newNode=new AVLNode(data);
		if(root==null)
		{
			root=newNode;
		}
		else
			root=callInsert(root, newNode);
		
	}
	
	private AVLNode callInsert(AVLNode root,AVLNode newNode)
	{
		if (root!=null)
		{
			if(root.getData()>newNode.getData())
			{
				root.left=callInsert(root.left, newNode);
				if(height(root.left)-height(root.right)==2)
				{
					if(root.left==null)
					{
						root=RL(root);
					}
					else
						root=LL(root);
				}
			}
			else 
			{
				root.right=callInsert(root.right, newNode);
				if((height(root.right))-(height(root.left))==2)
				{
					if(root.right==null)
					{
						root=LR(root);
					}
					else
						root=RR(root);
						
				}
			}
		}
		else
			root=newNode;
		return root;
	}

	private AVLNode RL(AVLNode root) {
		root.right=LL(root.right);
		AVLNode temp=RR(root);
		
		return temp;
	}

	private AVLNode LL(AVLNode root) {
		
		AVLNode temp=root.left;
		root.left=temp.right;
		temp.right=root;
		return temp;
	}

	private AVLNode LR(AVLNode root) {
		root.left=RR(root.left);
		AVLNode temp=LL(root);
		
		return temp;
	}

	private AVLNode RR(AVLNode root) {
		
		AVLNode temp=root.right;
		root.right=temp.left;
		temp.left=root;
		return temp;
	}

	private int height(AVLNode node) {
		int l,r;

		if(node!=null)
		{
			l=height(node.left);
			r=height(node.right);
			if(l>r)
			{
				return l+1;
			}
			else
			{
				return r+1;
			}
		}
		return 0;
		
	}
	
	
	public void deleteRec(int data)
	{
		AVLNode newNode=new AVLNode(data);
		root=callDelete(root,newNode);
	}
	
	public AVLNode findMax(AVLNode root)
	{
		if(root!=null)
		{
			if(root.right!=null)
			{
				findMax(root.right);
				return root.right;
			}
			
		}
		return root;
	}

	private AVLNode callDelete(AVLNode root, AVLNode newNode) {
		AVLNode temp=null;
		
			if(root.getData()==newNode.getData())
			{
				if(root.left!=null && root.right!=null)
				{
					temp=findMax(root.left);
					root.setData(temp.getData());
					root.left=callDelete(root.left, temp);
				}
				else if(root.left!=null)
				{
					temp=root;
					root=root.left;
					temp=null;
				}
				else if(root.right!=null)
				{
					temp=root;
					root=root.right;
					temp=null;
				}
				else
				{
					temp=null;
				}
			
			}
			else if(root.getData()>newNode.getData())
			{
				root.left=callDelete(root.left,newNode);
				
				
				if((height(root.right))-(height(root.left))==2)
				{
					if(root.right==null)
					{
						root=LR(root);
					}
					else
						root=RR(root);
						
				}
			}
			else
			{
				root.right=callDelete(root.right, newNode);
				if(height(root.left)-height(root.right)==2)
				{
					if(root.left==null)
					{
						root=RL(root);
					}
					else
						root=LL(root);
				}
			
			}
			
			return root;
		}
	
		
	}

