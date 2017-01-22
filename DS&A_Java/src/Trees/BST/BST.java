package Trees.BST;

import Trees.BinaryTrees.BNode;
import sun.misc.Queue;

public class BST {
      BSTNode root;
      
      
      public void printTree() throws Exception
  	{
  		Queue<BSTNode> q=new Queue();
  	
  		q.enqueue(root);
  		
  		while(!q.isEmpty())
  		{
  		
  			BSTNode temp=q.dequeue();
  			System.out.println(temp.getData());
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
      
      public void insert(int data)
      {
    	  BSTNode newNode=new BSTNode(data);
    	  
    	  if(root==null)
    	  {
    		  root =newNode;
    		  //throw new Exception("Tree is empty");
    	  }
    	  else
    	  {
    		  BSTNode temp=root,cur=null;
    		 while(temp!=null)
    		 {
    			 cur=temp;
    			 if(temp.getData()>data)
    			 {
    				 temp=temp.left;
    				 if(temp==null)
    					 cur.left=newNode;
    			 }
    			 else
    			 {
    				 temp=temp.right;
    				 if(temp==null)
    					 cur.right=newNode;
    				 
    			 }
    	  }
      }
     }
      
      
      
      public void insertRec(int data)
      {
    	  BSTNode newNode=new BSTNode(data);
    	  callInsert(root,newNode);
    	  
      }
      
      
      
      private void callInsert(BSTNode root, BSTNode newNode) {
    	  if(root!=null)
    	  {
    		  if(root.getData()>newNode.getData())
    		  {
    			  callInsert(root.left, newNode);
    			  root.left=newNode;
    		  }
    		  else
    		  {
    			  callInsert(root.right, newNode);
    			  root.right=newNode;
    		  }
    	  }
    			
		
	}

	public BSTNode delete(int data)
      {
    	  BSTNode temp=root,prev=temp;
    	  
    	  while(temp!=null)
    	  {
    		  if(temp.getData()==data)
    		  {
    			  if(temp.left==null && temp.right==null)
    			  {
    				  temp=null;
    			  }
    			  else if(temp.left==null || temp.right==null)
    			  {
    				if(temp.left!=null)
    				{
    					if(prev.left==temp)
    					{
    						prev.left=temp.left;
    						temp=null;
    					}
    					else
    					{
    						prev.right=temp.left;
    						temp=null;
    					}
    					
    				}
    				else
    				{
    					if(prev.left==temp)
    					{
    						prev.left=temp.right;
    						temp=null;
    					}
    					else
    					{
    						prev.right=temp.right;
    						temp=null;
    					}
    					
    				}
    			  }
    			  else
    			  {
    				 BSTNode max=findMax(temp.left);
    				 temp.setData(max.getData());
    				 data=max.getData();
    				 temp=temp.left;
    				 prev=temp;
    			  }
    		  }
    		  else if(temp.getData()>data)
    		  {
    			  prev=temp;
    			  temp=temp.left;
    			  
    		  }
    		  else
    		  {		prev=temp;
    			  temp=temp.right;
   
    		  }
    		  
    	  }
    	  return null;
      }
	
	public BSTNode findMax(BSTNode root)
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
	
	public void deleteRec(int data)
	{
		BSTNode newNode=new BSTNode(data);
		callDelete(root,newNode);
		
	}

	private BSTNode callDelete(BSTNode root, BSTNode newNode) {
		
		BSTNode temp=null;
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
				temp=root;
				temp=null;
			}
		}
		else if(root.getData()>newNode.getData())
		{
			root.left=callDelete(root.left, newNode);
		}
		else
		{
		root.left=callDelete(root.right, newNode);	
		}
		
		return root;
	}
      
      
}
