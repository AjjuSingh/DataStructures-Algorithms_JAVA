package Trees.BinaryTrees;
import java.util.Stack;

import sun.misc.Queue;

public class BinaryTree {

	int n=0;
	BNode root=null;
	
	public void insert(int k,int d)
	{
		BNode newNode=new BNode(k,d);
		
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			BNode temp=root;
			BNode cur=null;
			while(temp!=null)
			{
				cur=temp;
				
				if(temp.getKey()>=k)
				{
					temp=temp.left;
					if(temp==null)
					{
						cur.left=newNode;
					}
				}
				else
				{
					temp=temp.right;
					if(temp==null)
					{
						cur.right=newNode;
					}
				}
				
			}
			
			
		}
	}
	
	
	public void insertRecursively(int k,int d)
	{
		BNode newNode=new BNode(k,d);
		
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			callInsert(root,newNode);
		}
	}


	private void callInsert(BNode root, BNode newNode) {
		
		if(root.getKey()>=newNode.getKey())
		{
			if(root.left==null)
			{
				root.left=newNode;
			}
			else
			{
				callInsert(root.left,newNode);
			}
		}
		else
		{
			if(root.right==null)
			{
				root.right=newNode;
			}
			else
			{
				callInsert(root.right,newNode);
			}
		}
	}
	
	
	public void printTree() throws Exception
	{
		Queue<BNode> q=new Queue();
	
		q.enqueue(root);
		
		while(!q.isEmpty())
		{
		
			BNode temp=q.dequeue();
			System.out.println(temp.getKey());
			if(temp.left!=null)
			{
				q.enqueue(temp.left);
			}
			if(temp.right!=null)
			{
				q.enqueue(temp.right);
			}
		
		}
		
	}
	
	public BNode deepestNode() throws InterruptedException
	{
		Queue<BNode> q=new Queue();
		
		q.enqueue(root);
		BNode temp=null;
		
		while(!q.isEmpty())
		{
		
			temp=q.dequeue();
			if(temp.left!=null)
			{
				q.enqueue(temp.left);
			}
			if(temp.right!=null)
			{
				q.enqueue(temp.right);
			}
		
		}
		return temp;
	}
	
	public void delete(int k) throws Exception
	{
		BNode dNode=deepestNode();
		BNode temp=new BNode(dNode.getKey(),dNode.getData());
		BNode pos=search(k);
		if(pos!=null)
		{
			
		}
		else
		{
			
		}

	}
	
	
	
	public BNode search(int k) throws Exception
	{
		if(root==null)
		{
			throw new Exception("root is empty");
		}
		BNode temp=root;
		while(temp!=null)
		{
		if(temp.getKey()>k)
		{
			temp=temp.left;
		}
		else if(temp.getKey()<k)
		{
			temp=temp.right;
		}
		else if(temp.getKey()==k)
		{
			return temp;
		}
		
		}
		return null;
	}
	
	
	
	
	public void preOrder(BNode root)
	{
		if(root!=null)
		{
			System.out.println(root.getData());
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void inOrder(BNode root)
	{
		if(root!=null)
		{
			preOrder(root.left);
			System.out.println(root.getData());
			preOrder(root.right);
		}
	}
	public void postOrder(BNode root)
	{
		if(root!=null)
		{
			
			preOrder(root.left);
			preOrder(root.right);
			System.out.println(root.getData());
		}
	}
	
	public void preOrderNonRec() throws Exception
	{
		Stack<BNode> s=new Stack();
		s.push(root);
		String result="";
		while(!s.isEmpty())
		{
			BNode temp=s.pop();
			result+=temp.getKey()+" ";
			if(temp.right!=null)
			{
				s.push(temp.right);
			}
			 if(temp.left!=null)
			{
				s.push(temp.left);
			}
			
		}
		System.out.print("Pre-order is : ");
		System.out.println(result);
	}
	
	public void inorderNonRec()
	{
		Stack<BNode> s= new Stack();
		BNode temp=root;
		BNode popNode=null;
		String r="";
		while (!s.isEmpty() || temp!=null)
		{
			while(temp!=null)
			{
				s.push(temp);
				temp=temp.left;
			}
			popNode=s.pop();
			temp=popNode.right;
			
			r=r+popNode.getKey()+" ";
				
		}
		System.out.print("In-order is : ");
		System.out.print(r);
		System.out.println();
	}
	
	public void postOrderNonRec()
	{
		BNode cur=null,prev,temp,popNode;
		Stack<BNode> s=new Stack();
		
		temp=root;
		prev=null;
		String r="";
		while(!s.isEmpty()||temp!=null)
		 {
				while(temp!=null)
				{
					s.push(temp);
					temp=temp.left;
				}
				prev=s.pop();
				
				if(prev.right!=null && prev.right!=cur)
				{	
					s.push(prev);
					temp=prev.right;
				}
				else
				{
					r=r+prev.getKey()+" ";
					cur=prev;
				}
		 }
		System.out.print("Post-order is : ");
		System.out.print(r);
	}
}
